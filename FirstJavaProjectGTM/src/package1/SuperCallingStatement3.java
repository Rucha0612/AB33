package package1;
class Country
{
	Country()
	{
		System.out.println("India");
	}
}
class State extends Country
{
	State(String nameofstate)
	{
		super();  //implicit super calling statement or non-parameterized super calling statement
		System.out.println("Maharashtra");
	}
}
public class SuperCallingStatement3 extends State
{
	SuperCallingStatement3(String urban)
	{
		super("I am City");  //explicit super calling statement or parameterized super calling statement
		System.out.println("Pune");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello I am Rucha");
		new SuperCallingStatement3("rular");
	}
}
