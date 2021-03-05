import java.util.InputMismatchException;
import java.util.Scanner;


public class Test {

	public static int pouzeCelaCisla(Scanner sc) 
	{
		int cislo = 0;
		try
		{
			cislo = sc.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Nastala vyjimka typu "+e.toString());
			System.out.println("zadejte prosim cele cislo ");
			sc.nextLine();
			cislo = pouzeCelaCisla(sc);
		}
		return cislo;
	}
	


	public static void main(String[] args){	
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Databaze mojeDatabaze=new Databaze(1);
		int idx;
		float prumer;
		int volba;
		boolean run=true;
		while(run)
		{
			System.out.println("Vyberte pozadovanou cinnost:");
			System.out.println("1 .. vytvoreni nove databaze");
			System.out.println("2 .. vlozeni noveho studenta");
			System.out.println("3 .. nastaveni prumeru studenta");
			System.out.println("4 .. vypis informace o studentovi");
			System.out.println("5 .. ukonceni aplikace");
			volba=pouzeCelaCisla(sc);
			switch(volba)
			{
				case 1:
					// InputMisMatchException if we set sth else than number, 
					// Negative array size makes another Exception
					try
					{
						System.out.println("Zadejte pocet studentu");
						mojeDatabaze=new Databaze(sc.nextInt());
						break;
					}
					catch(InputMismatchException e)
					{
						System.out.println("Nastala vyjimka typu: " +e.toString() + 
								". \nZadajte prosim cislo, nie ine znaky, vracim spatky do menu.\n");
						sc.nextLine();
						break;
					}
					catch(NegativeArraySizeException e)
					{
						System.out.println("Nastala vyjimka typu: " +e.toString() + 
								", \nzadavajte kladne nezaporne cisla prosim, vracim spatky do menu.\n");
						sc.nextLine();
						break;
					}
				case 2:
					// InputMismatch - if age set as sth else than number, 
					// ArrayIndexOutOfBounds - if we add more students than is lenght of database
					try
					{
						mojeDatabaze.setStudent();
						break;
					}
					catch(InputMismatchException e)
					{
						System.out.println("Nastala vyjimka typu "+e.toString() + 
								",\npouzite cisla nie ine znaky prosim, vracim spatky do menu.\n");
						sc.nextLine();
						break;
					}
					catch(ArrayIndexOutOfBoundsException e)
					{
						System.out.println("Nastala vyjimka typu "+e.toString() + 
								", \ntolko priestoru nemame, zvacsite najprv databazu, vracim spatky do menu.\n");
						sc.nextLine();
						break;
					}
				case 3:
					System.out.println("Zadejte index a prumer studenta");
					// NullPointer - if we try to assing value to non existent student yet inside array bounds, 
					// OutOfBounds - try to assign outside of array
					// InputMismatch - if average is sth else than number
					try
					{
						idx=sc.nextInt();
						prumer =sc.nextFloat();
						mojeDatabaze.setPrumer(idx,prumer);
						break;
					}
					catch(NullPointerException e)
					{
						System.out.println("Nastala vyjimka typu "+e.toString() + 
								", \nnajprv musite vytvorit studenta aby ste mohli pridavat prumer, vracim spatky do menu.\n");
						sc.nextLine();
						break;
					}
					catch(ArrayIndexOutOfBoundsException e)
					{
						System.out.println("Nastala vyjimka typu "+e.toString() + 
								", \ntolko studentov nemame, vyberte mensie cislo, vracim spatky do menu.\n");
						sc.nextLine();
						break;
					}
					catch(InputMismatchException e)
					{
						System.out.println("Nastala vyjimka typu "+e.toString() + 
								",\npouzite cisla nie ine znaky prosim pre nastavenie priemeru, vracim spatky do menu.\n");
						sc.nextLine();
						break;
					}
					catch(MyExceptions e)
					{
						System.out.println(e.toString());
						sc.nextLine();
						break;
					}
					
				case 4:
					System.out.println("Zadejte index studenta");
					idx=sc.nextInt();
					// Array out of bounds if number below 0 or higher than number of students also, 
					// NullPointer - if inside array but student not made yet
					// InputMismatch - if index is set as not a number
					try
					{
						Student info=mojeDatabaze.getStudent(idx);
						System.out.println("Jmeno: " + info.getJmeno() + 
								" rok narozeni: " + info.getRocnik() + " prumer: " + info.getStudijniPrumer() + "\n");
						break;
					}
					catch(ArrayIndexOutOfBoundsException e)
					{
						System.out.println("Nastala vyjimka typu "+e.toString() +
								", \ntolko studentov nemame, vyberte mensie cislo, vracim spatky do menu.\n");
						sc.nextLine();
						break;
					}
					catch(NullPointerException e)
					{
						System.out.println("Nastala vyjimka typu "+e.toString() + 
								", \nnajprv musite vytvorit studenta aby ste mohli vypisovat, vracim spatky do menu.\n");
						sc.nextLine();
						break;
					}
					catch(InputMismatchException e)
					{
						System.out.println("Nastala vyjimka typu "+e.toString() + 
								",\npouzite cisla nie ine znaky prosim, vracim spatky do menu.\n");
						sc.nextLine();
						break;
					}
					catch(MyExceptions e)
					{
						System.out.println(e.toString());
						sc.nextLine();
						break;
					}
					
				case 5:
					run=false;
					break;
			}
			
		}
	}

}
