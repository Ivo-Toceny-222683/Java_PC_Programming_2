package animals;

public class Dog extends AbstractAnimal
{
	Dog(byte age)
	{
		super.age = age;
	}
	
	@Override
	public void sound() 
	{
		System.out.println("Hau hau");
	}
}
