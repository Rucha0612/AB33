package TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNG_Listners_Class.class) //syntax of writing listeners
public class Listner_Test_Google_Searching 
{
	@Test
	public void testcase1()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("APjFqb")).sendKeys("India");
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
	}
}
