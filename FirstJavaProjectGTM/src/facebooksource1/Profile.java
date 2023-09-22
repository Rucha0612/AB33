package facebooksource1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Profile 
{
	ChromeDriver driver;
	        //Step 1 is done that is locating each element using FindBy annotation
	        @FindBy(xpath="(//span[@class='x1lliihq x6ikm8r x10wlt62 x1n2onr6'])[1]")
			WebElement profile_click;
			
	        @FindBy(xpath="(//div[@class='x9f619 x1n2onr6 x1ja2u2z x78zum5 xdt5ytf x193iq5w xeuugli x1r8uery x1iyjqo2 xs83m0k xg83lxy x1h0ha7o x10b6aqq x1yrsyyn'])[2]")
			WebElement Like;

	    /*    @FindBy(xpath="(//div[@class='x1n2onr6'])[3]/div")
	        WebElement TypeComment;
	        
	        @FindBy(xpath="/html/body/div[1]/div/div[1]/div/div[3]/div/div/div/div[1]/div[1]/div/div/div[4]/div[2]/div/div[2]/div[3]/div[1]/div/div/div/div/div/div/div/div/div/div/div[8]/div/div/div[4]/div/div/div[2]/div[2]/div/div/div/div/div[2]/form/div/div[2]/div/div[2]/div/div/div/span/div")
	        WebElement CommentPost;
	        
			@FindBy(xpath="(//span[@class='x193iq5w xeuugli x13faqbe x1vvkbs x1xmvt09 x1lliihq x1s928wv xhkezso x1gmr53x x1cpjm7i x1fgarty x1943h6x xudqn12 x3x7a5m x6prxxf xvq8zen xk50ysn xzsf02u x1yc453h'])[5]")
		    WebElement Logout_Button;*/
			
			//Step 2 is create separate method for each component
			public void profileclickbutton() throws InterruptedException
			{
				//Thread.sleep(3000);
				profile_click.click();
			}
			public void postlike() throws InterruptedException
			{
				//Thread.sleep(3000);
				Like.click();
			}
			public void commentbutton()
			{
				//Thread.sleep(3000);
			//	TypeComment.sendKeys("Good");
				//Thread.sleep(3000);
				//CommentPost.click();
			}
			public void logoutbutton() throws InterruptedException
			{
				//Thread.sleep(5000);
				//Logout_Button.click();
			}
			//Step 3 is initializing the elements using page factory class
			public Profile(ChromeDriver driver)
			{
				PageFactory.initElements(driver, this);//this keyword = method parameters are same as global variable
			}
}
