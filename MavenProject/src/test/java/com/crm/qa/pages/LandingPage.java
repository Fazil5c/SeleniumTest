package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LandingPage extends TestBase {
    @FindBy(xpath="//span[text()='Log In']")
    WebElement signInBtn;

    public LandingPage(){
        PageFactory.initElements(driver,this);
    }

    public LandingPage validateLandingPageTitle(){
        Assert.assertEquals(TestUtil.getPageTitle(),pageTitle.getProperty("landingPage"));
        return this;
    }

    public LoginPage clickSignIn(){
        signInBtn.click();
        return new LoginPage();
    }

}

