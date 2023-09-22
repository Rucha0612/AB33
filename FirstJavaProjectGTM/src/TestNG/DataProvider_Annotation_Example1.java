package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Annotation_Example1 
{
	@DataProvider(name="Country")
	public Object testdata()
	{
		return new Object[][]{{"India"},{"Srilanka"},{"Nepal"},{"Bhutan"}};
	}
	
	@Test(dataProvider="Country")
	public void testcase1(String Names) throws InterruptedException
	{
		System.out.println(Names);
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys(Names);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.quit();
	}
}
