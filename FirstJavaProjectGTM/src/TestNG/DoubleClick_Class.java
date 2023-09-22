package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DoubleClick_Class 
{
	@Test
	public void TestCase1()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com/");
		WebElement getgmaillink = driver.findElement(By.linkText("Gmail"));
		Actions a1 = new Actions(driver);
		a1.doubleClick(getgmaillink).perform();
	}

}
