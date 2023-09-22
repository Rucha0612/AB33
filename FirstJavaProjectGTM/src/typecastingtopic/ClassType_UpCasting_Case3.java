package typecastingtopic;
class GrandParent1
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
class Teacher2 extends GrandParent1
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
public class ClassType_UpCasting_Case3 extends Teacher2
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
		GrandParent1 g1 = new ClassType_UpCasting_Case3();//upcasting
		ClassType_UpCasting_Case3 c1 = (ClassType_UpCasting_Case3)g1;//downcasting
		g1.guiding_java();
		g1.guiding_selenium();
	}
}