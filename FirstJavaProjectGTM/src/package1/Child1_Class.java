package package1;

public class Child1_Class extends Parent1_Class
{
	void method9()
	{
		System.out.println("9");
	}
	void method10()
	{
		System.out.println("10");
	}
	public static void main(String[] args) 
	{
		method3();
		method4();
		method7();
		method8();
		Child1_Class c1 = new Child1_Class();
		c1.method1();
		c1.method2();
		c1.method5();
		c1.method6();
		c1.method9();
		c1.method10();
	}

}
