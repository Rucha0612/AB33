package package1;

public class ThisKeyward {

	int age;
	String name;
	double salary;
	
	 void student(int age,String name,double salary)
	{
		System.out.println("Remember I am non static method?");
		this.age=age;
		this.name=name;
		this.salary=salary;
	}
	
	public static void main(String[] args) {
		
		ThisKeyward l1 = new ThisKeyward();
		l1.student(100, "Rucha", 88.80);
		System.out.println(l1.age);
		System.out.println(l1.name);
		System.out.println(l1.salary);
		
	}

}
