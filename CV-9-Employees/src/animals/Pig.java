package animals;

public class Pig extends AbstractAnimal
{
	Pig(byte age)
	{
		super.age = age;
	}
	
	@Override
	public void sound() 
	{
		System.out.println("Oink oink");
	}
}
