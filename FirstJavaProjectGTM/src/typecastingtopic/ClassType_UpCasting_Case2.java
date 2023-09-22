package typecastingtopic;
class GrandParent
{
	void guiding_java()
	{
		System.out.println("I am guiding java");
	}
	void guiding_selenium()
	{
		System.out.println("I am guiding selenium");
	}
}
class Teacher1 extends GrandParent
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
public class ClassType_UpCasting_Case2 extends Teacher1
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
		Teacher1 t1 = new ClassType_UpCasting_Case2();
		t1.guiding_java();
		t1.guiding_selenium();
		t1.teaching_java();
		t1.teaching_selenium();
	}

}
