package seleniumpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example15_FlipkartShoeAutosuggestion6thOption 
{

	public static void main(String[] args) throws InterruptedException 
	{
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHARVARISH\\ECLIPSE - Automation Testing - MKT\\FirstJavaProjectGTM\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("D:\\Automation Testing by MKT - Rucha Gore\\ChromeDriver and Chrome\\chrome-win64\\chrome-win64\\chrome.exe");
		ChromeDriver driver = new ChromeDriver(options);*/
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		WebElement CrossMark = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		Thread.sleep(3000);
		CrossMark.click();
		WebElement SearchBox = driver.findElement(By.name("q"));
		SearchBox.sendKeys("Shoe");
		Thread.sleep(2000);
		List<WebElement> Autosuggestion = driver.findElements(By.xpath("(//form[@class='_2M8cLY header-form-search']/ul/li)"));
		int count = Autosuggestion.size();
		System.out.println(count);
		Autosuggestion.get(count-3).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='s1Q9rs'])[3]")).click();
		System.out.println("Done");
	}

}
