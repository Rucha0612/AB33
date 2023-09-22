package package1;
class Mentor
{
	Mentor()
	{
	System.out.println("Guiding Mentor");
	}
}
class Teacher2 extends Mentor
{
	Teacher2()
	{
	System.out.println("Helping Teacher");
	}
}

public class SuperCallingStatement1 extends Teacher2
{
	SuperCallingStatement1()
	{
		System.out.println("learning student");
	}

	public static void main(String[] args) 
	{
		new SuperCallingStatement1();
	}

}
