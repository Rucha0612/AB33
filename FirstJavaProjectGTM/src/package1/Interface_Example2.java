package package1;
interface GreatGrandParent
{
	void method1();
	void method2();
}
abstract class IntermediateParent implements GreatGrandParent
{
	abstract void method3();
	abstract void method4();
	static void method5() 
	{
		System.out.println("method5");
	}
	void method6() 
	{
		System.out.println("method6");
	}
}
public class Interface_Example2 extends IntermediateParent
{
	static void method7() 
	{
		System.out.println("method7");
	}
	void method8() 
	{
		System.out.println("method8");
	}
	public static void main(String[] args) 
	{
		method5();
		method7();
		Interface_Example2 a = new Interface_Example2();
		a.method1();
		a.method2();
		a.method3();
		a.method4();
		a.method6();
		a.method8();
	}
	public void method1() 
	{
	System.out.println("method1");
	}
	public void method2() 
	{
		System.out.println("method2");
	}
	void method3() 
	{
		System.out.println("method3");
	}
	void method4() 
	{
		System.out.println("method4");
	}

}
