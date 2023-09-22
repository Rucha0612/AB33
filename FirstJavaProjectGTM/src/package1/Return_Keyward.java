package package1;

public class Return_Keyward 
{
	int add(int a, int b) 
	{
		int c = a+b;
		return c;
	}
	double add(int a, double b) 
	{
		double c = a+b;
		return c;
	}
	String add(int a, double b,String c) 
	{
		double d = a+b;
		return c;
	}

	public static void main(String[] args) 
	{
		Return_Keyward r1 = new Return_Keyward();
		System.out.println(r1.add(32, 48));
		System.out.println(r1.add(45, 6.6));
		System.out.println(r1.add(5, 5.5, "Rucha"));
	}

}
