package TestNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class TestNG_Listners_Class implements ITestListener
{
	ChromeDriver driver;

	@Override
	public void onTestStart(ITestResult result) 
	{
		ITestListener.super.onTestStart(result);
		Reporter.log("Test Started");
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
	
		ITestListener.super.onTestSuccess(result);
		Reporter.log("Test Case successfully finished");
		TakesScreenshot ts = driver;//1st step to upcast driver to TakesScreenshot Interface
		File Source = ts.getScreenshotAs(OutputType.FILE);//2nd step to utilize method of TakesScreenshot interface which is getScreenshotAs
		File destination = new File("C:\\Users\\SHARVARISH\\ECLIPSE - Automation Testing - MKT\\FirstJavaProjectGTM\\Screenshots\\Rucha"+".png");
		try {
			FileUtils.copyFile(Source, destination);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		ITestListener.super.onTestFailure(result);
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) 
	{
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) 
	{
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) 
	{
		ITestListener.super.onFinish(context);
	}
}
