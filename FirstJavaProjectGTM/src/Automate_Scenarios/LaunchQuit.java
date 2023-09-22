package Automate_Scenarios;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchQuit 
{
	ChromeDriver driver;
	@BeforeMethod
	void launch()
	{
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHARVARISH\\ECLIPSE - Automation Testing - MKT\\FirstJavaProjectGTM\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("D:\\Automation Testing by MKT - Rucha Gore\\ChromeDriver and Chrome\\chrome-win64\\chrome-win64\\chrome.exe");*/
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	@AfterMethod
	void quit() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
}
