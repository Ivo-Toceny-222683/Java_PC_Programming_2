package School;

public class BPC2 implements Predmet
{
	private String name = "Pocitace a programovanie 2";
	private int score = 0;
	private int project = 0;
	private int halfExam = 0;
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
	
	public void addHalfExamPoints(int points)
	{
		if(points <= 20 && points >= 0)
		{
			halfExam = points;
			score = exam + project + halfExam;
		}
		else
		{
			System.out.println("Couldnt add points, overreaching 20 or less than 0");
		}		
	}
	
	public void addExamPoints(int points)
	{
		if(points <= 50 && points >= 0)
		{
			exam = points;
			score = exam + project + halfExam;
		}
		else
		{
			System.out.println("Couldnt add points, overreaching 50 or less than 0");
		}		
	}
	
	public void addProjectPoints(int points)
	{
		if(points <= 30 && points >= 0)
		{
			project = points;
			score = exam + project + halfExam;
		}
		else
		{
			System.out.println("Couldnt add points, overreaching 20 or less than 0");
		}		
	}
}
