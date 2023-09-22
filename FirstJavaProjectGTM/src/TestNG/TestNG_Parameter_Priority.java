package TestNG;

import org.testng.annotations.Test;

public class TestNG_Parameter_Priority
{
	@Test(priority=1)
	void scenario1()
	{
		System.out.println("1");
	}
	@Test(priority=0)
	void scenario2()
	{
		System.out.println("2");
	}

}
