package seleniumpackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickOnAnyOption_AfterRightClick 
{

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement gmaillink = driver.findElement(By.linkText("Gmail"));
		Actions a = new Actions(driver);
		a.contextClick(gmaillink).perform();
		/*Robot Class is normal i.e concrete class and not final class. 
		It is used to perform only simulation between mouse and keyboad*/
		
		Robot r1 = new Robot();
	    r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		r1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		r1.keyPress(KeyEvent.VK_ENTER);
 }

}
