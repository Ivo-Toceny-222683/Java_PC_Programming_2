package animals;

import java.io.IOException;

/**
* Abstraktne classy by sa skor mali vyuzivat pre objekty ktore su velmi podobne funkcionalitou dedenym s doplnenim nejakych veci naviac. 
* 
* Interface je skor mensi subor, kde funkcionalita sa moc nevztahuje k implementujucim classam, kde dany interface je viac pouzitelny napriek viacerymi projektmi.
* Boli ale spravene kvoli problemom, ktore nastavali pri viacerom dedeni a riesia takto velmi tazke problemy ak by sa chcelo dedit z viacerych class, comu bolo
* zabranene v jave
* 
* Co sa tyka enumeracie, je rychlejsia na kompilaciu, kedze mame konstanty, nevznikaju problemy pri kontrole stringov a zlom zadani stringu nechtiac, 
* vacsia kontrola a viditelnost v kode
*
* @author  Ivo Toceny
*/
public class App {

	public static void main(String[] args)
	{
		AbstractAnimal[] animals = new AbstractAnimal[5];
		byte[] age = {5, 4, 8, 12, 3};
		
		animals[0] = new Cat(age[0]);
		animals[1] = new Dog(age[1]);
		animals[2] = new Pig(age[2]);
		animals[3] = new Cow(age[3]);
		animals[4] = new Goat(age[4]);
		
		System.out.println("Abstract class:");
		for(AbstractAnimal animal: animals)
		{
			animal.sound();	
		}
		
		Animal[] animals2 = new Animal[5];
		byte[] age2 = {2, 9, 15, 10, 4};
		
		animals2[0] = new CatImpl(age2[0]);
		animals2[1] = new DogImpl(age2[1]);
		animals2[2] = new PigImpl(age2[2]);
		animals2[3] = new CowImpl(age2[3]);
		animals2[4] = new GoatImpl(age2[4]);
		
		System.out.println("\nInterface:");
		for(Animal animal: animals2)
		{
			System.out.print(animal.toString() + " makes sound: ");
			animal.sound();	
		}
			
		try
		{
			((CatImpl)animals2[0]).AddToFile("Animals.txt");
			((DogImpl)animals2[1]).AddToFile("Animals.txt");
			((PigImpl)animals2[2]).AddToFile("Animals.txt");
			((CowImpl)animals2[3]).AddToFile("Animals.txt");
			((GoatImpl)animals2[4]).AddToFile("Animals.txt");
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}

}
