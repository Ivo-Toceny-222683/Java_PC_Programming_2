package priemysel;

public class Test {

	public static void main(String[] args) 
	{
		int time;
		
		Zbozi[] nakup = new Zbozi[4];
		nakup[0] = new Potravina(1, "Rohlik", 1.5);
		nakup[1] = new Naradie(24, "Klieste", 278.0);
		nakup[2] = new Potravina(6, "Chlieb", 20.8);
		nakup[3] = new Potravina(20, "Jablko", 51.0);
		
		for(int prvky = 0; prvky < nakup.length; prvky++)
		{
			time = (nakup[prvky] instanceof Potravina) ? ((Potravina)nakup[prvky]).getTrvanlivost() : ((Naradie)nakup[prvky]).getZarucnaDoba();
			System.out.println(nakup[prvky].getName() + ", cena: " + nakup[prvky].getPrice() + ", trvanlivost: " 
								 + time + " " + nakup[prvky].getJednotka());
		}
	}

}
