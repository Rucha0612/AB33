package Automate_Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Class2 extends LaunchQuit
{
	@Test
	public void cart()
	{
		WebElement cart = driver.findElement(By.xpath("//span[@class='nav-cart-icon nav-sprite']"));
		cart.click();

	}

}
