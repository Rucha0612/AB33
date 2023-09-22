package package1;

public class SIBBlock_Class 
{
	static
	{
		System.out.println("I am SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Method"); // always SIB will execute first before main method if it is present in our program.
	}
	static
	{
		System.out.println("I am SIB 2");
	}
}
