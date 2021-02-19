import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Zadaj cislo:");
		
		Scanner sc = new Scanner(System.in);
		int a;
		
		while (!sc.hasNextInt())
		{
			System.out.println("Zadal si nieco ine ako cislo, zadaj cislo:");
			sc.next();
		}
		a = sc.nextInt();
		
		boolean check = true;
		for (int i = 2; i < a; i++)
		{
			if(a % i == 0)
			{
				System.out.println(a + " nie je prvocislo.");
				check = false;
				break;
			}
		}		
		if(check)
		{
			System.out.println(a + " je prvocislo.");
		}
	}
}
