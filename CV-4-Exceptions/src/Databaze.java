import java.io.File;
import java.util.HashMap;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Databaze {
	public void setStudent()
	{
		System.out.println("Zadejte jmeno studenta, rok narozeni");
		String jmeno=sc.next();
		int rok=sc.nextInt();
		prvkyDatabaze.put(jmeno, new Student(jmeno,rok));
	}
	
	public Student getStudent(String meno)
	{
		return prvkyDatabaze.get(meno);
	}
	
	public void setPrumer(String meno, float prumer) throws MyExceptions
	{
		prvkyDatabaze.get(meno).setStudijniPrumer(prumer);
	}
	
	public void PrintDatabase() throws MyExceptions
	{
		for(String name : prvkyDatabaze.keySet())
		{
			System.out.println("Jmeno: " + name + 
					", rok narozeni: " + prvkyDatabaze.get(name).getRocnik() + ", prumer: " + prvkyDatabaze.get(name).getStudijniPrumer());
		}
	}
	
	public FileOutputStream FileDatabaseFill(String name) throws MyExceptions, IOException
	{
		String s;
		byte b[];
		
		File f = new File(name);
		FileOutputStream txt = new FileOutputStream(f, false);	
		for(String meno : prvkyDatabaze.keySet())
		{
			s = "Jmeno: " + meno + ", rok narozeni: " + 
					prvkyDatabaze.get(meno).getRocnik() + ", prumer: " + prvkyDatabaze.get(meno).getStudijniPrumer() + "\n";
			b =s.getBytes();
			txt.write(b);
		}
		return txt;
	}
	
	public void getDatabase(String name) throws IOException, NumberFormatException, MyExceptions
	{
		List<String> lines = Files.lines(Paths.get(name)).collect(Collectors.toList());
		String[] elements;
				
		prvkyDatabaze= new HashMap<String, Student>();
		for(int index = 0; index < lines.size(); index++)
		{
			elements = lines.get(index).split(",", 3);
			elements[0] = elements[0].replace("Jmeno: ", "");
			elements[1] = elements[1].replace(" rok narozeni: ", "");
			elements[2] = elements[2].replace(" prumer: ", "");
			
			prvkyDatabaze.put(elements[0], new Student(elements[0], Integer.parseInt(elements[1])));
			prvkyDatabaze.get(elements[0]).setStudijniPrumer((Float.parseFloat(elements[2])));
		}
	}
	
	public void PrintNames()
	{
		System.out.println("Names:");
		for(String name : prvkyDatabaze.keySet())
		{
			System.out.println(name);
		}
	}
	
	public void DeleteStudent(String name) throws MyExceptions
	{
		if(prvkyDatabaze.containsKey(name))
		{
			prvkyDatabaze.remove(name);
		}
		else
		{
			throw new MyExceptions("Databaza neobsahuje studenta s menom: " + name + "\n");
		}
	}
	
	public HashMap<String, Student> getPrvkyDatabaze()
	{
		return prvkyDatabaze;
	}
	
	private Scanner sc = new Scanner(System.in);
	private HashMap<String, Student> prvkyDatabaze = new HashMap<String, Student>();
}