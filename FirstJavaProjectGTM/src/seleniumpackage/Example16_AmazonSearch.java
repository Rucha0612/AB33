package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Example16_AmazonSearch 
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
		Thread.sleep(3000);
		WebElement SearchBar = driver.findElement(By.id("twotabsearchtextbox"));
		SearchBar.sendKeys("Shoe");
		Thread.sleep(1000);
		SearchBar.sendKeys(Keys.ENTER);
		WebElement ShoeOption = driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]"));
		ShoeOption.click();

	}

}
