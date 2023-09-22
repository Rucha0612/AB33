package package1;
interface GreatGreatParent
{
	void method1();
}
abstract class GreatIntermediateParent implements GreatGreatParent
{
	abstract void method2();
}
abstract class GreatChildClass extends GreatIntermediateParent
{
	static void method3()
	{
		System.out.println("method3");
	}
	static void method4()
	{
		System.out.println("method4");
	}
}
public class Interface_Example4 extends GreatChildClass
{
	static void method5()
	{
		System.out.println("method5");
	}
	public static void main(String[] args) 
	{
		Interface_Example4 a = new Interface_Example4();
		a.method1();
		a.method2();
		method3();
		method4();
		method5();
	}
	public void method1() 
	{
		System.out.println("method1");
	}
	void method2() 
	{
		System.out.println("method2");
	}
	
}
