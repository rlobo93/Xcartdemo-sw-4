package com.x.cart.mobile.testsuite;


import com.x.cart.mobile.pages.BestsellersPage;
import com.x.cart.mobile.pages.HomepagePage;
import com.x.cart.mobile.pages.HotDealsPage;
import com.x.cart.mobile.testbase.TestBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HotDealsTest extends TestBase {
    HomepagePage homepagePage = new HomepagePage();
    HotDealsPage hotDealsPage = new HotDealsPage();
    BestsellersPage bestsellersPage = new BestsellersPage();


    @Test
    public void verifySaleProductsArrangeAlphabetically() throws InterruptedException {

//		1.1 Mouse hover on the “Hot deals” link
        homepagePage.hotDealMouseHover();
        Thread.sleep(1000);
//		1.2 Mouse hover on the “Sale”  link and click
        homepagePage.clickSaleTab();
        Thread.sleep(1000);
//		1.3 Verify the text “Sale”
        String expectedMessage = "Sale";
        String actualMessage = hotDealsPage.verifySaleText();
        Assert.assertEquals(actualMessage, expectedMessage);
        Thread.sleep(1000);
//      1.4 Mouse hover on “Sort By” and select “Name A-Z”
        hotDealsPage.selectNameAtoZ();
        Thread.sleep(1000);

//      1.5 Verify that the product arrange alphabetically

        String expectedMessage1 = "Name A - Z";
        String actualMessage1 = hotDealsPage.Verifyalphabetically();
        Assert.assertEquals(actualMessage1, expectedMessage1);
        Thread.sleep(1000);
    }

    @Test
    public void verifySaleProductsPriceArrangeLowToHigh() throws InterruptedException {

//		2.1 Mouse hover on the “Hot deals” link
        homepagePage.hotDealMouseHover();
        Thread.sleep(1000);

//		2.2 Mouse hover on the “Sale”  link and click
        homepagePage.clickSaleTab();
        Thread.sleep(1000);
//		2.3 Verify the text “Sale”
        String expectedMessage = "Sale";
        String actualMessage = hotDealsPage.verifySaleText();
        Assert.assertEquals(actualMessage, expectedMessage);
        Thread.sleep(1000);

//      2.4 Mouse hover on “Sort By” and select “Price Low-High”
        hotDealsPage.selectLowtoHigh();
//      2.5 Verify that the product’s price arrange Low to High
        String expectedMessage1 = "Low - High";
        String actualMessage1 = hotDealsPage.verifySaleText();
        Assert.assertEquals(actualMessage1, expectedMessage1);
    }

    public void verifySaleProductsArrangeByRates() throws InterruptedException {
//		3.1 Mouse hover on the “Hot deals” link
        homepagePage.hotDealMouseHover();
        Thread.sleep(1000);

//		3.2 Mouse hover on the “Sale”  link and click
        homepagePage.clickSaleTab();
        Thread.sleep(1000);
//		3.3 Verify the text “Sale”
        String expectedMessage = "Sale";
        String actualMessage = hotDealsPage.verifySaleText();
        Assert.assertEquals(actualMessage, expectedMessage);
        Thread.sleep(1000);

//      3.4 Mouse hover on “Sort By” and select “Rates”
        hotDealsPage.selectRates();
//      3.5 Verify that the product’s arrange Rates
        String expectedMessage1 = "Low - High";
        String actualMessage1 = hotDealsPage.verifyRatesText();
        Assert.assertEquals(actualMessage1, expectedMessage1);
    }


    @Test
    public void verifyBestSellersProductsArrangeByZToA() throws InterruptedException {
//		1.1 Mouse hover on the “Hot deals” link
        homepagePage.hotDealMouseHover();
        Thread.sleep(1000);

//      1.2 Mouse hover on the “Bestsellers”  link and click
        homepagePage.clickBestseller();
        Thread.sleep(1000);
//		1.3 Verify the text “Bestsellers”
        String expectedMessage = "Bestsellers";
        String actualMessage = bestsellersPage.verifyBestsellers();
        Assert.assertEquals(actualMessage, expectedMessage);
        Thread.sleep(1000);
//      1.4 Mouse hover on “Sort By” and select “Name Z-A”
        bestsellersPage.clickNameZtoA();

//      1.5 Verify that the product arrange by Z to A
        String expectedMessage1 = "Bestsellers";
        String actualMessage1 = bestsellersPage.verifyZtoA();
        Assert.assertEquals(actualMessage1, expectedMessage1);
        Thread.sleep(1000);
    }

    @Test
    public void verifyBestSellersProductsPriceArrangeHighToLow() throws InterruptedException {
//		2.1 Mouse hover on the “Hot deals” link
        homepagePage.hotDealMouseHover();
        Thread.sleep(1000);
//		2.2 Mouse hover on the “Bestsellers” link and click
        homepagePage.clickBestseller();
        Thread.sleep(1000);
//		2.3 Verify the text “Bestsellers”
        String expectedMessage = "Bestsellers";
        String actualMessage = bestsellersPage.verifyBestsellers();
        Assert.assertEquals(actualMessage, expectedMessage);
        Thread.sleep(1000);
//      2.4 Mouse hover on “Sort By” and select “Price High-Low”
        bestsellersPage.clickLowtoHigh();

//      2.5 Verify that the product’s price arrange High to Low
        String expectedMessage1 = "Bestsellers";
        String actualMessage1 = bestsellersPage.verifyhightoLow();
        Assert.assertEquals(actualMessage1, expectedMessage1);
        Thread.sleep(1000);

    }

    @Test
    public void verifyBestSellersProductsArrangeByRates() throws InterruptedException {
//		3.1 Mouse hover on the “Hot deals” link
        homepagePage.hotDealMouseHover();
        Thread.sleep(1000);
//		3.2 Mouse hover on the “Bestsellers”  link and click
        homepagePage.clickBestseller();
        Thread.sleep(1000);
//		3.3 Verify the text “Bestsellers”
        String expectedMessage = "Bestsellers";
        String actualMessage = bestsellersPage.verifyBestsellers();
        Assert.assertEquals(actualMessage, expectedMessage);
        Thread.sleep(1000);
//      3.4 Mouse hover on “Sort By” and select “Rates”
        bestsellersPage.selectRates();

//      3.5 Verify that the product’s arrange Rates
        String expectedMessage1 = "Bestsellers";
        String actualMessage1 = bestsellersPage.verifyRatesText();
        Assert.assertEquals(actualMessage1, expectedMessage1);
        Thread.sleep(1000);

    }


}
