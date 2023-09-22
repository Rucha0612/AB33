package seleniumpackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown_Youtube
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		JavascriptExecutor j1 = driver;
		
		for(int i=1;i>0;i++)
		{
			j1.executeScript("window.scrollBy(0,500)"); //scrolling down
			Thread.sleep(2000);
		}

	}

}
