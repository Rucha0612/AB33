package typecastingtopic;
class Teacher
{
	void teaching_java()
	{
		System.out.println("I am teaching java");
	}
	void teaching_selenium()
	{
		System.out.println("I am teaching selenium");
	}
}

public class ClassType_UpCasting_Case1 extends Teacher
{
	void java()
	{
		System.out.println("I am learing java");
	}
	void selenium()
	{
		System.out.println("I am learing selenium");
	}

	public static void main(String[] args) 
	{
		Teacher t1 = new ClassType_UpCasting_Case1();
		t1.teaching_java();
		t1.teaching_selenium();

	}

}
