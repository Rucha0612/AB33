package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollDownWithoutUsingJavaScriptExecutor 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("xpath")).sendKeys(Keys.PAGE_DOWN);
		Actions action = new Actions(driver);  
		action.sendKeys(Keys.PAGE_DOWN);  
	}

}
