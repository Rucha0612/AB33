package package1;
public class ThrowandThrowsKeyward 
{
	public static void main(String[] args) throws ArithmeticException,NullPointerException
	{
		int age = 10;
		if (age<=10)
		{
			System.out.println("I am eligible");
		}
		else
		{
			throw new NullPointerException("I am not eligible");
		}
		
		if(age>18)
		{
			System.out.println("I am eligible");
		}
		else
		{
			throw new ArithmeticException("I am not eligible");
			
		}
	}
}
