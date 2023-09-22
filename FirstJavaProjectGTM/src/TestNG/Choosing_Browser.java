package TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Choosing_Browser 
{
WebDriver driver;
	@Test
	@Parameters("browser") //key - browser and value - chrome or firefox or mozilla or edge etc
	void Browser1(String nameofyourbrowser) 
	{
		if(nameofyourbrowser.equals("Chrome"))
		{
		driver = new ChromeDriver();
	    }
		if(nameofyourbrowser.equals("firefox"))
		{
		driver = new FirefoxDriver();
	    }
		if(nameofyourbrowser.equals("edge"))
		{
		driver = new EdgeDriver();
	    }
		driver.get("https://www.google.com/");
		//driver.manage().window().maximize();
		driver.findElement(By.id("APjFqb")).sendKeys("India");
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
		System.out.println("Done");
		System.out.println(driver.getTitle());
		driver.close();
	}
}