package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage extends TestBase {
    @FindBy(xpath="//span[text()='Contacts']") WebElement contact;
    @FindBy(xpath = "//a[text()='Free account']") WebElement freeAccount;


    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    //Used element for title validation since LoginPage and HomePage having same title
    public HomePage validateHomePageTitle(){
        Assert.assertTrue(freeAccount.isDisplayed());
        return this;
    }

    public ContactPage clickContact(){
        contact.click();
        return new ContactPage();
    }

}
