package com.alokindustries.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
	
	@FindBy(xpath="(//a[@href=\"http://automationpractice.com/index.php?id_product=4&controller=product&search_query=dress&results=7\"])[4]")
    private WebElement selectedDress;
	
	public ProductsPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public SelectedProductPage printedDress(WebDriver driver)
	{
		selectedDress.click();
		return new SelectedProductPage(driver);
	}
}
