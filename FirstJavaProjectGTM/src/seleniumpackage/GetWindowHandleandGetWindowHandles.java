package seleniumpackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetWindowHandleandGetWindowHandles 
{

	public static void main(String[] args) throws InterruptedException 
	{
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHARVARISH\\ECLIPSE - Automation Testing - MKT\\FirstJavaProjectGTM\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("D:\\Automation Testing by MKT - Rucha Gore\\ChromeDriver and Chrome\\chrome-win64\\chrome-win64\\chrome.exe");
		ChromeDriver driver = new ChromeDriver(options);*/
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().window().maximize();
		WebElement Googlelink = driver.findElement(By.xpath("//span[.='Google']"));
		Googlelink.click();
		String parentId = driver.getWindowHandle();
		Set<String> parentandchildid = driver.getWindowHandles();
		System.out.println(parentId);
		System.out.println(parentandchildid);
		Iterator<String> p1 = parentandchildid.iterator();
		String ParentID = p1.next();
		System.out.println(ParentID);
		String ChildID = p1.next();
		System.out.println(ChildID);
		Thread.sleep(3000);
		driver.switchTo().window(ChildID);//this line will move the control from parent browser or id to child browser or id
		WebElement emailid = driver.findElement(By.id("identifierId"));
		emailid.sendKeys("vaidyarucha4@gmail.com");
		driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[2]")).click();
		
		//driver.close();
		

	}

}
