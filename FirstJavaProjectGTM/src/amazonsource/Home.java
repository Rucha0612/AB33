package amazonsource;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home 
{
	//Step 1 is done that is locating each element using FindBy annotation
	
	@FindBy(id="twotabsearchtextbox")
	WebElement search_tf;

	//Step 2 is create separate method for each component
	public void searching()
	{
		search_tf.sendKeys("shoe");
		search_tf.sendKeys(Keys.ENTER);
	}


	//step 3 is initializing the elements using page factory class
	
		public Home(ChromeDriver driver)
		{
			PageFactory.initElements(driver,this); //this keyword = method parameters are same as global variable
		}

}
