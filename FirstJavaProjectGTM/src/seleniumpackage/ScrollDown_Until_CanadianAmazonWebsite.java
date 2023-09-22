package seleniumpackage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class ScrollDown_Until_CanadianAmazonWebsite 
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException 
	{   driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement country1= driver.findElement(By.linkText("Canada"));
		Point xandy = country1.getLocation(); //for getting coordinates for selected element x and y axis
		int xaxis = xandy.getX(); //x coordinate
		int yaxis = xandy.getY(); //y coordinate
		System.out.println(xaxis);//432
		System.out.println(yaxis);//1725
		Thread.sleep(3000);
		JavascriptExecutor j1 = (JavascriptExecutor) driver;
		//scrolling down till canadian amazon website visible using directly local variable
		j1.executeScript("window.scrollBy("+ xaxis + ","+ yaxis +")");
		//scrolling down till canadian amazon website visible using directly coordinates which we get in console
		j1.executeScript("window.scrollBy(405,5882)");
		Thread.sleep(3000);
		//taking screenshot
		TakesScreenshot ts = (TakesScreenshot) driver;//1st step to upcast driver to TakesScreenshot Interface
		File Source = ts.getScreenshotAs(OutputType.FILE);//2nd step to utilize method of TakesScreenshot interface which is getScreenshotAs
		File destination = new File("C:\\Users\\SHARVARISH\\ECLIPSE - Automation Testing - MKT\\FirstJavaProjectGTM\\Screenshots\\Rucha"+".png");
		FileUtils.copyFile(Source, destination);
		Thread.sleep(3000);
		country1.click();
	}
}
