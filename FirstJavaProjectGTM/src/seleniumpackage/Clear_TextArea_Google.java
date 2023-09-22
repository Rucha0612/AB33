package seleniumpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Clear_TextArea_Google 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement searchbox = driver.findElement(By.id("APjFqb"));
		searchbox.sendKeys("India");
		Thread.sleep(2000);
		//1st way to clear text area
		searchbox.clear(); 
	
		//2nd way to clear text area
		Thread.sleep(2000);
		searchbox.sendKeys("India");
		searchbox.sendKeys(Keys.CONTROL+"a");
		searchbox.sendKeys(Keys.BACK_SPACE);
		
		//3rd way to clear text area
		Thread.sleep(2000);
		searchbox.sendKeys("India");
		searchbox.sendKeys(Keys.CONTROL+"a");
		searchbox.sendKeys(Keys.DELETE);
	}
}
