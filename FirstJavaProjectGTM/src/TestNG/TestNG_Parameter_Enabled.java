package TestNG;

import org.testng.annotations.Test;

public class TestNG_Parameter_Enabled 
{
	@Test(enabled=false)
	void scenario1()
	{
		System.out.println("1");
	}
	@Test
	void scenario2()
	{
		System.out.println("2");
	}

}
