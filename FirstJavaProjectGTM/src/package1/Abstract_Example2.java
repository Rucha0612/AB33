package package1;

abstract class GrandParentClass
{
	abstract void method1();
	abstract void method2();
	static void method3()
	{
		System.out.println("Grand Parent Class");
	}
}
abstract class GoogleApp extends GrandParentClass
{
	abstract void method4();
	abstract void method5();
	static void method6()
	{
		System.out.println("Parent Class");
	}
}
public class Abstract_Example2 extends GoogleApp
{
	static void method7()
	{
		System.out.println("Child Class");
	}
	public static void main(String[] args)
	{
		method3();
		method6();
		method7();
		Abstract_Example2 a1 = new Abstract_Example2();
		a1.method4();
		a1.method5();
		a1.method1();
		a1.method2();
	}
	void method4() 
	{
		System.out.println("method 4 of abstract class");
	}
	void method5() 
	{
		System.out.println("method 5 of abstract class");
	}
	void method1() 
	{
		System.out.println("method 1 of abstract class");
	}
	void method2() 
	{
		System.out.println("method 2 of abstract class");
	}

}
