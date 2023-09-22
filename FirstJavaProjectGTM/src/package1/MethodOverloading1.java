package package1;
public class MethodOverloading1 {
	static void add() 
	{
		System.out.println("add 1");
	}
	static void add(int a) 
	{
		System.out.println("add 2");
	}
	static void add(String a, char b) 
	{
		System.out.println("add 3");
	}
	static void add(float c) 
	{
		System.out.println("add 4");
	}
	static void add(boolean d) 
	{
		System.out.println("add 5");
	}
	static void add(double c) 
	{
		System.out.println("add 6");
	}
	public static void main(String[] args) 
	{
		add();
		add(50);
		add("Rucha",'A');
		add(2f);
		add(true);
		add(6.12);
	}
}
