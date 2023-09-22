package seleniumpackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfLinks_Present_In_Webpage 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> Nooflinks = driver.findElements(By.tagName("a"));
		int countoflinks = Nooflinks.size();
		System.out.println(countoflinks);
		for(int i=0;i<countoflinks;i++)
		{
			WebElement a = Nooflinks.get(i);
			String url1 = a.getAttribute("href");
			System.out.println(url1);
			String url = a.getText();
			System.out.println(url);
		}

	}
}
