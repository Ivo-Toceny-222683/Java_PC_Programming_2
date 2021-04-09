package animals;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class GoatImpl implements Animal
{
	public byte age;
	
	GoatImpl(byte age)
	{
		this.age = age;
	}
	
	@Override
	public void sound()
	{
		System.out.println("Mee meee");
	}
	
	@Override
	public String toString()
	{
		return "Goat of age: " + this.age + ""; 
	}
	
	public void AddToFile(String name) throws IOException
	{
		File f = new File(name);
		FileOutputStream txt = new FileOutputStream(f, true);
		String temp = this.toString() + "\n";
		
		byte b[] = temp.getBytes();
		txt.write(b);
		
		txt.close();
	}
}
