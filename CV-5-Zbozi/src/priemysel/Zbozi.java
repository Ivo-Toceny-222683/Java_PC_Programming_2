package priemysel;

public abstract class Zbozi
{
	private String name;
	private double price;
	private static double dph = 0.21;
	
	Zbozi(String name, double price)
	{
		this.name = name;
		this.price = price;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public double getPrice()
	{
		return price + price*dph;
	}
	
	public void setPrice(double price)
	{
		if(price >= 0)
		{
			this.price = price;
		}	
	}
	
	public abstract String getJednotka();
}
