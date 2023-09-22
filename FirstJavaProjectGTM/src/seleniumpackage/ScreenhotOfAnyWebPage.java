package seleniumpackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenhotOfAnyWebPage 
{
	public static void main(String[] args) throws IOException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		TakesScreenshot ts = driver;//1st step to upcast driver to TakesScreenshot Interface
		File Source = ts.getScreenshotAs(OutputType.FILE);//2nd step to utilize method of TakesScreenshot interface which is getScreenshotAs
		File destination = new File("C:\\Users\\SHARVARISH\\ECLIPSE - Automation Testing - MKT\\FirstJavaProjectGTM\\Screenshots\\Rucha"+".png");
		FileUtils.copyFile(Source, destination);
	}
}
