package package1;
public class IfElseIf_ConditionalState2_Class 
{
	public static void main(String[] args) {	
		int a = 100;
		int b = 200;
		if (a>b) //100>200 false
		{
			System.out.println("1");
		} 
		else if (b==20) //200==20 false
		{
			System.out.println("2");
		}
		else if (b>a) //true
		{
			System.out.println("3");
		}
		else if (a!=b) //true
		{
			System.out.println("4");
		}
		else if (!(a==b))//true
		{
			System.out.println("5");
		}
		else
		{
			System.out.println("6");
		}
	}
}
