package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_TenByTwoExample 
{
	@DataProvider(name="Std_Details")
	public Object testdata()
	{
		Object data[][] = new Object[10][2];
		data[0][0]="Ram";
		data[0][1]="51";
		data[1][0]="Sita";
		data[1][1]="39";
		data[2][0]="laxman";
		data[2][1]="30";
		data[3][0]="Rucha";
		data[3][1]="27";
		data[4][0]="Chinmay";
		data[4][1]="32";
		data[5][0]="Smita";
		data[5][1]="31";
		data[6][0]="Kaustubh";
		data[6][1]="31";
		data[7][0]="Reema";
		data[7][1]="52";
		data[8][0]="Rahul";
		data[8][1]="54";
		data[9][0]="Priya";
		data[9][1]="35";
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
