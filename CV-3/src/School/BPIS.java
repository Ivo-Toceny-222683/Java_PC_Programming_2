package School;

public class BPIS implements Predmet
{
	private String name = "Praktikum z informacnych siti";
	private int score = 0;
	
	public String getSubjectName()
	{
		return name;
	}
	
	public int getScore()
	{
		return score;
	}
	
	public String getDone()
	{
		return (score >= Predmet.minScore)? "udelen":"neudelen";
	}
	
	public void addZapocet()
	{
		score = 15;
	}
}
