package package1;

interface Facebook_Auth
{
	void username();
	void password();
}

interface Facebook_Login 
{
	void un();
	void pwd();
}

public class Interface_Example6 implements Facebook_Auth,Facebook_Login
{

	public static void main(String[] args) 
	{
		Interface_Example6 a1=new Interface_Example6();
		a1.un();
		a1.username();
		a1.pwd();
		a1.password();

	}
	public void un() 
	{
		System.out.println("un for Login");
	}
	public void pwd() 
	{
		System.out.println("pwd for Login");
	}
	public void username() 
	{
		System.out.println("username for Login");
	}
	public void password() 
	{
		System.out.println("password for Login");
	}

}
