
public class Employee implements Comparable<Employee>
{
	private String nickname;
	private String email;
	private char[] password;
	private EmployeeType employeeType;
	
	Employee(String nickname, String email, char[] password, EmployeeType typ)
	{
		this.nickname = nickname;
		this.email = email;
		this.password = password;
		this.employeeType = typ;
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
	
	@Override
	public int compareTo(Employee o)
	{
		String compEmail = o.email;
		return this.email.compareTo(compEmail);
	}
	
	@Override
	public String toString()
	{
		return "Employee: " + this.getNickname() + ", email: " + this.getEmail() + ", employeeType: " + this.getEmployeeType();
	}
	
}
