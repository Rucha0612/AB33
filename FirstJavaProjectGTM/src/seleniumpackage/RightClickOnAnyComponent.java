package seleniumpackage;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
public class RightClickOnAnyComponent 
{
	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHARVARISH\\ECLIPSE - Automation Testing - MKT\\FirstJavaProjectGTM\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("D:\\Automation Testing by MKT - Rucha Gore\\ChromeDriver and Chrome\\chrome-win64\\chrome-win64\\chrome.exe");
		ChromeDriver driver = new ChromeDriver(options);*/
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement mobilelink = driver.findElement(By.linkText("Mobiles"));
		Actions a = new Actions(driver);
		a.contextClick(mobilelink).perform();
		Thread.sleep(1000);
		Robot r1 = new Robot();
		 r1.keyPress(KeyEvent.VK_DOWN);
			r1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
			r1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
			r1.keyPress(KeyEvent.VK_ENTER);
	}
}