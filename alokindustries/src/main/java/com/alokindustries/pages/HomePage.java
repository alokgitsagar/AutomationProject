package com.alokindustries.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(id = "search_query_top")
	private WebElement searchBox;

	@FindBy(name = "submit_search")
	private WebElement searchBtn;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public ProductsPage search(String searchValue,WebDriver driver)
	{
		searchBox.sendKeys(searchValue);
		searchBtn.click();
		return new ProductsPage(driver);
	}
}
