package package1;

public class LogicalOperator1_Class 
{

	public static void main(String[] args) {
		
		int a=100;
		int b=200;
		int c=300;
		
		if(a>b && b>c)
		{
			System.out.println("1");
		}
		if(a>b || b>c)
		{
			System.out.println("2");
		}
		if(!(a>b && b>c))
		{
			System.out.println("3");
		}
		if(!(a>b || b>c))
		{
			System.out.println("4");
		}
	}

}
