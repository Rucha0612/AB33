package facebooktest1;

import org.testng.annotations.Test;

import facebooksource1.Home1;
import facebooksource1.Login1;
import facebooksource1.Profile;

public class Test_Case1 extends LaunchandQuit
{
	/*login to facebook-> click on home button -> whats on your mind -> change it to only me -> then click on done button -> 
	then type a message "rucha" -> post it*/
	
	@Test
	public void clickingonwhatsonyourmind() throws InterruptedException
	{
		Login1 l1 = new Login1(driver);
		l1.loginToFacebook();
		Thread.sleep(3000);
		Home1 h1 = new Home1(driver);
		h1.Whatonyourmind();
		Thread.sleep(3000);
		h1.Enter_Text();
		Thread.sleep(3000);
		h1.RadioButton();
		Thread.sleep(3000);
	
	}

}
