package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class AddCustomerPage  extends Utility {
    By addCustomerTab = By.xpath("//button[normalize-space()='Add Customer']");
    By firstNameField = By.xpath("//input[@placeholder='First Name']");
    By lastNameField = By.xpath("//input[@placeholder='Last Name']");
    By postCodeField = By.xpath("//input[@placeholder='Post Code']");
    String firstName;
    String lastName;
    String postCode;
    By addCustomerBtn = By.xpath("//button[@type = 'submit' and contains(text(),'Add Customer')]");




    public void clickOnAddCustomerTab() {
        clickOnElement(addCustomerTab);
    }

    public String getFirstName() {
        firstName = getRandomString(4);
        return firstName;
    }

    public String getLastName() {
        lastName = getRandomString(8);
        return lastName;
    }

    public String getPostCode() {
        postCode = getRandomString(6);
        return postCode;

    }

    public void fillAddCustomerForm() {
        sendTextToElement(firstNameField,getFirstName());
        sendTextToElement(lastNameField,getLastName());
        sendTextToElement(postCodeField,getPostCode());
    }

    public void clickOnAddCustomerButton() {
        clickOnElement(addCustomerBtn);
    }
}


