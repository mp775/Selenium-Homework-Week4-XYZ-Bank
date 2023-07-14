package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomerLoginPage extends Utility {

By searchCustomer = By.xpath("//select[@id='userSelect']");
By loginBtn = By.xpath("//button[contains(text(),'Login')]");
By logOut = By.xpath("//button[contains(text(),'Logout')]");
By yourName = By.xpath("//label[contains(text(),'Your Name :')]");

public void searchCreatedCustomerName(){
    selectByVisibleTextFromDropDown(searchCustomer,"Hermoine Granger ");

}
public void clickOnLoginBtn(){
    clickOnElement(loginBtn);
}

public String getLogOutTab(){
    return getTextFromElement(logOut);

}
public void clickOnLogOut(){
    clickOnElement(logOut);
}
public String getYourNameText(){
    return getTextFromElement(yourName);
}

}
