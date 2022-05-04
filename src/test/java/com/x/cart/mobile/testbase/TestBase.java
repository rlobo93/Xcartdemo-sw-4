package com.x.cart.mobile.testbase;


import com.x.cart.mobile.propertyreader.PropertyReader;
import com.x.cart.mobile.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    public void setUp() {
        selectBrowser(browser);
    }


    @AfterMethod
    public void tearDown() {
        closeBrowser();
    }

}
