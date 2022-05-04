package com.x.cart.mobile.pages;


import com.x.cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class HomepagePage extends Utility {


    //        1.1 Click on the “Shipping” link
    By shipping = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[3]/a[1]/span[1]");
    public void clickShippingTab() {
        clickOnElement(shipping);
    }
    //        1.2 Verify the text “Shipping”
    By shippingText = By.id("page-title");
    public String verifyShippingText (){
        return getTextFromElement(shippingText);
    }

//        2.1 Click on the “New!” link
    By newTab =By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[4]/a[1]/span[1]");
    public void clickNewTab() {
     clickOnElement(newTab);
    }

//        2.2 Verify the text “New arrivals”
    By newArrivals = By.id("page-title");
    public String verifyNewArrivalsText (){
        return getTextFromElement(newArrivals);
    }

//        3.1 Click on the “Coming soon” link
    By comingSoon =  By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[5]/a[1]/span[1]");
    public void clickComingSoonTab() {
        clickOnElement(comingSoon);
    }

//        3.2 Verify the text “Coming soon”
    By comingSoonText = By.id("page-title");
    public String verifyComingSoonText(){
        return getTextFromElement(comingSoonText);
    }

//        4.1 Click on the “Contact us” link
    By contactUs = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[6]/a[1]/span[1]");
    public void clickContactUsTab() {
        clickOnElement(contactUs);
    }

//        4.2 Verify the text “Contact us”
    By contactUsText = By.id("page-title");

    public String verifyContactUsText(){
        return getTextFromElement(contactUsText);
    }

    //		1.1 Mouse hover on the “Hot deals” link
    By mhHotDeals =By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/span[1]");
    public void hotDealMouseHover() {
        mouseHoverToElement(mhHotDeals);
    }

    //		1.2 Mouse hover on the “Sale”  link and click
    By sale = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[1]");
    public void clickSaleTab(){
//    mouseHoverToElement(sale);
    clickOnElement(sale);
    }

    //      1.2 Mouse hover on the “Bestsellers”  link and click
    By bestseller = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[2]/a[1]/span[1]");
    public void clickBestseller(){
//        mouseHoverToElement(sale);
        clickOnElement(bestseller);
    }









}
