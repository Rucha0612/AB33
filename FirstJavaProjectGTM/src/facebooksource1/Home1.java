package facebooksource1;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home1 
{
	ChromeDriver driver;
	//Step 1 is done that is locating each element using FindBy annotation
		
		@FindBy(xpath="(//div[@class='x1cy8zhl x78zum5 x1iyjqo2 xs83m0k xh8yej3']/div/div)[1]")
		WebElement WhatsOnYourMind;
		
		@FindBy(xpath="//p[@class='xdj266r x11i5rnm xat24cr x1mh8g0r x16tdsg8']")
		WebElement EnterText;
		
		@FindBy(xpath="//div[@class='x1qhmfi1 xhk9q7s x1otrzb0 x1i1ezom x1o6z2jb xurb0ha x1sxyh0 x1iorvi4 xjkvuk6 x1a2a7pz']/div/i")
		WebElement privacysetting;
	   ///html/body/div[1]/div/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[1]/div/div/div/div[1]/div[2]/div[2]/div[2]/div/div/div/span/div/span/div/div/div/i
		@FindBy(xpath="(//div[@class='xod5an3 x16n37ib x14vqqas x1n2onr6 xamitd3'])[5]/div/div/i")
		WebElement Onlyme;
	    
	    @FindBy(xpath="//div[@class='x1n2onr6 x1ja2u2z x78zum5 x2lah0s xl56j7k x6s0dn4 xozqiw3 x1q0g3np xi112ho x17zwfj4 x585lrc x1403ito x972fbf xcfux6l x1qhh985 xm0m39n x9f619 xbxaen2 x1u72gb5 xtvsq51 x1r1pt67']")
	    WebElement DoneButton;
	    
	    @FindBy(xpath="/html/body/div[1]/div/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[1]/div/div/div/div[3]/div[2]/div/div/div[1]/div/span/span")
	    WebElement PostButton;
		
	//Step 2 is create separate method for each component
		public void Whatonyourmind()
		{
			WhatsOnYourMind.click();
		}
		public void Enter_Text() throws InterruptedException
		{
			Thread.sleep(3000);
			EnterText.sendKeys("Rucha1");
		}
		public void RadioButton() throws InterruptedException
		{
		privacysetting.click();
		Thread.sleep(3000);
		Onlyme.click();
		Thread.sleep(3000);
		DoneButton.click();
		Thread.sleep(3000);
		PostButton.click();
		Thread.sleep(3000);
	    }
		//Step 3 is initializing the elements using page factory class
		public Home1(ChromeDriver driver)
		{
			PageFactory.initElements(driver, this);//this keyword = method parameters are same as global variable
		}
		
		

}
