package package1;
interface Example3
{
	void method3();
}
abstract class Example2 implements Example3
{
	static void method2()
	{
		System.out.println("method2");
	}
}
public class Interface_Example5 extends Example2
{
	public void method3() 
	{
		System.out.println("method3");
	}
	static void method1()
	{
		System.out.println("method1");
	}
	public static void main(String[] args) 
	{
		method2();
		Interface_Example5 a = new Interface_Example5();
		a.method3();
		method1();
	}
}
