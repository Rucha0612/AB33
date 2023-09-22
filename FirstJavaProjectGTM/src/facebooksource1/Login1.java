package facebooksource1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login1 
{
	ChromeDriver driver;
	//Step 1 is done that is locating each element using FindBy annotation
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="pass")
	WebElement password;
	
	@FindBy(name="login")
	WebElement login_button;
	
	//Step 2 is create separate method for each component
	public void loginToFacebook() throws InterruptedException
	{
		username.sendKeys("vaidyarucha4@gmail.com");
		Thread.sleep(2000);
		password.sendKeys("Runmay@0613");
		Thread.sleep(2000);
		login_button.click();
	}
	
	//Step 3 is initializing the elements using page factory class
	public Login1(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);//this keyword = method parameters are same as global variable
	}
}
