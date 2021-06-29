package com.alokindustries.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectedProductPage {
	
	@FindBy(id="group_1")
	private WebElement sizeSelector;
	
	@FindBy(xpath="//a[@title=\"Pink\"]")
    private WebElement pinkColorSelector;
	
	@FindBy(xpath="//i[@class=\"icon-plus\"]")
	private WebElement quantityIncrementSelector;
	
	@FindBy(name="Submit")
	private WebElement addtoCartButton;
	
	@FindBy(xpath="//span[@title=\"Close window\"]")
	private WebElement closeSuccessTab;
	
	@FindBy(xpath="//a[@title=\"View my shopping cart\"]")
	private WebElement cartShowTab;
	
	@FindBy(xpath="//a[@class=\"ajax_cart_block_remove_link\"]")
	private WebElement removefromcart;
	
	public SelectedProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getSizeofDress()
	{
		return sizeSelector;
	}
	public void addtoCart()
	{
		addtoCartButton.click();
	}
	public void quantityIncrement()
	{
		quantityIncrementSelector.click();
	}
	public void selectColorofDress()
	{
		pinkColorSelector.click();
	}
	
	public void closesuccessTab()
	{
		closeSuccessTab.click();
	}
	
	public WebElement cartShow()
	{
		return cartShowTab;
	}
	
	public void removeFromCart()
	{
		removefromcart.click();
	}
}
