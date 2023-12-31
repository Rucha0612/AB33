package TestNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Mechanism implements IRetryAnalyzer
{
	int count = 0;
	int retrycount = 4;

	@Override
	public boolean retry(ITestResult result) 
	{
		
		if(count<retrycount)
		{
			count++;
			return true;
		}
		return false;
	}

}
