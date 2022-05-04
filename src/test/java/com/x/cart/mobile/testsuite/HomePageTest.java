package com.x.cart.mobile.testsuite;

import com.x.cart.mobile.pages.HomepagePage;
import com.x.cart.mobile.testbase.TestBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {

    HomepagePage homepagePage = new HomepagePage();

    @Test
    public void verifyUserShouldNavigateToShippingPageSuccessfully(){
//        1.1 Click on the “Shipping” link
        homepagePage.clickShippingTab();

//        1.2 Verify the text “Shipping”
        String expectedMessage ="Shipping";
        String actualMessage = homepagePage.verifyShippingText();
        Assert.assertEquals(actualMessage,expectedMessage);
    }

    @Test
    public void verifyUserShouldNavigateToNewPageSuccessfully(){
//        2.1 Click on the “New!” link
        homepagePage.clickNewTab();

//        2.2 Verify the text “New arrivals”
        String expectedMessage ="New arrivals";
        String actualMessage = homepagePage.verifyNewArrivalsText();
        Assert.assertEquals(actualMessage,expectedMessage);
    }

    @Test
    public void verifyUserShouldNavigateToComingsoonPageSuccessfully(){
//        3.1 Click on the “Coming soon” link
        homepagePage.clickComingSoonTab();

//        3.2 Verify the text “Coming soon”
        String expectedMessage ="Coming soon";
        String actualMessage = homepagePage.verifyComingSoonText();
        Assert.assertEquals(actualMessage,expectedMessage);
    }

    @Test
    public void verifyUserShouldNavigateToContactUsPageSuccessfully(){
//        4.1 Click on the “Contact us” link
        homepagePage.clickContactUsTab();

//        4.2 Verify the text “Contact us”
        String expectedMessage ="Contact us";
        String actualMessage = homepagePage.verifyContactUsText();
        Assert.assertEquals(actualMessage,expectedMessage);
    }


}
