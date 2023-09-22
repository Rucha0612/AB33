package package1;

public class NestedIfStatement_Class {

	public static void main(String[] args) 
	{
		int a = 100;
		int b = 200;
		if (a==100) //100<200 true
		{
			System.out.println("true1");
			if (b==200)//true
			{
				System.out.println("true2");
				if (a==b) //100==200 false
				{
					System.out.println("true3");
				}

	         }

         }
	}
}

