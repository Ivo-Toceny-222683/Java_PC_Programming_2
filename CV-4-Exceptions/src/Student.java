
public class Student {
	public Student(String jmeno, int rocnik)
	{
		this.jmeno=jmeno;
		this.rocnik=rocnik;
	}
	
	public String getJmeno()
	{
		return jmeno;
	}
	
	public int getRocnik()
	{
		return rocnik;
	}
	
	//If name is not inside database, its taken care of inside test when calling these methods by .containsKey(name)
	public float getStudijniPrumer() throws MyExceptions
	{
		if(studijniPrumer == 0)
		{
			throw new MyExceptions("Najprv zadajte priemer pre studenta: " + this.jmeno + ", nasledne vypiste databazu\n");
		}
		else
		{
			return studijniPrumer;
		}				
	}

	public void setStudijniPrumer(float studijniPrumer) throws MyExceptions
	{
		if(studijniPrumer < 1 || studijniPrumer > 5)
		{
			throw new MyExceptions(studijniPrumer);
		}
		else
		{
			this.studijniPrumer = studijniPrumer;
		}		
	}

	private String jmeno;
	private int rocnik;
	private float studijniPrumer;
}