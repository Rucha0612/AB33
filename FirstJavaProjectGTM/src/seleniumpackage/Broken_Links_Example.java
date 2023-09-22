package seleniumpackage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Broken_Links_Example 
{
	@Test
	public static void BrokenLinks() throws IOException
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
			String u1 = a.getAttribute("href");
			System.out.println(u1);
			String url = a.getText();
			System.out.println(url);
			CreateConnectionToFindBrokenLinks(u1);
		}
	}
		
		static void CreateConnectionToFindBrokenLinks(String u1) throws IOException
		{
			URL url = new URL(u1);
			HttpURLConnection a1 = (HttpURLConnection) url.openConnection();
			a1.connect();
			System.out.println(a1.getResponseCode());
			if(a1.getResponseCode()==200)
			{
				System.out.println(u1+"Link is valid");
			}
			else
			{
				System.out.println(u1+"Link is not valid");
			}
		}
		
	

}
