package package1;

public class LocalGlobalVariable2 
{
	static double pi = 3.14;
	int c=100;
	static void area()
	{
		int r = 10;
		double area = pi*r*r;
		System.out.println(area);
	}
	public static void main(String[] args) 
	{
		area();
		pi = 9;
		int r = 100;
		double area = pi*r*r;
		System.out.println(area);
		LocalGlobalVariable2 c1 = new LocalGlobalVariable2();
		System.out.println(c1.c);
		System.out.println(pi);
	}
}
