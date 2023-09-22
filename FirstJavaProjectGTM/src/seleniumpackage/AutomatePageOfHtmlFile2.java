package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutomatePageOfHtmlFile2 
{

	public static void main(String[] args) 
	{
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHARVARISH\\ECLIPSE - Automation Testing - MKT\\FirstJavaProjectGTM\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("D:\\Automation Testing by MKT - Rucha Gore\\ChromeDriver and Chrome\\chrome-win64\\chrome-win64\\chrome.exe");
		ChromeDriver driver = new ChromeDriver(options);*/
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/SHARVARISH/Downloads/learningHTML1.html");
		driver.switchTo().alert().accept();
		driver.manage().window().maximize();
		WebElement EnterUsername = driver.findElement(By.xpath("(/html/body/input)[1]"));
		EnterUsername.sendKeys("Rucha0612");
		WebElement hint = driver.findElement(By.xpath("(/html/body/input)[2]"));
		hint.sendKeys("Enter Name");
		WebElement pass = driver.findElement(By.xpath("(/html/body/input)[3]"));
		pass.sendKeys("Rucha0612");
		WebElement firstname = driver.findElement(By.xpath("(/html/body/form/input)[1]"));
		firstname.sendKeys("Rucha");
	}

}
