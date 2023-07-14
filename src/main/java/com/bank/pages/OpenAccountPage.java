package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class OpenAccountPage extends Utility {
    By openAccount = By.xpath("//button[normalize-space()='Open Account']");
    By customerDropdown =By.xpath("//select[@id='userSelect']");
    By currencyDropdown = By.xpath("//select[@id='currency']");
    By process = By.xpath("//button[contains(text(),'Process')]");
    public void clickOnOpenAccountTab(){
        clickOnElement(openAccount);
    }
    public void selectCustomer(){
        selectByVisibleTextFromDropDown(customerDropdown,"Ron Weasly");

    }
    public void selectCurrencyPound(){
        selectByVisibleTextFromDropDown(currencyDropdown ,"Pound");
    }
    public void clickOnProcessBtn(){
        clickOnElement(process);
    }
}
