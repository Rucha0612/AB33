package package1;
public class ConstructorOverloading1 
{
	ConstructorOverloading1()
	{
		System.out.println("Constructor Overloading 1");
	}
	ConstructorOverloading1(int a)
	{
		System.out.println("Constructor Overloading 2");
	}
	ConstructorOverloading1(float b)
	{
		System.out.println("Constructor Overloading 3");
	}
	ConstructorOverloading1(boolean c)
	{
		System.out.println("Constructor Overloading 4");
	}
	ConstructorOverloading1(char d)
	{
		System.out.println("Constructor Overloading 5");
	}
	ConstructorOverloading1(String e, double f)
	{
		System.out.println("Constructor Overloading 6");
	}
	public static void main(String[] args) {
		new ConstructorOverloading1();
		ConstructorOverloading1 a1 =  new ConstructorOverloading1(6);
		new ConstructorOverloading1(6f);
		new ConstructorOverloading1(true);
		new ConstructorOverloading1('R');
		new ConstructorOverloading1("Rucha",6.06);
	}

}
