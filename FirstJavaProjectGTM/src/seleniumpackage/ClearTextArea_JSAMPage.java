package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTextArea_JSAMPage 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/SHARVARISH/Downloads/learningHTML1.html");
		driver.switchTo().alert().accept();
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("1"));
		username.sendKeys("Rucha0612");
		Thread.sleep(2000);
		//1st way to clear text area
		username.clear(); 
	
		//2nd way to clear text area
		username.sendKeys(Keys.CONTROL+"a");
		username.sendKeys(Keys.BACK_SPACE);
		
		//3rd way to clear text area
		username.sendKeys(Keys.CONTROL+"a");
		username.sendKeys(Keys.DELETE);
 }
}
