package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IsDisabledAndIsEnabled_SeleniumMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHARVARISH\\ECLIPSE - Automation Testing - MKT\\FirstJavaProjectGTM\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("D:\\Automation Testing by MKT - Rucha Gore\\ChromeDriver and Chrome\\chrome-win64\\chrome-win64\\chrome.exe");
		ChromeDriver driver = new ChromeDriver(options);*/
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/SHARVARISH/Downloads/learningHTML1.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement lastname = driver.findElement(By.name("lname"));
		Thread.sleep(2000);
		boolean a1 = lastname.isDisplayed();
		System.out.println(a1);
		boolean a2 = lastname.isEnabled();
		System.out.println(a2);
		if(a1==true) //if(lastname.isDisplayed()==true)
		{
			if(a2==true)//if(lastname.isEnabled()==true)
			{
				lastname.sendKeys("Vaidya");
			}
		}

	}
}
