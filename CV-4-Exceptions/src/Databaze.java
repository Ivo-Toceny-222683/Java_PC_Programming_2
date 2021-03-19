import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Databaze {
	public Databaze(int pocetPrvku)
	{
		prvkyDatabaze=new Student[pocetPrvku];
		sc=new Scanner(System.in);
	}
	
	public void setStudent()
	{
		System.out.println("Zadejte jmeno studenta, rok narozeni");
		String jmeno=sc.next();
		int rok=sc.nextInt();
		prvkyDatabaze[posledniStudent++]=new Student(jmeno,rok);
	}
	
	public Student getStudent(int idx)
	{
		return prvkyDatabaze[idx];
	}
	
	public void setPrumer(int idx, float prumer) throws MyExceptions
	{
		prvkyDatabaze[idx].setStudijniPrumer(prumer);
	}
	
	public void PrintDatabase() throws MyExceptions
	{
		for(int index = 0; index < prvkyDatabaze.length; index++)
		{
			System.out.println("Jmeno: " + prvkyDatabaze[index].getJmeno() + 
					", rok narozeni: " + prvkyDatabaze[index].getRocnik() + ", prumer: " + prvkyDatabaze[index].getStudijniPrumer());
		}
	}
	
	public FileOutputStream FileDatabaseFill(String name) throws MyExceptions, IOException
	{
		String s;
		byte b[];
		
		File f = new File(name);
		FileOutputStream txt = new FileOutputStream(f, false);
		for(int index = 0; index < prvkyDatabaze.length; index++)
		{
			s = "Jmeno: " + prvkyDatabaze[index].getJmeno() + 
					", rok narozeni: " + prvkyDatabaze[index].getRocnik() + ", prumer: " + prvkyDatabaze[index].getStudijniPrumer() + "\n";
			b =s.getBytes();
			txt.write(b);
		}
		return txt;
	}
	
	public void getDatabase(String name) throws IOException, NumberFormatException, MyExceptions
	{
		List<String> lines = Files.lines(Paths.get(name)).collect(Collectors.toList());
		String[] elements;
				
		prvkyDatabaze=new Student[lines.size()];
		for(int index = 0; index < lines.size(); index++)
		{
			elements = lines.get(index).split(",", 3);
			elements[0] = elements[0].replace("Jmeno: ", "");
			elements[1] = elements[1].replace(" rok narozeni: ", "");
			elements[2] = elements[2].replace(" prumer: ", "");
			
			prvkyDatabaze[index] = new Student(elements[0], Integer.parseInt(elements[1]));
			prvkyDatabaze[index].setStudijniPrumer(Float.parseFloat(elements[2]));
		}
	}
	private Scanner sc;
	private Student [] prvkyDatabaze;
	private int posledniStudent;
}