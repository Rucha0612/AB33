package multilevel_inhertitance_concept;

public class Child_Class extends Parent_Class

{
 void method3()
 {
	 System.out.println("I am child");
 }
	public static void main(String[] args) 
	{
		Child_Class c1 = new Child_Class();
		c1.method3();
		method2();
		method1();

	}

}
