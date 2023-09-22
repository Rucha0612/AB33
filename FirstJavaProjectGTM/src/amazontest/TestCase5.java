package amazontest;

import java.util.Iterator;
import java.util.Set;

import org.testng.Reporter;
import org.testng.annotations.Test;

import amazonsource.Cart;
import amazonsource.Home;
import amazonsource.Login;

import amazonsource.Search_Shoe;

public class TestCase5 extends LaunchQuit
{
	//login-> searchingshoe -> adding the shoe in wishlist -> adding it to cart -> 
		//making the payment using CREDIT CARD or DebitCard
	@Test
	public void bookingtheproductusingCREDITCARD() throws InterruptedException
	{
		Login l1 = new Login(driver);
		l1.un();
		l1.pwd();
		Thread.sleep(2000);
		Home a = new Home(driver);
		a.searching();
		Thread.sleep(2000);
		Search_Shoe a1 = new Search_Shoe(driver);
		a1.clickfirstoption();
		Thread.sleep(2000);
		//WishList w1 = new WishList(driver);
		//w1.addtocartbutton();
		//Thread.sleep(2000);
		Set<String> pcid = driver.getWindowHandles();
		Iterator<String> p1 =pcid.iterator();
	String parentid = p1.next();
	String childid=p1.next();
	driver.switchTo().window(childid);
	Thread.sleep(2000);
		Cart c1 = new Cart(driver);
		c1.buynowbutton();
		Thread.sleep(3000);
		c1.paymentoption5();
		Thread.sleep(3000);
		Reporter.log("Test Case 5 Pass");//use this only in TestNG
	}

}
