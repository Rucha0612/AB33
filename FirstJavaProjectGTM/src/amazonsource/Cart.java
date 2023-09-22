package amazonsource;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart 
{
	ChromeDriver driver;
	@FindBy(id="buy-now-button")
	WebElement buynow;
	
	@FindBy(xpath="(//input[@class='a-button-input'])[2]")
	WebElement selectaddress;
	
	@FindBy(xpath="(//div[@class='a-fixed-left-grid-col a-col-right'])[6]")
	WebElement CODButton;
	
	@FindBy(xpath="(//div[@class='a-fixed-left-grid-col a-col-left'])[4]")
	WebElement UPIbutton;
	
	@FindBy(xpath="(//div[@class='a-fixed-left-grid-col a-col-left'])[3]")
	WebElement NetBanking;
	
	@FindBy(xpath="(//div[@class='a-fixed-left-grid-col a-col-left'])[5]")
	WebElement EMI;
	
	@FindBy(xpath="(//div[@class='a-fixed-left-grid-col a-col-left'])[2]")
	WebElement CreditCardorCreditcard;
	
	public void buynowbutton() throws InterruptedException
	{
		buynow.click();
		Thread.sleep(3000);
		selectaddress.click();
	}
	public void paymentoption1() throws InterruptedException
	{
		Thread.sleep(3000);
		CODButton.click();
	}
	public void paymentoption2() throws InterruptedException
	{
		Thread.sleep(3000);
		UPIbutton.click();
	}
	public void paymentoption3() throws InterruptedException
	{
		Thread.sleep(3000);
		NetBanking.click();
	}
	public void paymentoption4() throws InterruptedException
	{
		Thread.sleep(3000);
		EMI.click();
	}
	public void paymentoption5() throws InterruptedException
	{
		Thread.sleep(3000);
		CreditCardorCreditcard.click();
	}
	
	//step 3 is initializing the elements using page factory class
	
			public Cart(ChromeDriver driver)
			{
				PageFactory.initElements(driver,this); //this keyword = method parameters are same as global variable
			}

}
