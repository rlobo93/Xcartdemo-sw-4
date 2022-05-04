package com.x.cart.mobile.pages;

import com.x.cart.mobile.utility.Utility;
import dev.failsafe.internal.util.Assert;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Mouse;

public class BestsellersPage extends Utility {


    //		1.3 Verify the text “Bestsellers”
    By bestsellers = By.id("page-title");

    public String verifyBestsellers() {
        return getTextFromElement(bestsellers);
    }

    //      1.4 Mouse hover on “Sort By” and select “Name Z-A”
    By sortby = By.xpath("//span[contains(text(),'Sales')]");
    By nameAtoZ = By.partialLinkText("Name Z - A");

    public void clickNameZtoA() {
        mouseHoverToElement(sortby);
        mouseHoverToElementAndClick(nameAtoZ);
    }

    //      1.5 Verify that the product arrange by Z to A
    By ztoAText = By.xpath("//span[contains(text(),'Name Z - A')]");

    public String verifyZtoA() {
        return getTextFromElement(ztoAText);
    }

    //      2.4 Mouse hover on “Sort By” and select “Price High-Low”
    By HightoLow = By.partialLinkText("Price High - Low");

    public void clickLowtoHigh() {
        mouseHoverToElement(sortby);
        mouseHoverToElementAndClick(HightoLow);
    }

    //      2.5 Verify that the product’s price arrange High to Low
    By hightoLow = By.xpath("//span[contains(text(),'Price High - Low')]");

    public String verifyhightoLow() {
        return getTextFromElement(hightoLow);
    }


    //      3.4 Mouse hover on “Sort By” and select “Rates”
    By rates = By.partialLinkText("Rates");

    public void selectRates() {
        mouseHoverToElement(sortby);
        mouseHoverToElementAndClick(rates);
    }


    //      3.5 Verify that the product’s arrange Rates
    By ratesText = By.xpath("//span[contains(text(),'Rates')]");

    public String verifyRatesText() {
        return getTextFromElement(ratesText);
    }

    //1.4 Mouse hover on “Sort By” and select “Name A-Z”

    By clickAtoZ= By.partialLinkText("Name A - Z");
    public void selectNameAtoZ (){
        mouseHoverToElement(sortby);
        clickOnElement(clickAtoZ);
    }

    //        1.5 Click on “Add to cart” button of the product “Ollie - The App Controlled Robot”
    By iphone = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/ul[1]/li[1]/div[1]/div[2]/div[4]/div[1]/button[1]");

    public void clickonIphone () {
      mouseHoverToElement(iphone);
      clickOnElement(iphone);
    }

    //        1.6 Verify the message “Product has been added to your cart” display in  green bar
    By addedToYourCart =By.xpath("//li[contains(text(),'Product has been added to your cart')]");
    public String verifyAddedToYourCart(){
        return getTextFromElement(addedToYourCart);
    }


//        1.7 Click on X sign to close the message
    By xSign = By.xpath("//a[@class='close']");
    public void clickXSign() {
        clickOnElement(xSign);
    }



    //        1.8 Click on “Your cart” icon and Click on “View cart” button
    //“Your cart”
    By yourCart = By.xpath("//div[@title='Your cart']");
    public void clickYourCart() {
        clickOnElement(yourCart);
    }
    //“View cart”
    By viewcart = By.xpath("//span[contains(text(),'View cart')]");
    public void clickviewcart() {
        clickOnElement(viewcart);
    }


////    1.5 Click on “Add to cart” button of the product “Vinyl Idolz: Ghostbusters”
    By ghostbusters = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/ul[1]/li[8]/div[1]/div[2]/div[4]/div[1]/button[1]/span[1]");
public void selectGhostbusters(){
    mouseHoverToElement(ghostbusters);
    clickOnElement(ghostbusters);
}



}
