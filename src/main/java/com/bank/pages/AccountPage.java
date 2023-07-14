package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class AccountPage extends Utility {
    By withdrawal = By.xpath("//button[normalize-space()='Withdrawl']");
    By amountNo = By.xpath("//input[@placeholder='amount']");
    By withdrawBtn = By.xpath("//button[normalize-space()='Withdraw']");
    By transaction = By.xpath("//span[@class='error ng-binding']");

    public void withdrawalTab() {
        clickOnElement(withdrawal);
    }

    public void withdrawalSomeAmount() {
        clearWebElementText(amountNo);
        sendTextToElement(amountNo, "50");
    }

    public void clickOnWithdrawalButton() {
        clickOnElement(withdrawBtn);
    }

    public String getTransitionSuccessMessage() {
        return getTextFromElement(transaction);
    }

}
