package amazonsource;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Shoe 
{
	 ChromeDriver driver;
		//Step 1 is done that is locating each element using FindBy annotation
		@FindBy(xpath="(//a[@class='a-link-normal s-no-outline'])[1]")
		WebElement click_firstShoe;
		
		//Step 2 is create separate method for each component
		public void clickfirstoption()
		{
			click_firstShoe.click();
		}
		
	
	//step 3 is initializing the elements using page factory class
	
	public Search_Shoe(ChromeDriver driver)
	{
		PageFactory.initElements(driver,this); //this keyword = method parameters are same as global variable
	}

}
