package package1;

public class IIBBlock_Class {
	
	{
		System.out.println("I am IIB");
	}

	{
		System.out.println("I am IIB 2");
	}

	{
		System.out.println("I am IIB 3");
	}

	public static void main(String[] args) 
	{
		new IIBBlock_Class(); //we need to call IIB just by creating an Object inside main method
		System.out.println("Main Method");
		new IIBBlock_Class();
	}

}
