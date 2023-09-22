package typecastingtopic;
class Country1
{
	void NH()
	{
		System.out.println("NH Road");
	}
}
class State1 extends Country1
{
	void SH()
	{
		System.out.println("SH Road");
	}
}
public class ClassType_DownCastingCase2 extends State1
{
	void City()
	{
		System.out.println("City Road");
	}
	public static void main(String[] args) 
	{
		Country1 c1 = new State1();
		c1.NH();
		State1 s1 = new ClassType_DownCastingCase2();
		s1.NH();
		s1.SH();
		ClassType_DownCastingCase2 c2 = (ClassType_DownCastingCase2)s1;
		c2.City();
		c2.NH();
		c2.SH();
	}
}
