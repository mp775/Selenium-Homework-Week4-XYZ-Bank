package com.bank.testsuit;

import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankTest extends BaseTest {
    HomePage homePage = new HomePage();
    AddCustomerPage addCustomerPage = new AddCustomerPage();
    OpenAccountPage openAccountPage = new OpenAccountPage();
    CustomerLoginPage customerLoginPage = new CustomerLoginPage();
    CustomersPage customersPage = new CustomersPage();
    AccountPage accountPage = new AccountPage();

    @Test
    public void bankManagerShouldAddCustomerSuccessfully() {
        homePage.clickOnBankManagerLoginTab();
        addCustomerPage.clickOnAddCustomerTab();
        addCustomerPage.fillAddCustomerForm();
        addCustomerPage.clickOnAddCustomerButton();
        String expectedAlertMessage = "Customer added successfully";
        String actualAlertMessage = getTextFromAlert();
        System.out.println("Alert Popup Notification : " + actualAlertMessage);
        Assert.assertTrue(actualAlertMessage.contains(expectedAlertMessage), "Customer added successfully message validation failed");
        acceptAlert();
    }

    @Test
    public void bankManagerShouldOpenAccountSuccessfully() {
        homePage.clickOnBankManagerLoginTab();
        openAccountPage.clickOnOpenAccountTab();
        openAccountPage.selectCustomer();
        openAccountPage.selectCurrencyPound();
        openAccountPage.clickOnProcessBtn();
        String expectedAlertMessage = "Account created successfully";
        String actualAlertMessage = getTextFromAlert();
        System.out.println("Alert Popup Notification : " + actualAlertMessage);
        Assert.assertTrue(actualAlertMessage.contains(expectedAlertMessage), "Account created successfully message validation failed");
        acceptAlert();
    }

    @Test
    public void customerShouldLoginAndLogoutSuccessfully() throws InterruptedException {
        homePage.clickOnCustomerLoginTab();
        customerLoginPage.searchCreatedCustomerName();
        customerLoginPage.clickOnLoginBtn();
        Thread.sleep(2000);
        String expectedText = "Logout";
        Assert.assertEquals(customerLoginPage.getLogOutTab(), expectedText, "Logout text is not displayed");
        customerLoginPage.clickOnLogOut();
        String expectedYourNameText = "Your Name :";
        Assert.assertEquals(customerLoginPage.getYourNameText(), expectedYourNameText, "Your Name text is not displayed");
    }

    @Test
    public void customerShouldDepositMoneySuccessfully() {
        homePage.clickOnCustomerLoginTab();
        customerLoginPage.searchCreatedCustomerName();
        customerLoginPage.clickOnLoginBtn();
        customersPage.clickOnDepositBtn();
        customersPage.depositSomeAmount();
        customersPage.clickOnDepositSubmitBtn();
        String expectedAmountSubmitMessage = "Deposit Successful";
        String actualAmountSubmitMessage = customersPage.getAmountSubmitMessage();
        Assert.assertEquals(actualAmountSubmitMessage, expectedAmountSubmitMessage, "Deposit Successful message validation failed");
    }

    @Test
    public void customerShouldWithdrawMoneySuccessfully() {
        homePage.clickOnCustomerLoginTab();
        customerLoginPage.searchCreatedCustomerName();
        customerLoginPage.clickOnLoginBtn();
        accountPage.withdrawalTab();
        accountPage.withdrawalSomeAmount();
        accountPage.clickOnWithdrawalButton();
        String expectedTransitionMessage = "Transaction successful";
        String actualTransitionMessage = accountPage.getTransitionSuccessMessage();
        Assert.assertEquals(actualTransitionMessage,expectedTransitionMessage,"Transaction Successful message verification failed");
    }
}
