package animals;

public class Cow extends AbstractAnimal
{
	Cow(byte age)
	{
		super.age = age;
	}
	
	@Override
	public void sound() 
	{
		System.out.println("Muuu");
	}
}
