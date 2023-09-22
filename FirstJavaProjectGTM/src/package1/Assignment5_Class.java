package package1;
public class Assignment5_Class {
	Assignment5_Class()
	{
		System.out.println("Construtor Non Parameterized Method");
	}
	Assignment5_Class(int a)
	{
		System.out.println("Construtor Parameterized Method with int argument");
	}
	Assignment5_Class(int b, int c)
	{
		System.out.println("Construtor Parameterized Method With String Argument");
	}
	void add ()
	{
		System.out.println("Non Static Non Parameterized Method");
	}
	void add(int d)
	{
		System.out.println("Non static Parameterized Method With int Argument");
	}
	void add(boolean e)
	{
		System.out.println("Non static Parameterized Method With boolean Argument");
	}
	static void sub ()
	{
		System.out.println("Static Non Parameterized Method");
	}
	static void sub(int f)
	{
		System.out.println("static Parameterized Method With int Argument");
	}
	static void sub(boolean g)
	{
		System.out.println("static Parameterized Method With boolean Argument");
	}
	public static void main(String[] args) 
	{
		Assignment5_Class a1 = new Assignment5_Class();
		new Assignment5_Class(6);
		new Assignment5_Class(6,8);
		a1.add();
		a1.add(true);
		a1.add(6);
		sub();
		sub(6);
		sub(true);
	}

}
