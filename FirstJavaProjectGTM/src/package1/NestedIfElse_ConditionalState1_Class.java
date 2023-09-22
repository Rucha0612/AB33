package package1;

public class NestedIfElse_ConditionalState1_Class 
{

	public static void main(String[] args) 
	{
		
		int a = 100;
		int b = 200;
		if (a<b) //100<200 true
		{
			if (a!=b)
			{
				System.out.println("3");
			}
			else
			{
				System.out.println("2");
			}
		}
		else 
		{
			System.out.println("1");
		}
		
	}

}
