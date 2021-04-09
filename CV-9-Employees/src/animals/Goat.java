package animals;

public class Goat extends AbstractAnimal
{
	Goat(byte age)
	{
		super.age = age;
	}
	
	@Override
	public void sound() 
	{
		System.out.println("Meee mee");
	}
}
