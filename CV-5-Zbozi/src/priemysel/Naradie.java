package priemysel;

public class Naradie extends Zbozi
{
	private int zarucnaDoba;
	
	Naradie(int zarucnaDoba, String name, double price)
	{
		super(name, price);
		this.zarucnaDoba = zarucnaDoba;
	}
	
	public int getZarucnaDoba()
	{
		return zarucnaDoba;
	}

	public void setZarucnaDoba(int zarucnaDoba) 
	{
		this.zarucnaDoba = zarucnaDoba;
	}

	public String getJednotka()
	{
		return "mesiacov";
	}
}
