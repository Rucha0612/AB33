package seleniumpackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumExample1 
{

	public static void main(String[] args) throws InterruptedException
	{
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHARVARISH\\ECLIPSE - Automation Testing - MKT\\FirstJavaProjectGTM\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("D:\\Automation Testing by MKT - Rucha Gore\\ChromeDriver and Chrome\\chrome-win64\\chrome-win64\\chrome.exe");
		ChromeDriver driver = new ChromeDriver(options);*/
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		Thread.sleep(4000);
		String s1 = driver.getTitle();
		Thread.sleep(4000);
		String s2 = "Google";
		System.out.println(s1);
		if(s1.contains(s2))
		{
			System.out.println("expected result = actual result");
		}else 
		{
			System.out.println("Results are not matching");
		}
		Thread.sleep(4000);
		driver.close();
	}
}

