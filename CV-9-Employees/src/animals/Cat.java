package animals;

public class Cat extends AbstractAnimal
{
	Cat(byte age)
	{
		super.age = age;
	}
	
	@Override
	public void sound() 
	{
		System.out.println("Mnau mnau");
	}

}
