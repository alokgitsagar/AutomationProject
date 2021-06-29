package com.alokindustries.scripts;

import org.testng.annotations.Test;

import com.alokindustries.genericlibs.BaseClass;
import com.alokindustries.pages.HomePage;
import com.alokindustries.pages.ProductsPage;
import com.alokindustries.pages.SelectedProductPage;

public class RemoveFromCart extends BaseClass {

	@Test
	public void removeFromCartMethod() throws InterruptedException
	{
		HomePage hp=new HomePage(driver);
		ProductsPage pp=hp.search(pfd.getData("searchfield"), driver);
		SelectedProductPage spp=pp.printedDress(driver);
		spp.quantityIncrement();
		au.dropDown(spp.getSizeofDress(),pfd.getData("size"));
		spp.selectColorofDress();
		spp.addtoCart();
		spp.closesuccessTab();
		au.mouseHover(driver, spp.cartShow());
		spp.removeFromCart();
		
		
	}
}
