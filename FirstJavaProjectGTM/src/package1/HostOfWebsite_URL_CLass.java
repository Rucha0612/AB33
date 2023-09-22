package package1;

import java.net.MalformedURLException;
import java.net.URL;

public class HostOfWebsite_URL_CLass 
{
	public static void main(String[] args) throws MalformedURLException 
	{
		URL u1 = new URL("https://flipkart.com/grocery-supermart-store");
		System.out.println(u1.getHost());
		System.out.println(u1.getPort());
		System.out.println(u1.getProtocol());
		System.out.println(u1.getFile());
			
	}
}
