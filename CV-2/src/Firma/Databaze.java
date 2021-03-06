package Firma;

import java.util.Scanner;

public class Databaze 
{
	private String Meno;
	private int Rok_nar;
	public int Uvaz = 0;
	public static int Max_uvaz = 1;
	
	Databaze(String meno, int rok_nar)
	{
		this.Meno = meno;
		this.Rok_nar = rok_nar;
	}

	public String getMeno() {
		return Meno;
	}

	public int getRok_nar() {
		return Rok_nar;
	}
	
	public int getUvaz() {
		return Uvaz;
	}
	
	public int getMax_uvaz() {
		return Max_uvaz;
	}
	
	public static int setMax_uvaz(int max_uvaz)
	{
		return Max_uvaz = max_uvaz;
	}
	
	public boolean checkNewUvaz(int novy_uvaz)
	{
		if((Uvaz + novy_uvaz) <= Max_uvaz)
		{
			Uvaz += novy_uvaz;
			return true;
		}
		return false;
	}
	
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
	
}
