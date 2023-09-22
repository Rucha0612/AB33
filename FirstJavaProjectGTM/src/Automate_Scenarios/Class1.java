package Automate_Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Class1 extends LaunchQuit
{
	@Test
	public void searchbox()
	{
		WebElement Searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		Searchbox.sendKeys("Shoe");
		Searchbox.sendKeys(Keys.ENTER);
	}
}
