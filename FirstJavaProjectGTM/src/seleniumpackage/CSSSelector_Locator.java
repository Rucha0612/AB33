package seleniumpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CSSSelector_Locator 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//how to write css selector when you have tagname & id is available
		WebElement css_selector_locator = driver.findElement(By.cssSelector("textarea#APjFqb"));
		css_selector_locator.sendKeys("India");
		Thread.sleep(1000);
		css_selector_locator.clear();
		Thread.sleep(2000);
		//how to write css selector when you have tagname & classname is available
		WebElement css_selector_locator1 = driver.findElement(By.cssSelector("textarea.gLFyf"));
		css_selector_locator1.sendKeys("India");
		Thread.sleep(1000);
		css_selector_locator1.clear();
		Thread.sleep(2000);
		//how to write css selector when you have tagname & attribute(attribute name & value) is available
		WebElement css_selector_locator2 = driver.findElement(By.cssSelector("textarea[name=q]"));
		css_selector_locator2.sendKeys("India");
		Thread.sleep(1000);
		css_selector_locator2.clear();
		Thread.sleep(2000);
		//how to write css selector when you have tagname, classname & attribute(attribute name & value) is available
		WebElement css_selector_locator3 = driver.findElement(By.cssSelector("textarea.gLFyf[name=q]"));
		css_selector_locator3.sendKeys("India");
	}
}
