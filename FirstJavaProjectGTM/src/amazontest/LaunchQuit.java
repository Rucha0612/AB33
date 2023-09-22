package amazontest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchQuit 
{
	ChromeDriver driver;
	@BeforeMethod
	public void launch()
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		
	}
	@AfterMethod
	public void quit() throws InterruptedException, IOException
	{
		TakesScreenshot ts = driver;//1st step to upcast driver to TakesScreenshot Interface
		File Source = ts.getScreenshotAs(OutputType.FILE);//2nd step to utilize method of TakesScreenshot interface which is getScreenshotAs
		File destination = new File("C:\\Users\\SHARVARISH\\ECLIPSE - Automation Testing - MKT\\FirstJavaProjectGTM\\Screenshots\\Rucha"+Math.random()+".png");
		FileUtils.copyFile(Source, destination);
		Thread.sleep(3000);
		driver.quit();
	}

}
