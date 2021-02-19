package Firma;

import java.util.Scanner;

public class DatabaseOperation
{
	public static void main(String[] args) 
	{
		int indexOsoby;
		int novaVyskaUvaz;
		
		Databaze[] osoby = new Databaze[3];
		
		osoby[0] = new Databaze("Jozko Mrkvicka", 1999);
		osoby[1] = new Databaze("Ferko Hrasok", 1990);
		osoby[2] = new Databaze("Marienka Papierova", 2002);
		
		System.out.println("Zadajte maximalnu povolenu vysku uvazu:");
		Databaze.Max_uvaz = Databaze.scanForInt();
		
		while(true)
		{		
			
			System.out.println("Zadajte index osoby (0/1/2):");
			indexOsoby = Databaze.scanForInt();
			if(!(indexOsoby < 3 && indexOsoby > -1))
			{
				continue;
			}
			
			System.out.println("Zadajte novu vysku uvazu:");
			novaVyskaUvaz = Databaze.scanForInt();
			
			System.out.print("Meno: " + osoby[indexOsoby].getMeno() + ", RokNarodenia: " + osoby[indexOsoby].getRok_nar() + ", Plat: ");
			
			if(osoby[indexOsoby].checkNewUvaz(novaVyskaUvaz))
			{
				System.out.println(osoby[indexOsoby].getUvaz());
			}
			else
			{
				System.out.println("Prekrocenie maximalneho uvazku");
			}
		}
	}

}
