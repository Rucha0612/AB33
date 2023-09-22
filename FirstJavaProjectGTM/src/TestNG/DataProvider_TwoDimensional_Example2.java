package TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class DataProvider_TwoDimensional_Example2 
{
	@DataProvider(name="Std_Details")
	public Object testdata()
	{
		Object data[][] = new Object[2][2];
		data[0][0]="Ram";
		data[0][1]="51";
		data[1][0]="Sita";
		data[1][1]="39";
		return data;
	}
	
	@Test(dataProvider="Std_Details")
	public void testcase(String Name,String Password) throws InterruptedException 
	{
		System.out.println(Name+Password);
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys(Name);
		driver.findElement(By.id("pass")).sendKeys(Password);
		System.out.println("Done");
		Thread.sleep(2000);
		driver.quit();
	}

}
