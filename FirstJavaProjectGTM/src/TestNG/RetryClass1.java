package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RetryClass1 
{
	@Test(retryAnalyzer=TestNG.Retry_Mechanism.class)
	public void retrymethod()
	{
	/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHARVARISH\\ECLIPSE - Automation Testing - MKT\\FirstJavaProjectGTM\\Driver\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.setBinary("D:\\Automation Testing by MKT - Rucha Gore\\ChromeDriver and Chrome\\chrome-win64\\chrome-win64\\chrome.exe");
	ChromeDriver driver = new ChromeDriver(options);*/
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	WebElement searchbox = driver.findElement(By.name("a"));
	searchbox.sendKeys("India");
	searchbox.sendKeys(Keys.ENTER);
	System.out.println("Done");
	}
}
