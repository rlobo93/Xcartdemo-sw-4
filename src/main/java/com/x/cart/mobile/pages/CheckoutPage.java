package com.x.cart.mobile.pages;

import com.x.cart.mobile.utility.Utility;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;

public class CheckoutPage extends Utility {


    //        1.13 Verify the text “Log in to your account”
    By loginText = By.xpath("//h3[contains(text(),'Log in to your account')]");

    public String verifyLoginText() {
        return getTextFromElement(loginText);
    }


    ////        1.14 Enter Email address
    By email = By.id("email");

    public void enterEmail1(String text) {
        sendTextToElement(email, text);
    }


    //        1.15 Click on “Continue” Button
    By continueBtn = By.xpath("//tbody/tr[2]/td[1]/button[1]");

    public void clickContinueBtn() {
        clickOnElement(continueBtn);
    }

    //        1.16 Verify the text “Secure Checkout”
    By securecheckout = By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/h1[1]");

    public String verifySecurecheckout() {
        return getTextFromElement(securecheckout);
    }


    //        1.17 Fill all the mandatory fields
    //Enter first name
    By firstname = By.id("shippingaddress-firstname");

    public void enterFirstName(String text) {
        clearValue(firstname);
        sendTextToElement(firstname, text);
    }

    // Enter last name
    By lastname = By.id("shippingaddress-lastname");

    public void enterLastname(String text) {
        clearValue(lastname);
        sendTextToElement(lastname, text);
    }

    // Enter Address
    By address = By.id("shippingaddress-street");

    public void enterAddress(String text) {
        clearValue(address);
        sendTextToElement(address, text);
    }

    // Enter State
    By state = By.id("shippingaddress-custom-state");

    public void enterState(String text) {
        clearValue(state);
        sendTextToElement(state, text);
    }


    // Zip C
    By zip = By.xpath("//input[@id='shippingaddress-zipcode']");

    public void enterZip(String text) {
        clearValue(zip);
        sendTextToElement(zip, text);
    }

    //phone number
    By pNumber = By.id("shippingaddress-phone");

    public void enterPhoneNumber(String text) {
        clearValue(pNumber);
        sendTextToElement(pNumber, text);
    }

    //        1.18 Check the check box “Create an account for later use”
    By checkbox = By.id("create_profile");
    public void clickCreateAccountLater() {
        clickOnElement(checkbox);
    }

    //        1.19 Enter the password
    By password = By.id("password");
    public void enterPassword(String text) {
        sendTextToElement(password, text);
    }

    //        1.20 Select the Delivery Method to “Local Shipping”
    By localShipping = By.id("method128");
    public void clickLocalShipping() {
        clickOnElement(localShipping);
    }

    //        1.21 Select Payment Method “COD”
    By cod = By.id("pmethod6");
    public void PaymentMethodCOD() {
        clickOnElement(cod);
    }

    //        1.22 Verify the total $99.00 ($299.00)
    By total = By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]");

    public String verifyTotal() {
        return getTextFromElement(total);
    }

    //        1.23 Click on “Place Order” Button
    By oderBtn = By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[4]/button[1]");

    public void clickPlaceOrder() {
        clickOnElement(oderBtn);
    }

    //        1.24 Verify the text “Thank you for your order”
    By thankYou = By.id("page-title");

    public String verifyThankOrderText() {
        return getTextFromElement(thankYou);
    }


}
