package package1;

public class SIBIIBBConstructorlocks_Class 

{
	SIBIIBBConstructorlocks_Class()
	{
		System.out.println("I am Constructor");
	}
	static
	{
		System.out.println("I am SIB");
	}
	{
		System.out.println("I am IIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Method"); // SIB will execute automatically no need to call it inside main method
		new SIBIIBBConstructorlocks_Class(); // IIB and Constructor will called only by creating an Object
		// first always SIB will execute after that main method.
		// first IIB will execute and then Constructor

	}

}
