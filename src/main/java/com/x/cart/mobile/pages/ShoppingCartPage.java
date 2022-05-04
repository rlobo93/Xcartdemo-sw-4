package com.x.cart.mobile.pages;

import com.x.cart.mobile.utility.Utility;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {



//        1.9 Verify the text “Your shopping cart - 1 item”
    By shoppingCartText=By.id("page-title");
        public String verifyShoppingCartText (){
            return getTextFromElement(shoppingCartText);
        }


//        1.10 Verify the Subtotal $99.00  (Subtotal: $299.00)
    By subtotal = By.xpath("//ul[@class='sums']//li[@class='subtotal']");
    public String verifyTheSubtotal (){
        return getTextFromElement(subtotal);
    }


//        1.11 Verify the total $106.23 ($309.73)
By total = By.xpath("//li[@class='total']");
    public String verifyTheTotal (){
        return getTextFromElement(total);
    }


//        1.12 Click on “Go to checkout” button
    By goBtn = By.xpath("//span[contains(text(),'Go to checkout')]");
    public void goTOCheckout(){
        clickOnElement(goBtn);
    }


    //    1.10 Click on “Empty your cart” link
    By emptycart = By.xpath("//a[contains(text(),'Empty your cart')]");
    public void ClickOnEmptyYourCart() {
        clickOnElement(emptycart);
    }

//    1.13 Verify the message “Item(s) deleted from your cart”

    By deleted = By.xpath("//li[contains(text(),'Item(s) deleted from your cart')]");
    public String verifyDeletedCartText (){
        return getTextFromElement(deleted);
    }

//    1.15 Verify the text “Your cart is empty”
    By empty = By.xpath("//h1[@id='page-title']");
    public String verifyEmptyCartText (){
        return getTextFromElement(empty);
    }














}
