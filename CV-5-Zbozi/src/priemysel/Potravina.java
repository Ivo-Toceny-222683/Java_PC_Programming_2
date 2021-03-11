package priemysel;

public class Potravina extends Zbozi
{
	private int trvanlivost;
	Potravina(int trvanlivost, String name, double price)
	{
		super(name, price);
		this.trvanlivost = trvanlivost;
	}
	
	public int getTrvanlivost()
	{
		return trvanlivost;
	}
	
	public void setTrvanlivost(int trvanlivost)
	{
		this.trvanlivost = trvanlivost;
	}
	
	public String getJednotka()
	{
		return "dni";
	}
}
