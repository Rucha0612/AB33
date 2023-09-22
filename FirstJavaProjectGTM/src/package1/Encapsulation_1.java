package package1;
class Authentication_1
{
	private String username="vaidyarucha4@gmail.com";
	public String get_username() //getter method
	{
		return username;
	}
	public void set_username(String username) //setter method
	{
		this.username=username;
	}
	private String password="Rucha@0612";
	public String getPassword() //getter method
	{
		return password;
	}
	public void setPassword(String password) //setter method
	{
		this.password = password;
	}
	private int age=60;
	public int getage() //getter method
	{
		return age;
	}
	public void setage(int age) //setter method
	{
		this.age = age;
	}
	private int salary=60;
	public int getSalary() 
	{
		return salary;
	}
	public void setSalary(int salary) 
	{
		this.salary = salary;
	}
}
public class Encapsulation_1 
{
	public static void main(String[] args) 
	{
		Authentication_1 a1 = new Authentication_1();
		a1.set_username("ruchavaidya@gmail.com");
		System.out.println(a1.get_username());
		a1.setPassword("12345678");
		System.out.println(a1.getPassword());
		a1.setage(66);
		System.out.println(a1.getage());
		a1.setSalary(25000);
		System.out.println(a1.getSalary());
	}
}
