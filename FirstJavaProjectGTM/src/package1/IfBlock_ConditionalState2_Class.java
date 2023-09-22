package package1;
public class IfBlock_ConditionalState2_Class {
	public static void main(String[] args) 
	{
		int age = 100;
		if (age > 18)
		{
			System.out.println("I can Vote");//true
		}
		if (age < 18)
		{
			System.out.println("I can't Vote");//false
		}
		if (age >= 18)
		{
			System.out.println("I can Vote 1");//true
		}
		if (age <= 18)
		{
			System.out.println("I can't Vote");//false
		}
		if (age == 18)
		{
			System.out.println("I can Vote 2");//false
		}
		if (age != 18)
		{
			System.out.println("I can Vote Probably");//true
		}
	}

}
