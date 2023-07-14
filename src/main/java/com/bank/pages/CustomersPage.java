package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomersPage extends Utility {
    By deposit = By.xpath("//button[normalize-space()='Deposit']");
    By amount = By.xpath("(//input[@placeholder='amount'])[1]");
    By depositSubmit =By.xpath("//button[@type='submit']");
    By successfulMessage = By.xpath("//span[contains(text(),'Deposit Successful')]");
    public void clickOnDepositBtn(){
        clickOnElement(deposit);

    }
    public void depositSomeAmount(){
        clearWebElementText(amount);
        sendTextToElement(amount,"1000");
    }
    public void clickOnDepositSubmitBtn(){
        clickOnElement(depositSubmit);

    }
    public String getAmountSubmitMessage(){
        return getTextFromElement(successfulMessage);
    }
}
