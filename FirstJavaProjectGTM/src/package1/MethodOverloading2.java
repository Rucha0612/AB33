package package1;

public class MethodOverloading2 {

	static void add() 
	{
		System.out.println("add 1");
	}
	void add(int a) 
	{
		System.out.println("add 2");
	}
	void add(String a, char b) 
	{
		System.out.println("add 3");
	}
	void add(float c) 
	{
		System.out.println("add 4");
	}
	void add(boolean d) 
	{
		System.out.println("add 5");
	}
	void add(double e) 
	{
		System.out.println("add 6");
	}

	public static void main(String[] args) 
	{
		MethodOverloading2 f = new MethodOverloading2();
	    add();
		f.add(60);
		f.add("Rucha", 'R');
		f.add(6f);
		f.add(true);
		f.add(9.9);

	}

}
