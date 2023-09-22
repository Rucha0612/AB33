package amazonsource;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishList 
{
	ChromeDriver driver;
	@FindBy(name="submit.add-to-cart")
	WebElement addtocart;
	
	@FindBy(name="submit.add-to-registry.wishlist")
	WebElement WishList;
	
	public void addtocartbutton()
	{
		addtocart.click();
	}
	public void addtowishlistbutton()
	{
		WishList.click();
	}
	
	//step 3 is initializing the elements using page factory class
	
	public WishList(ChromeDriver driver)
	{
		PageFactory.initElements(driver,this); //this keyword = method parameters are same as global variable
	}

}
