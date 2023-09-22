package package1;

public class Return_Keyward2 
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
	float add(float a, float b)
	{
		float c = a+b;
		return c;
	}
	char add(char a, char b)
	{
		char d = a;
		return d;
	}
	String add(int a, double b,String c) 
	{
		double d = a+b;
		return c;
	}
	public static void main(String[] args) 
	{
		Return_Keyward2 r1 = new Return_Keyward2();
		System.out.println(r1.add(32, 48));
		System.out.println(r1.add(32, 48.5));
		System.out.println(r1.add(45f, 6.6f));
		System.out.println(r1.add('A','B'));
		System.out.println(r1.add(5,6.6,"Rucha"));
	}

}
