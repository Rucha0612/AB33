package TestNG;

import org.testng.annotations.Test;

public class TestNG_Parameter_InvocationCount 
{
	@Test(invocationCount=5)
	void scenario1()
	{
		System.out.println("1");
	}

}
