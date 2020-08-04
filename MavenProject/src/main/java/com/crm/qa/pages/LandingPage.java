package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends TestBase {
    @FindBy(xpath="//a[contains(text(),'Sign in')]")
    WebElement signInBtn;

    public LandingPage(){
        PageFactory.initElements(driver,this);
    }

    public String validateLandingPageTitle(){
        return driver.getTitle();
    }

    public LoginPage clickSignIn(){
        signInBtn.click();
        return new LoginPage();
    }

}

