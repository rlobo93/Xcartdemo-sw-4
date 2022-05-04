package com.x.cart.mobile.pages;

import com.x.cart.mobile.utility.Utility;
import org.openqa.selenium.By;


public class HotDealsPage extends Utility {
    //		1.3 Verify the text “Sale”

    By saleText = By.id("page-title");
    public String verifySaleText(){
        return getTextFromElement(saleText);
    }

    //      1.4 Mouse hover on “Sort By” and select “Name A-Z”
    By sortby = By.xpath("//span[contains(text(),'Sort by:')]");
    By nameAtoZ = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]");

    public void selectNameAtoZ(){
        mouseHoverToElement(sortby);
        mouseHoverToElementAndClick(nameAtoZ);
    }
    //      1.5 Verify that the product arrange alphabetically
    By alphabetically = By.xpath("//span[contains(text(),'Name A - Z')]");
    public String Verifyalphabetically (){
        return getTextFromElement(alphabetically);
    }

    //      2.4 Mouse hover on “Sort By” and select “Price Low-High”
    By lowToHigh = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]");
    public void selectLowtoHigh(){
        mouseHoverToElement(sortby);
        mouseHoverToElementAndClick(lowToHigh);
    }

    //      2.5 Verify that the product’s price arrange Low to High
    By lowtohighText = By.xpath("//span[contains(text(),'Price Low - High')]");
    public String verifyLowtoHigh(){
        return getTextFromElement(lowtohighText);
    }
//          3.4 Mouse hover on “Sort By” and select “Rates”
    By rates =By.partialLinkText("Rates");
    public void selectRates(){
        mouseHoverToElement(sortby);
        mouseHoverToElementAndClick(rates);
    }

   //      3.5 Verify that the product’s arrange Rates
   By ratesText = By.xpath("//span[contains(text(),'Rates')]");
    public String verifyRatesText(){
        return getTextFromElement(ratesText);
    }




}
