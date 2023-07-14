package com.bank.testbase;

import com.bank.propertyreder.PropertyReader;
import com.bank.utilities.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility {
    String browser = PropertyReader.getInstance().getProperty("browser");
    String baseUrl = PropertyReader.getInstance().getProperty("baseUrl");
    @BeforeMethod
    public void setUp(){
        selectBrowser(browser);
        getURL(baseUrl);
    }
    @AfterMethod
    public void tearDown(){
        closeBrowser();
    }
}

