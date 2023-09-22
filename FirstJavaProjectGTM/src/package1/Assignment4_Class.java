package package1;

public class Assignment4_Class {
	
	static void add() //static method
	{
		System.out.println("Static Method");
	}
	void sub() //non static method
	{
		System.out.println("Non Static Method");
	}
	Assignment4_Class() //constructor method
	{
		System.out.println("Constructor Method");
	}

	public static void main(String[] args) 
	{
		Assignment4_Class a1 = new Assignment4_Class();
		add();
		a1.sub();
		
	}

}
