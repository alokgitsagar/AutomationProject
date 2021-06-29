package com.alokindustries.genericlibs;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllUtilities {

	
	public void mouseHover(WebDriver driver,WebElement element)
	{
		Actions action=new Actions(driver);
		action.moveToElement(element).build().perform();;
		
	}
	
	public void dropDown(WebElement element,String text)
	{
		Select select=new Select(element);
		select.selectByVisibleText(text);
		}
	
	public void switchToFrame(WebDriver driver)
	{
		driver.switchTo().frame(0);
	}
	
	public void explicitWaitElement(WebDriver driver,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
	}
	
	public void scrollToElement(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
		
	}
}
