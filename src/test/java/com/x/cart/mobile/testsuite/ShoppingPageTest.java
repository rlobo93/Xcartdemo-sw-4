package com.x.cart.mobile.testsuite;

import com.x.cart.mobile.pages.*;
import com.x.cart.mobile.testbase.TestBase;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ShoppingPageTest extends TestBase {
    HomepagePage homepagePage = new HomepagePage();
    HotDealsPage hotDealsPage = new HotDealsPage();
    BestsellersPage bestsellersPage = new BestsellersPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckoutPage checkoutPage = new CheckoutPage();

    @Test
    public void verifyThatUserShouldPlaceOrderSuccessfullyForOllieTheAppControlled() throws InterruptedException {

//        1.1 Mouse hover on the “Hot deals” link
        homepagePage.hotDealMouseHover();
        Thread.sleep(1000);

//        1.2 Mouse hover on the “Bestsellers”  link and click
        homepagePage.clickBestseller();
        Thread.sleep(1000);

//        1.3 Verify the text “Bestsellers”
        String expectedMessage = "Bestsellers";
        String actualMessage = bestsellersPage.verifyBestsellers();
        Assert.assertEquals(actualMessage, expectedMessage);
        Thread.sleep(1000);

//        1.4 Mouse hover on “Sort By” and select “Name A-Z”
        bestsellersPage.selectNameAtoZ();
        Thread.sleep(1000);

//        1.5 Click on “Add to cart” button of the product “Ollie - The App Controlled Robot”
        bestsellersPage.clickonIphone();
        Thread.sleep(1000);

//        1.6 Verify the message “Product has been added to your cart” display in  green bar
        String expectedMessage2 = "Product has been added to your cart";
        String actualMessage2 = bestsellersPage.verifyAddedToYourCart();
        Assert.assertEquals(actualMessage2, expectedMessage2);
        Thread.sleep(1000);
//        1.7 Click on X sign to close the message
        bestsellersPage.clickXSign();
        Thread.sleep(1000);

        //*******************************************shopping cart****************************//
//        1.8 Click on “Your cart” icon and Click on “View cart” button
        bestsellersPage.clickYourCart();
        Thread.sleep(1000);
        bestsellersPage.clickviewcart();
        Thread.sleep(3000);

//        1.9 Verify the text “Your shopping cart - 1 item”
        String expectedMessage3 = "Your shopping cart - 1 item";
        String actualMessage3 = shoppingCartPage.verifyShoppingCartText();
        Assert.assertEquals(actualMessage3, expectedMessage3);
        Thread.sleep(1000);

//        1.10 Verify the Subtotal $99.00  (Subtotal: $299.00)
        String expectedMessage4 = "Subtotal: $299.00";
        String actualMessage4 = shoppingCartPage.verifyTheSubtotal();
        Assert.assertEquals(actualMessage4, expectedMessage4);
        Thread.sleep(1000);

//        1.11 Verify the total $106.23 ($309.73)
        String expectedMessage5 = "$309.73";
        String actualMessage5 = shoppingCartPage.verifyTheTotal();
        Assert.assertEquals(actualMessage5, expectedMessage5);
        Thread.sleep(1000);

//        1.12 Click on “Go to checkout” button
        shoppingCartPage.goTOCheckout();
//*******************************************checkout*************************************//

//        1.13 Verify the text “Log in to your account”
        String expectedMessage6 = "Log in to your account";
        String actualMessage6 = checkoutPage.verifyLoginText();
        Assert.assertEquals(actualMessage6, expectedMessage6);
        Thread.sleep(1000);
//        1.14 Enter Email address
        checkoutPage.enterEmail1("r11233@gamil.com");
        Thread.sleep(1000);
//        1.15 Click on “Continue” Button
        checkoutPage.clickContinueBtn();
        Thread.sleep(1000);
//        1.16 Verify the text “Secure Checkout”
        String expectedMessage7 = "Secure Checkout";
        String actualMessage7 = checkoutPage.verifySecurecheckout();
        Assert.assertEquals(actualMessage7, expectedMessage7);
        Thread.sleep(3000);

//        1.17 Fill all the mandatory fields
        //Enter first name
        checkoutPage.enterFirstName("Ron");
        Thread.sleep(1000);

        // Enter last name
        checkoutPage.enterLastname("Jira");
        Thread.sleep(1000);

        // Enter Address
        checkoutPage.enterAddress("105 london street");
        Thread.sleep(1000);

        // Enter State
        checkoutPage.enterState("Middlesex");

        // Zip C
        checkoutPage.enterZip("Ub10 10BU");
        Thread.sleep(1000);

        //phone number
        checkoutPage.enterPhoneNumber("07412348678");
        Thread.sleep(3000);

//        1.18 Check the check box “Create an account for later use”
        checkoutPage.clickCreateAccountLater();
        Thread.sleep(2000);

//        1.19 Enter the password
        checkoutPage.enterPassword("Rlobo1993?");
        Thread.sleep(2000);

//        1.20 Select the Delivery Method to “Local Shipping”
        checkoutPage.clickLocalShipping();
        Thread.sleep(1000);

//        1.21 Select Payment Method “COD”
        checkoutPage.PaymentMethodCOD();
        Thread.sleep(1000);

//        1.22 Verify the total $99.00 ($299.00)
        String expectedMessage8 = "$311.03";
        String actualMessage8 =checkoutPage.verifyTotal();
        Assert.assertEquals(actualMessage8, expectedMessage8);
        Thread.sleep(2000);

//        1.23 Click on “Place Order” Button
        checkoutPage.clickPlaceOrder();
        Thread.sleep(1000);

//        1.24 Verify the text “Thank you for your order”
        String expectedMessage9 = "Thank you for your order";
        String actualMessage9 = checkoutPage.verifyThankOrderText();
        Assert.assertEquals(actualMessage9, expectedMessage9);
    }

    @Test
    public void verifyThatUserShouldClearShoppingCartSuccessfully() throws InterruptedException {

//    1.1 Mouse hover on the “Hot deals” link
        Thread.sleep(1000);
        homepagePage.hotDealMouseHover();
        Thread.sleep(1000);

//    1.2 Mouse hover on the “Bestseller”  link and click
        homepagePage.clickBestseller();
        Thread.sleep(1000);

//    1.3 Verify the text “Bestsellers”
        String expectedMessage ="Bestsellers";
        String actualMessage =bestsellersPage.verifyBestsellers();
        Assert.assertEquals(actualMessage,expectedMessage);

//    1.4 Mouse hover on “Sort By” and select “Name A-Z”
        bestsellersPage.selectNameAtoZ ();

//    1.5 Click on “Add to cart” button of the product “Vinyl Idolz: Ghostbusters”
        bestsellersPage.selectGhostbusters();


//    1.6 Verify the message “Product has been added to your cart” display in  green bar
        String expectedMessage2 ="Product has been added to your cart";
        String actualMessage2 = bestsellersPage.verifyAddedToYourCart();
        Assert.assertEquals(actualMessage2,expectedMessage2);

//    1.7 Click on X sign to close the message
        bestsellersPage.clickXSign();

//    1.8 Click on “Your cart” icon and Click on “View cart” button
        bestsellersPage.clickYourCart();
        Thread.sleep(1000);
        bestsellersPage.clickviewcart();
        Thread.sleep(3000);

//    1.9 Verify the text “Your shopping cart - 1 item”
        String expectedMessage3 ="Your shopping cart - 1 item";
        String actualMessage3 = shoppingCartPage.verifyShoppingCartText();
        Assert.assertEquals(actualMessage3,expectedMessage3);
        Thread.sleep(2000);

//    1.10 Click on “Empty your cart” link
        shoppingCartPage.ClickOnEmptyYourCart();
        Thread.sleep(1000);

//    1.11 Verify the text “Are you sure you want to clear your cart?” on alert
        Alert alert = driver.switchTo().alert();
        String expectedMessage4 ="Are you sure you want to clear your cart?";
        String actualMessage4 = alert.getText();
        Assert.assertEquals(actualMessage4,expectedMessage4);

//    1.12 Click “Ok” on alert
        acceptAlert();
        Thread.sleep(1000);

//    1.13 Verify the message “Item(s) deleted from your cart”
        String expectedMessage5 ="Item(s) deleted from your cart";
        String actualMessage5 = shoppingCartPage.verifyDeletedCartText ();
        Assert.assertEquals(actualMessage5,expectedMessage5);

//    1.15 Verify the text “Your cart is empty”
        String expectedMessage6 ="Your cart is empty";
        String actualMessage6 = shoppingCartPage.verifyEmptyCartText ();
        Assert.assertEquals(actualMessage6,expectedMessage6);
   }



}
