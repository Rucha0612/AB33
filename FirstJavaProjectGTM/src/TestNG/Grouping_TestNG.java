package TestNG;
import org.testng.annotations.Test;
public class Grouping_TestNG 
{
	@Test(groups={"Smoke","System","Regression"})
	public void testcase1()
	{
		System.out.println("TestCase1");
	}
	@Test(groups={"System","Regression"})
	public void testcase2()
	{
		System.out.println("TestCase2");
	}
	@Test(groups={"Smoke","Regression"})
	public void testcase3()
	{
		System.out.println("TestCase3");
	}
	@Test(groups={"Regression"})
	public void testcase4()
	{
		System.out.println("TestCase4");
	}
	@Test(groups={"Smoke"})
	public void testcase5()
	{
		System.out.println("TestCase5");
	}
	@Test(groups={"Smoke"})
	public void testcase6()
	{
		System.out.println("TestCase6");
	}
	@Test(groups={"System"})
	public void testcase7()
	{
		System.out.println("TestCase7");
	}
	@Test
	public void testcase8()
	{
		System.out.println("TestCase8");
	}
	@Test
	public void testcase9()
	{
		System.out.println("TestCase9");
	}
	@Test
	public void testcase10()
	{
		System.out.println("TestCase10");
	}

}
