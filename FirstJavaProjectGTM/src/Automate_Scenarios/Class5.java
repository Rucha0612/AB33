package Automate_Scenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Class5 extends LaunchQuit
{
	@Test
	public void autosuggestionusingshoe() throws InterruptedException
	{
		WebElement SearchBar = driver.findElement(By.id("twotabsearchtextbox"));
		SearchBar.sendKeys("Shoe");
		Thread.sleep(2000);
		List<WebElement> Autosuggetion = driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
	    int Count = Autosuggetion.size();
		System.out.println(Count);
	}

}
