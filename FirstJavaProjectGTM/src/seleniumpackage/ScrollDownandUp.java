package seleniumpackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownandUp 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		JavascriptExecutor j1 = driver;
		j1.executeScript("window.scrollBy(0,500)"); //scrolling down
		Thread.sleep(3000);
		j1.executeScript("window.scrollBy(0,-500)"); //scrolling up
		for(int i=1;i>1;i++)
		{
			
			Thread.sleep(1000);
		}
	

	}

}
