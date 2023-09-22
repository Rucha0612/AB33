package TestNG;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ImplicitWaitAmazonShoeTillPaymentOption 
{
	@Test
	public void ImplicitWaitAmazonShoe() throws InterruptedException
	{
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHARVARISH\\ECLIPSE - Automation Testing - MKT\\FirstJavaProjectGTM\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("D:\\Automation Testing by MKT - Rucha Gore\\ChromeDriver and Chrome\\chrome-win64\\chrome-win64\\chrome.exe");
		ChromeDriver driver = new ChromeDriver(options);*/
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		WebElement SearchBox = driver.findElement(By.id("twotabsearchtextbox"));
		SearchBox.sendKeys("Shoe");
		Thread.sleep(2000);
		List<WebElement> Autosuggestions = driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int count = Autosuggestions.size();
		System.out.println(count);
		Autosuggestions.get(count-9).click();
		Thread.sleep(2000);
		WebElement firstShoeSelect = driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[7]"));
		firstShoeSelect.click();
		Set<String> pcid = driver.getWindowHandles();
		Iterator<String> pc = pcid.iterator();
		String parent = pc.next();//parent id of your browser
		System.out.println(parent);
		String child = pc.next();//1st child id of your browser
		driver.switchTo().window(child);
		Thread.sleep(2000);
		driver.findElement(By.name("submit.buy-now")).click();
		Thread.sleep(2000);
		driver.close();
		
	}

}
