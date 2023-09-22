package seleniumpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonCoordinatesOfAnyComponent 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement country1= driver.findElement(By.linkText("Brazil"));
		Point xandy = country1.getLocation();
		int xaxis = xandy.getX();
		int yaxis = xandy.getY();
		System.out.println(xaxis);
		System.out.println(yaxis);
	/*	Thread.sleep(2000);
		Actions a1 = new Actions(driver);
		//a1.moveByOffset(xaxis, yaxis).click().perform();
	*/
	}

}
