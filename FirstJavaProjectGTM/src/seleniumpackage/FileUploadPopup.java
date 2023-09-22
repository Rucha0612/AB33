package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class FileUploadPopup 
{
	public static void main(String[] args) throws InterruptedException 
	{
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHARVARISH\\ECLIPSE - Automation Testing - MKT\\FirstJavaProjectGTM\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("D:\\Automation Testing by MKT - Rucha Gore\\ChromeDriver and Chrome\\chrome-win64\\chrome-win64\\chrome.exe");
		ChromeDriver driver = new ChromeDriver(options);*/
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement Username = driver.findElement(By.name("your-name"));
		Username.sendKeys("Rucha123");
		Thread.sleep(1000);
		WebElement password = driver.findElement(By.name("Password"));
		password.sendKeys("123456");
		Thread.sleep(1000);
		WebElement firstname = driver.findElement(By.id("4"));
		firstname.sendKeys("Rucha");
		Thread.sleep(1000);
		WebElement lastname = driver.findElement(By.id("5"));
		lastname.sendKeys("Gore");
	    Thread.sleep(1000);
		WebElement radiobutton = driver.findElement(By.xpath("(//input[@name='radio-45'])[2]"));
	    radiobutton.click();
		Thread.sleep(3000);
		WebElement DropDownOption = driver.findElement(By.xpath("(//span[@class='select2-selection__rendered'])[1]"));
		DropDownOption.click();
		WebElement EnterText = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		EnterText.sendKeys("Hindu");
		EnterText.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.name("file-935")).sendKeys("C:\\Users\\SHARVARISH\\Downloads");
		Thread.sleep(2000);
		driver.findElement(By.name("checkbox-833[]")).click();
		
		//driver.findElement(By.xpath("(//input[@class='wpcf7-form-control wpcf7-submit has-spinner btn btn-default'])[1]")).click();

	}

}
