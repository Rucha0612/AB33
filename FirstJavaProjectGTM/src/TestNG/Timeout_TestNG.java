package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Timeout_TestNG 
{
	@Test(timeOut=18000)
	public void testcase() throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement searchbox = driver.findElement(By.xpath("/html/body/div/div/form/div/div/div/div/div/textarea"));
		searchbox.sendKeys("India");
		searchbox.sendKeys(Keys.ENTER);
		//Thread.sleep(3000);
		driver.close();
		System.out.println("Done");
	}
}
