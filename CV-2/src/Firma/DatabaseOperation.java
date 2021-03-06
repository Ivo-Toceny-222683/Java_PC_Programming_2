package Firma;

public class DatabaseOperation
{
	public static void main(String[] args) 
	{
		int indexOsoby;
		int novaVyskaUvaz;
		
		Databaze[] osoby = new Databaze[3];
		String[] mena = new String[] {"Jozko Mrkvicka", "Ferko Hrasok", "Marienka Papierova"};
		int[] roky = new int[] {1999, 1990, 2002};
		
		for(int i = 0; i < osoby.length; i++)
		{
			osoby[i] = new Databaze(mena[i], roky[i]);
		}
		
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
				if(osoby[indexOsoby].Uvaz == Databaze.Max_uvaz)
				{
					System.out.println(osoby[indexOsoby].getUvaz() + ", MAXIMALNY UVAZOK!");
				}
				else
				{
					System.out.println(osoby[indexOsoby].getUvaz());
				}		
			}
			else
			{
				System.out.println("Prekrocenie maximalneho uvazku!");
			}
		}
	}

}
