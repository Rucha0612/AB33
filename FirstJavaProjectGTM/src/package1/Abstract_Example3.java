package package1;

abstract class Abstract3
{
	abstract void method1();
	abstract void method2();
	static void method3()
	{
		System.out.println("Grand Parent Class 1");
	}
}
class Abstract2 extends Abstract3
{
	static void method4()
	{
		System.out.println("Parent Class 1");
	}
	void method5()
	{
		System.out.println("Parent Class 2");
	}
	void method1() 
	{
		System.out.println("Abstract method 1");
	}
	
	void method2() 
	{
		System.out.println("Abstract method2");
	}
}
	
public class Abstract_Example3 extends Abstract2
{
	static void method6()
	{
		System.out.println("Child Class 1");
	}
	void method7()
	{
		System.out.println("Child Class 2");
	}
	public static void main(String[] args) 
	{
	method6();
	method4();
	method3();
	Abstract_Example3 a1 = new Abstract_Example3();
	a1.method7();
	a1.method1();
	a1.method2();
	a1.method5();

	}

}
