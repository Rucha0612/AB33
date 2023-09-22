package package1;
class Mentor1
{
	Mentor1(int a)
	{
	System.out.println("Guiding Mentor");
	}
}
class Teacher3 extends Mentor1
{
	Teacher3(String b)
	{
		super(100);
	System.out.println("Helping Teacher");
	}
}
public class SuperCallingStatement2 extends Teacher3
{
	SuperCallingStatement2()
	{
		super("I am Rucha");
		System.out.println("learning student");
	}
	public static void main(String[] args) 
	{
		new SuperCallingStatement2();

	}

}
