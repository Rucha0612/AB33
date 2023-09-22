package facebooktest1;
import org.testng.annotations.Test;
import facebooksource1.Login1;
import facebooksource1.Profile;
public class Test_Case2 extends LaunchandQuit
{
	/*login to facebook-> go to profile page -> Like it and comment it.*/
	@Test
	public void GoToProfileLikeandCommentOnPost() throws InterruptedException
	{
	Login1 l1 = new Login1(driver);
	l1.loginToFacebook();
	Thread.sleep(4000);
	Profile p1 = new Profile(driver);
	p1.profileclickbutton();
	Thread.sleep(6000);
	p1.postlike();
	}
}
