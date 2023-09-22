package package1;
interface GreatGrandParentClass
{
	void method1();
	void method2();
}
interface IntermediateClass extends GreatGrandParentClass
{
	void method3();
	void method4();
}

public class Interface_Example3 implements IntermediateClass
{

	public static void main(String[] args) 
	{
		Interface_Example3 a = new Interface_Example3();
		a.method1();
		a.method2();
		a.method3();
		a.method4();

	}
	public void method1() 
	{
		System.out.println("method1");
	}
	public void method2() 
	{
		System.out.println("method2");
	}
	public void method3() 
	{
		System.out.println("method3");
	}
	public void method4() 
	{
		System.out.println("method4");
	}
}
