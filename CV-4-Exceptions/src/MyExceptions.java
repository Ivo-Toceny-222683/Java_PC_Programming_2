
public class MyExceptions extends java.lang.Exception
{
	//Was needed because of warning
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MyExceptions(String message)
	{
		super(message);
	}
	
	public MyExceptions(float average)
	{
		super("Snazite sa nastavit priemer mimo rozsah 0-5, prosim nastavte iny. Snazili ste sa nastavit: " + average + "\n");
	}
}
