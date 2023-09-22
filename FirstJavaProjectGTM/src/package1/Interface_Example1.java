package package1;
interface InterfaceParentClass
{
	void method3();
	void method4();
}

public class Interface_Example1 implements InterfaceParentClass
{
	static void method1()
	{
		System.out.println("method1");
	}
	void method2()
	{
		System.out.println("method2");
	}

	public static void main(String[] args) 
	{
		method1();
		Interface_Example1 i1 = new Interface_Example1();
		i1.method2();
		i1.method3();
		i1.method4();
	}
	public void method3() 
	{
	System.out.println("Abstract method 3");
		
	}
	public void method4() 
	{
	System.out.println("Abstract method 4");	
	}

}
