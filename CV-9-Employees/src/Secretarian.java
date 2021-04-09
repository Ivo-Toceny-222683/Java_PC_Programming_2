
public class Secretarian 
{
	private String nickname;
	private String email;
	private char[] password;
	private EmployeeType employeeType;
	private int age;
	
	Secretarian(String nickname, String email, char[] password, EmployeeType typ, int age)
	{
		this.nickname = nickname;
		this.email = email;
		this.password = password;
		this.employeeType = typ;
		this.age = age;
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
	
	public int getAge()
	{
		return this.age;
	}
	
	@Override
	public String toString()
	{
		return "Secretarian: " + this.getNickname() + ", email: " + this.getEmail() + ", employeeType: " + this.getEmployeeType() + ", age: " + this.age;
	}
}
