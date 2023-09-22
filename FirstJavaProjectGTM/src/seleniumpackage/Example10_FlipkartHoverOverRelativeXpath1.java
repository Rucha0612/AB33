package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Example10_FlipkartHoverOverRelativeXpath1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHARVARISH\\ECLIPSE - Automation Testing - MKT\\FirstJavaProjectGTM\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("D:\\Automation Testing by MKT - Rucha Gore\\ChromeDriver and Chrome\\chrome-win64\\chrome-win64\\chrome.exe");
		ChromeDriver driver = new ChromeDriver(options);*/
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		WebElement CrossMark = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		CrossMark.click();
		WebElement fashion = driver.findElement(By.xpath("(//div[.='Fashion'])[2]"));
		Actions a1 = new Actions(driver);
		Thread.sleep(2000);
		a1.moveToElement(fashion).perform();
		// fashion.click();
		Thread.sleep(2000);
		WebElement Men = driver.findElement(By.xpath("//span[.='Men']"));
		Men.click();
		Thread.sleep(2000);
		WebElement tshirt = driver.findElement(By.xpath("(//div[@class='_1QrT3s']/div/a)[19]"));
		tshirt.click();
	    WebElement FirstTshirt = driver.findElement(By.xpath("//a[.='Men Typography Hooded Neck Cotton Blend White, Black T-...']"));
	    FirstTshirt.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']")).click();
	}

}
