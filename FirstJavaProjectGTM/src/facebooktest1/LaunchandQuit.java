package facebooktest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchandQuit 
{
	ChromeDriver driver;
	@BeforeMethod
	public void LaunchFacebookApplication() throws InterruptedException
	{
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHARVARISH\\ECLIPSE - Automation Testing - MKT\\FirstJavaProjectGTM\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("D:\\Automation Testing by MKT - Rucha Gore\\ChromeDriver and Chrome\\chrome-win64\\chrome-win64\\chrome.exe");
		ChromeDriver driver = new ChromeDriver(options);*/
		ChromeOptions options = new ChromeOptions();
		Thread.sleep(2000);
	    options.addArguments("--disable-notifications");
	    Thread.sleep(2000);
		/*options.addArguments("--disable-popup-blocking");
		Thread.sleep(2000);
		options.addArguments("--disable-web-security");
		Thread.sleep(2000);*/
		driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	@AfterMethod
	public void quit() throws InterruptedException
	{
	//	Thread.sleep(3000);
		//driver.quit();
	}

}
