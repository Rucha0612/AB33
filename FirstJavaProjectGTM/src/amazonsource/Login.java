package amazonsource;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login 
{
    ChromeDriver driver;
	//Step 1 is done that is locating each element using FindBy annotation
	@FindBy(id="ap_email")
	WebElement username_tf;
	
	@FindBy(id="continue")
	WebElement username_continue;

	@FindBy(name="password")
	WebElement password_tf;

	@FindBy(id="signInSubmit")
	WebElement signin_button;
	
	//Step 2 is create separate method for each component
	public void un()
	{
		username_tf.sendKeys("vaidyarucha4@gmail.com");
		username_continue.click();
	}
	public void pwd()
	{
		password_tf.sendKeys("Runmay@0613");
		signin_button.sendKeys(Keys.ENTER);
	}
	
	//Step 3 is initializing the elements using page factory class
	public Login(ChromeDriver driver)
	{
		PageFactory.initElements(driver,this); //this keyword = method parameters are same as global variable
	}
}
