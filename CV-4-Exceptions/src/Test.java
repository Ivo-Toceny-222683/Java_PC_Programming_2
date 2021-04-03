import java.io.FileOutputStream;
import java.io.IOException;
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
		FileOutputStream file = null;
		Scanner sc= new Scanner(System.in);
		Databaze mojeDatabaze = new Databaze();
		String jmeno;
		float prumer;
		int volba;
		boolean run=true;
		while(run)
		{
			System.out.println("Vyberte pozadovanou cinnost:");
			System.out.println("1 .. vlozeni noveho studenta");
			System.out.println("2 .. vymazanie studenta");
			System.out.println("3 .. nastaveni prumeru studenta");
			System.out.println("4 .. vypis informace o studentovi");
			System.out.println("5 .. vypis mien vsetkych studentov");
			System.out.println("6 .. vypis databaze");
			System.out.println("7 .. vypis celej databaze do suboru");
			System.out.println("8 .. vpis celej databaze zo suboru");
			System.out.println("9 .. ukonceni aplikace");
			volba=pouzeCelaCisla(sc);
			switch(volba)
			{
				case 1:
					// InputMismatch - if age set as sth else than number, 
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
				case 2:
					System.out.println("Zadejte jmeno studenta na vymazanie");
					try
					{
						jmeno=sc.next();
						mojeDatabaze.DeleteStudent(jmeno);
						break;
					}
					catch(MyExceptions e)
					{
						System.out.println(e.toString());
						break;
					}
				case 3:
					System.out.println("Zadejte jmeno a prumer studenta");
					// InputMismatch - if average is sth else than number
					// MyException - if there was not set average before or it checks name before getting average, 
					//               if its not in database, case returns to main menu
					try
					{
						jmeno=sc.next();
						prumer =sc.nextFloat();
						if(mojeDatabaze.getPrvkyDatabaze().containsKey(jmeno))
						{
							mojeDatabaze.setPrumer(jmeno,prumer);
							break;
						}
						else
						{
							throw new MyExceptions("Student s menom " + jmeno + " nie je v databaze.\n");
						}
						
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
					System.out.println("Zadejte jmeno studenta");
					jmeno=sc.next(); 
					// InputMismatch - if index is set as not a number
					try
					{
						Student info=mojeDatabaze.getStudent(jmeno);
						System.out.println("Jmeno: " + info.getJmeno() + 
								", rok narozeni: " + info.getRocnik() + ", prumer: " + info.getStudijniPrumer() + "\n");
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
					mojeDatabaze.PrintNames();
					break;
					
				case 6:
					try
					{
						mojeDatabaze.PrintDatabase();
						break;
					}
					catch(MyExceptions e)
					{
						System.out.println(e.toString());
						sc.nextLine();
						break;
					}

				case 7:
					try
					{
						file = mojeDatabaze.FileDatabaseFill("pokus.txt");
						break;
					}
					catch(MyExceptions e)
					{
						System.out.println(e.toString());
						sc.nextLine();
						break;
					}
					catch(IOException e)
					{
						System.out.println(e.toString());
						sc.nextLine();
						break;
					}
					finally
					{
						try
						{
							file.close();
						} 
						catch (IOException e)
						{				
							System.out.println(e.toString());
						}
					}
				case 8:
					try
					{
						mojeDatabaze.getDatabase("pokus.txt");
						break;
					}
					catch(IOException e)
					{
						System.out.println(e.toString());
						sc.nextLine();
						break;
					}
					catch(MyExceptions e)
					{
						System.out.println(e.toString());
						sc.nextLine();
						break;
					}
					catch(NumberFormatException e)
					{
						System.out.println(e.toString());
						sc.nextLine();
						break;
					}
				case 9:
					run=false;
					break;
					
				
			}
			
		}
	}

}
