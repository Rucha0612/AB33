package seleniumpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
public class AutomatePageOfHtmlFile 
{
	public static void main(String[] args) 
	{
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHARVARISH\\ECLIPSE - Automation Testing - MKT\\FirstJavaProjectGTM\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("D:\\Automation Testing by MKT - Rucha Gore\\ChromeDriver and Chrome\\chrome-win64\\chrome-win64\\chrome.exe");
		ChromeDriver driver = new ChromeDriver(options);*/
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/SHARVARISH/Downloads/learningHTML1.html");
		driver.switchTo().alert().accept();
		driver.manage().window().maximize();
		WebElement EnterUsername = driver.findElement(By.name("username"));
		EnterUsername.sendKeys("Rucha0612");
		WebElement EnterHint = driver.findElement(By.name("say hello"));
		EnterHint.sendKeys("Ruch");
		WebElement EnterPassword = driver.findElement(By.name("password"));
		EnterPassword.sendKeys("Rucha@0612");
		WebElement EnterFirstName = driver.findElement(By.name("fname"));
		EnterFirstName.sendKeys("Rucha");
		//WebElement EnterLastName = driver.findElement(By.name("lname"));
		//EnterLastName.sendKeys("Gore");
		WebElement EnterFirstCheckBox = driver.findElement(By.name("name1"));
		EnterFirstCheckBox.click();
		WebElement EnterSecondCheckBox = driver.findElement(By.name("name2"));
		EnterSecondCheckBox.click();
		WebElement EnterThirdCheckBox = driver.findElement(By.name("name3"));
		EnterThirdCheckBox.click();
		driver.findElement(By.xpath("/html/body/input[4]")).click();
		driver.findElement(By.xpath("/html/body/input[5]")).click();
		driver.findElement(By.xpath("/html/body/input[6]")).click();
		WebElement DropDownOption = driver.findElement(By.id("Relegion"));
		Select s1 = new Select(DropDownOption);
		s1.selectByVisibleText("Religion 4");
 }
}