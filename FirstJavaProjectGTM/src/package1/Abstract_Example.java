package package1;
abstract class Authentication1
{
	abstract void username();
	
	static void add()
	{
		System.out.println("I am adding");
	}
	void sub()
	{
		System.out.println("I am subtracting");
	}
}
public class Abstract_Example extends Authentication1
{
	static void mul()
	{
		System.out.println("I am multiplying");
	}
	void div()
	{
		System.out.println("I am dividing");
	}   
	public static void main(String[] args) 
	{
		mul();
		Abstract_Example a1 = new Abstract_Example();
		a1.div();
		add();
		a1.sub();
		a1.username();
	}
	void username() 
	{
		System.out.println("I am abstract method");
		
	}
}
