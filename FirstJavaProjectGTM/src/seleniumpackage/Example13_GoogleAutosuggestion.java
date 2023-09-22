package seleniumpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Example13_GoogleAutosuggestion 
{

	public static void main(String[] args) throws InterruptedException 
	{
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHARVARISH\\ECLIPSE - Automation Testing - MKT\\FirstJavaProjectGTM\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("D:\\Automation Testing by MKT - Rucha Gore\\ChromeDriver and Chrome\\chrome-win64\\chrome-win64\\chrome.exe");
		ChromeDriver driver = new ChromeDriver(options);*/
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("India");
		Thread.sleep(2000);
		List<WebElement> Autosuggestion = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		Thread.sleep(2000);
		int count = Autosuggestion.size();
		System.out.println(count);
		Autosuggestion.get(count-1).click();

	}

}
