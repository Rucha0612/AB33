package seleniumpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Example12_AmazonShoeAutosuggetionXpath 
{
	public static void main(String[] args) throws InterruptedException 
	{
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHARVARISH\\ECLIPSE - Automation Testing - MKT\\FirstJavaProjectGTM\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("D:\\Automation Testing by MKT - Rucha Gore\\ChromeDriver and Chrome\\chrome-win64\\chrome-win64\\chrome.exe");
		ChromeDriver driver = new ChromeDriver(options);*/
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement SearchBar = driver.findElement(By.id("twotabsearchtextbox"));
		SearchBar.sendKeys("Shoe");
		Thread.sleep(2000);
		List<WebElement> Autosuggetion = driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
	    int Count = Autosuggetion.size();
		System.out.println(Count);
	}

}
