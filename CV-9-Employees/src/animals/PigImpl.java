package animals;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class PigImpl implements Animal
{
	public byte age;
	
	PigImpl(byte age)
	{
		this.age = age;
	}
	
	@Override
	public void sound()
	{
		System.out.println("Oink oiink");
	}
	
	@Override
	public String toString()
	{
		return "Pig of age: " + this.age + ""; 
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
