package excelpackage;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ExcelSheet_FlipkartLogin 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		FileInputStream f1 = new FileInputStream("C:\\Users\\SHARVARISH\\ECLIPSE - Automation Testing - MKT\\FirstJavaProjectGTM\\ExcelFolder\\Rucha Excel Sheet.xlsx");
		Workbook wb = WorkbookFactory.create(f1);
		Sheet s1 = wb.getSheet("Login");
		String username = s1.getRow(1).getCell(0).getStringCellValue();
		String mobileno = NumberToTextConverter.toText(s1.getRow(1).getCell(2).getNumericCellValue());
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHARVARISH\\ECLIPSE - Automation Testing - MKT\\FirstJavaProjectGTM\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("D:\\Automation Testing by MKT - Rucha Gore\\ChromeDriver and Chrome\\chrome-win64\\chrome-win64\\chrome.exe");
		ChromeDriver driver = new ChromeDriver(options);*/
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement CrossMark = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		CrossMark.click();
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys(mobileno);
		Thread.sleep(1000);
		System.out.println("Done");
		
	}
}
