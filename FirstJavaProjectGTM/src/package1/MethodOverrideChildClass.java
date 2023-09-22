package package1;

class MethodOverrideParentClass
{
	void add()
		{
			System.out.println("I am adding in Parent Class");
		}
	
}
public class MethodOverrideChildClass extends MethodOverrideParentClass
{
	void add()
	{
		super.add();
		System.out.println("I am adding in Child Class");
	}
	
	
	public static void main(String[] args) 
	{
		MethodOverrideChildClass m1 = new MethodOverrideChildClass();
		m1.add();
		
	}
}
