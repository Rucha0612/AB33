package package1;

public class ExceptionHandling1 
{

	public static void main(String[] args) 
	{
		try
		{
		int a = 1/0;
		System.out.println("I am try block");
		}
		catch(ArithmeticException a1)
		{
			System.out.println("Exception Handled");
		}
		finally
		{
			System.out.println("Thanks for visiting the website");
		}
	}

}
