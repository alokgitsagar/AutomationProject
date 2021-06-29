package com.alokindustries.genericlibs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public PropertyFileData pfd=new PropertyFileData();
	public CaptureScreenShot csc=new CaptureScreenShot();
	public AllUtilities au=new AllUtilities();
	public WebDriver driver;
	
	@BeforeMethod
	public void openApp()
	{
		System.setProperty(AutoConstants.CHROMEKEY, AutoConstants.CHROMEVALUE);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(pfd.getData("url"));
		
	}
	
	@AfterMethod
	public void closeApp(ITestResult result)
	{
		int status=result.getStatus();
		
		if (status==2) {
			
			csc.getScreenShot(driver, result.getName());
			
		}else {
			driver.quit();
		}
	}
}
