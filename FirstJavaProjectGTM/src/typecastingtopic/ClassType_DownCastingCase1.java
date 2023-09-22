package typecastingtopic;
class Country
{
	void NH()
	{
		System.out.println("NH Road");
	}
}
class State extends Country
{
	void SH()
	{
		System.out.println("SH Road");
	}
}
public class ClassType_DownCastingCase1 extends State
{
	void City()
	{
		System.out.println("City Road");
	}
	public static void main(String[] args) 
	{
		Country c1 = new State();//upcasting
		State s1 = (State)c1;//downcasting
	    State s2 = new ClassType_DownCastingCase1();//upcasting
	    ClassType_DownCastingCase1 c2 = (ClassType_DownCastingCase1)s2;//downcasting
	    c2.City();
		c1.NH();
		s1.NH();
		s1.SH();
	}
}

	



