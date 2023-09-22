package package1;

public class LocalGlobalVariable1
{
	int a=10;
    static int age;// age is global variable. default value = 0
    String name;// name is global variable. default value = null

	void add()
	{
		 // a is local variable
		System.out.println(a); //utilization is possible only when we initialize the a value
	}
	public static void main(String[] args) 
	{
		int b = 200; // b is local variable
		System.out.println(age);
		System.out.println(b);
		LocalGlobalVariable1 l1 = new LocalGlobalVariable1();
		l1.a=100;
		l1.add();
	    l1.name = "Rucha";
	    System.out.println(l1.name);
	}

}
