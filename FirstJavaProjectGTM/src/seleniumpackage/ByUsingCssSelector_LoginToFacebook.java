package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByUsingCssSelector_LoginToFacebook 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#email")).sendKeys("vaidyarucha4@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input#pass")).sendKeys("12345");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[name=login]")).sendKeys(Keys.ENTER);
		System.out.println("Done");
	
	}
}
