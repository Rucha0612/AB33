package seleniumpackage;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
public class Example8_AmazonDropDown 
{	public static void main(String[] args) 
	{
	/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHARVARISH\\ECLIPSE - Automation Testing - MKT\\FirstJavaProjectGTM\\Driver\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.setBinary("D:\\Automation Testing by MKT - Rucha Gore\\ChromeDriver and Chrome\\chrome-win64\\chrome-win64\\chrome.exe");
	ChromeDriver driver = new ChromeDriver(options);*/
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement DropDownOption = driver.findElement(By.id("searchDropdownBox"));
		Select s1 = new Select(DropDownOption);
		s1.selectByVisibleText("Books"); //select DROP dOWN Option by selectByVisibleText
		List<WebElement> dropdown = s1.getOptions();
		int a = dropdown.size();
		System.out.println(a);
		//s1.selectByValue("search-alias=fashion"); //select DROP dOWN Option by selectByValue
		//s1.selectByIndex(10);//select DROP dOWN Option by selectByIndex
		/*WebElement SearchBox = driver.findElement(By.id("twotabsearchtextbox"));
		SearchBox.sendKeys("Rich Dad Poor Dad");
		SearchBox.sendKeys(Keys.ENTER);
		WebElement SelectBook = driver.findElement(By.linkText("Rich Dad Poor Dad (Bengali)"));
		SelectBook.click();*/
		for(int i=0;i<a;i++)
		{
			WebElement a1 = dropdown.get(i);
			String url = a1.getText();
			System.out.println(url);
			/*
		String url1 = a1.getTagName();
			System.out.println(url1);*/
		}
	}
}