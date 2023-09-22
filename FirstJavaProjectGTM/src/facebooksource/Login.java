package facebooksource;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login 
{
	ChromeDriver driver;
	
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(id="pass")
	WebElement password;
	
	@FindBy(name="login")
	WebElement login_button;
	
	public void un()
	{
		username.sendKeys("ruchavaidya@gmail.com");
	}
	public void pwd()
	{
		password.sendKeys("12345678");
	}
	public void login()
	{
		login_button.click();
	}
	
	public Login(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);;
	}

}
