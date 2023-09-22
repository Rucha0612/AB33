package package1;

public class LocalGlobalVariable3 
{
	int age; //0
	String name; //null
	double salary; //0.0
	
	void student(int age, String name,double salary)
	{
		System.out.println("Remember I am non static method?");
	}
	
	public static void main(String[] args) 
	{
		
		LocalGlobalVariable3 l1 = new LocalGlobalVariable3();
		l1.student(100, "Rucha", 88.80);
		l1.age = 25;
		l1.name = "Rucha";
		l1.salary = 25000;
		System.out.println(l1.age);
		System.out.println(l1.name);
		System.out.println(l1.salary);
	}

}
