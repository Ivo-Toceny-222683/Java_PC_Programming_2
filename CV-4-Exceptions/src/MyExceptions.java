
public class MyExceptions extends java.lang.Exception
{
	public MyExceptions()
	{
		super("Zadajte najprv priemer studentovi, az potom ho citajte, prosim.\n");
	}
	
	public MyExceptions(float average)
	{
		super("Snazite sa nastavit priemer mimo rozsah 0-5, prosim nastavte iny. Snazili ste sa nastavit: " + average + "\n");
	}
}