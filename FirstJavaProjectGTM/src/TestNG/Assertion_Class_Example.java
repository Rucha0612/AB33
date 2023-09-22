package TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
public class Assertion_Class_Example 
{
	@Test
	public void Assertion_Example() throws InterruptedException
	{
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHARVARISH\\ECLIPSE - Automation Testing - MKT\\FirstJavaProjectGTM\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("D:\\Automation Testing by MKT - Rucha Gore\\ChromeDriver and Chrome\\chrome-win64\\chrome-win64\\chrome.exe");
		ChromeDriver driver = new ChromeDriver(options);*/
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/login/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("vaidyarucha4@gmail.com");
		                                                                driver.findElement(By.id("pass")).sendKeys("Runmay@0613");
		driver.findElement(By.id("loginbutton")).sendKeys(Keys.ENTER);
		System.out.println("Done");
		Assertion a1 = new Assertion(); //Class imported from TestNG package
		a1.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/");
	}
}
