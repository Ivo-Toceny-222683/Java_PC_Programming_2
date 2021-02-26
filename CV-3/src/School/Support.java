package School;

import java.util.Scanner;

public class Support
{	
	public static int scanForInt()
	{
		Scanner sc = new Scanner(System.in);
		
		while (!sc.hasNextInt())
		{
			System.out.println("Zadajte prosim cislo:");
			sc.next();
		}
		int input = sc.nextInt();	
		
		return input;
	}
	
	public static String scanForString()
	{
		Scanner sc = new Scanner(System.in);
		
		while (!sc.hasNext("nie") && !sc.hasNext("ano"))
		{
			System.out.println("Zadajte prosim znovu odpoved v tvare (ano/nie):");
			sc.next();
		}
		String input = sc.next();	
		
		return input;
	}
	
	public static void doBPC1(BPC1 pc1)
	{
		int input;
		String check;
		
		do
		{
			System.out.println("BPC1 cvika, pocet bodov k pridaniu:");
			input = scanForInt();
			pc1.addPracticePoints(input);
			System.out.println("Chcete pridat znovu body? (ano/nie):");
			check = Support.scanForString();
		}
		while(!check.equals("nie"));
		
		System.out.println("\nBPC1 skuska, zadajte pocet bodov:");
		input = scanForInt();
		pc1.addExamPoints(input);
	}
	
	public static void doBPC2(BPC2 pc2)
	{
		int input;
		
		System.out.println("\nBPC2 projekt, zadajte pocet bodov:");
		input = scanForInt();
		pc2.addProjectPoints(input);
		
		System.out.println("\nBPC2 polsemestralny test, zadajte pocet bodov:");
		input = scanForInt();
		pc2.addHalfExamPoints(input);
		
		System.out.println("\nBPC2 skuska, zadajte pocet bodov:");
		input = scanForInt();
		pc2.addExamPoints(input);
	}
	
	public static void doBPIS(BPIS bpis)
	{
		String check;
		
		System.out.println("BPIS, chcete pridelit zapocet? (ano/nie):");
		check = Support.scanForString();
		if(check.equals("ano"))
		{
			bpis.addZapocet();
		}
	}
	
	public static void doResult(BPC1 pc1, BPC2 pc2, BPIS bpis)
	{
		System.out.println("\n" + pc1.getSubjectName() + ":");
		System.out.println("Body: " + pc1.getScore() + "/100");
		System.out.println("Zapocet: " + pc1.getDone() + "\n");
		
		System.out.println(pc2.getSubjectName() + ":");
		System.out.println("Body: " + pc2.getScore() + "/100");
		System.out.println("Zapocet: " + pc2.getDone() + "\n");
		
		System.out.println(bpis.getSubjectName() + ":");
		System.out.println("Zapocet: " + bpis.getDone() + "\n");
	}
}
