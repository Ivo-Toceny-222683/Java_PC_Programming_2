import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Manager<T>
{
	private String nickname;
	private String email;
	private char[] password;
	private EmployeeType employeeType;
	public List<Employee> listOfEmployees = new ArrayList<>();
	private T  listOfRelationships;
	
	Manager(String nickname, String email, char[] password, EmployeeType typ, T listofrel)
	{
		this.nickname = nickname;
		this.email = email;
		this.password = password;
		this.employeeType = typ;
		this.listOfRelationships = listofrel;
	}
	
	public String getNickname() 
	{
		return this.nickname;
	}
	
	public String getEmail()
	{
		return this.email;
	}
	
	public EmployeeType getEmployeeType()
	{
		return this.employeeType;
	}
	
	public T getListOfRelationships()
	{
		return this.listOfRelationships;
	}
	
	public void Employee()
	{
		Collections.sort(listOfEmployees);
	}
	
	@Override
	public String toString()
	{
		return "Manazer: " + this.getNickname() + ", email: " + this.getEmail() + ", employeeType: " + this.getEmployeeType() + ", relationship with: " + this.getListOfRelationships();
	}
	
}
