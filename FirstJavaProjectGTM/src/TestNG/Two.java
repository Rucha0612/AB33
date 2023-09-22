package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Two 
{
	@Test
	public static void Test()
	{
		System.out.println("5");
	}
	/*@Test
	public static void Test1()
	{
		System.out.println("10");
	}*/
	@BeforeSuite
	public static void BS()
	{
		System.out.println("1");
	}
	@BeforeTest
	public static void BT()
	{
		System.out.println("2");
	}
	@BeforeClass
	public static void BC()
	{
		System.out.println("3");
	}
	@BeforeMethod
	public static void BM()
	{
		System.out.println("4");
	}
	@AfterMethod
	public static void AM()
	{
		System.out.println("6");
	}
	@AfterClass
	public static void AC()
	{
		System.out.println("7");
	}
	@AfterTest
	public static void AT()
	{
		System.out.println("8");
	}
	@AfterSuite
	public static void AS()
	{
		System.out.println("9");
	}
}
