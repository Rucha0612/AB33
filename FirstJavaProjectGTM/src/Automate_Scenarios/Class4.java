package Automate_Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Class4 extends LaunchQuit
{
	@Test
	public void signinusingactionclass()
	{
		WebElement AccountandList = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(AccountandList).perform();
		WebElement signin = driver.findElement(By.xpath("//span[.='Sign in']"));
		signin.click();
	}
}
