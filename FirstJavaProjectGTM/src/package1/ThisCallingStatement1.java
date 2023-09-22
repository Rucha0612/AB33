package package1;

public class ThisCallingStatement1 
{
	ThisCallingStatement1(float minimumwage)
	{
		System.out.println("300 INR");
	}
	ThisCallingStatement1(double averageweight)
	{
		this(6.06f);
		System.out.println("65KG");
	}
	ThisCallingStatement1(int averageage)
	{
		this(60.60);
		System.out.println("27");
	}
	ThisCallingStatement1()
	{
		this(40);
		System.out.println("I live in Pune");
	}
	public static void main(String[] args) 
	{
		new ThisCallingStatement1();
	}
}
