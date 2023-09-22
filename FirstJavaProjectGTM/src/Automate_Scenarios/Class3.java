package Automate_Scenarios;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Class3 extends LaunchQuit
{
	@Test
	public void mobilesection()
	{
		driver.findElement(By.linkText("Mobiles")).click();
	}
	
}
