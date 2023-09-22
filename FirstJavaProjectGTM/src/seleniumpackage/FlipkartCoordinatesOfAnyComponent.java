package seleniumpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartCoordinatesOfAnyComponent 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement CrossMark = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		Thread.sleep(3000);
		CrossMark.click();
		
		Actions a1 = new Actions(driver);
		//a1.moveByOffset(xaxis, yaxis).click().perform();

	

	}

}
