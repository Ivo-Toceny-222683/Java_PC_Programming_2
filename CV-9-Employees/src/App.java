
public class App {

	public static void main(String[] args) 
	{
		char[] pass1 ={ 'a', 'b', 'c', 'd', 'e' };
		char[] pass2 ={ 'e', 'b', 'e', 'd', 'e' };
		char[] pass3 ={ 'g', '7', 'g', 'd', '2' };
		char[] pass4 ={ '5', '5', '5', '4', '4' };
		char[] pass5 ={ 'a', 'a', 'c', 'c', 'e' };
		
		char[] pass6 ={ 'b', 'a', 'b', 'a', '1' };
		char[] pass7 ={ 'd', 'i', 'v', 'k', 'a' };
		
		char[] pass8 ={ 'm', 'a', 'n', 'a', 'z' };
		
		Employee emp1 = new Employee("Jozko Hrasok", "jozko.hrasok@gmail.com", pass1, EmployeeType.ACTIVE);
		Employee emp2 = new Employee("Hana Brondzova", "brondzova@seznam.cz", pass2, EmployeeType.DELETED);
		Employee emp3 = new Employee("Ivo Koktavy", "koktavy.ivo@gmail.com", pass3, EmployeeType.ACTIVE);
		Employee emp4 = new Employee("Pavol Mitura", "mitura222@yahoo.com", pass4, EmployeeType.INACTIVE);
		Employee emp5 = new Employee("Tomas Palkovic", "t.palkovic@azet.sk", pass5, EmployeeType.ACTIVE);
		
		Secretarian sec1 = new Secretarian("Eva Papierova", "papierova@gmail.com", pass6, EmployeeType.ACTIVE, 25);
		Secretarian sec2 = new Secretarian("Marketa Taskova", "mar.task@gmail.com", pass7, EmployeeType.INACTIVE, 28);
		
		Manager<Secretarian> man1 = new Manager<Secretarian>("Marek Povrchny", "povrchny@yahoo.com", pass8, EmployeeType.ACTIVE, sec2);
		
		man1.listOfEmployees.add(emp1);
		man1.listOfEmployees.add(emp2);
		man1.listOfEmployees.add(emp3);
		man1.listOfEmployees.add(emp4);
		man1.listOfEmployees.add(emp5);
		
		man1.Employee();
		
		System.out.println("List pracujucich pre manazera " + man1.getNickname() + ":");
		for(Employee employee: man1.listOfEmployees)
		{
			System.out.println(employee);
		}
		System.out.println("Manazer: " + man1.getNickname() + " ma vztah s: " + man1.getListOfRelationships().getNickname());
		
	}

}
