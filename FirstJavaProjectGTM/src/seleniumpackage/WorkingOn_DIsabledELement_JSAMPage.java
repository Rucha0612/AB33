package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingOn_DIsabledELement_JSAMPage 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/SHARVARISH/Downloads/learningHTML1.html");
		driver.switchTo().alert().accept();
		driver.manage().window().maximize();
		WebElement lastname = driver.findElement(By.id("121"));
		lastname.sendKeys("Vaidya");
	}
}
