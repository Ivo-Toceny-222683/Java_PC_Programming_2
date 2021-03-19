
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
	
	public float getStudijniPrumer() throws MyExceptions
	{
		if(studijniPrumer == 0)
		{
			throw new MyExceptions();
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