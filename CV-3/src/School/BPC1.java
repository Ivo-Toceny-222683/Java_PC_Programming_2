package School;

public class BPC1 implements Predmet
{
	private String name = "Pocitace a programovanie 1";
	private int score = 0;
	private int practice = 0;
	private int exam = 0;
	
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
	
	public void addPracticePoints(int points)
	{
		if(practice + points <= 20)
		{
			practice += points;
			score = practice + exam;
		}
		else
		{
			System.out.println("Couldnt add points, overreaching maximum");
		}
	}
	
	public void addExamPoints(int points)
	{
		if(points <= 80 && points >= 0)
		{
			exam = points;
			score = practice + exam;
		}
		else
		{
			System.out.println("Couldnt add points, overreaching 80 or less than 0");
		}		
	}
}
