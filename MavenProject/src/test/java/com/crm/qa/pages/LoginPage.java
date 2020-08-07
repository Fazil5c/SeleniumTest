package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage extends TestBase {
    @FindBy(name = "email")
    WebElement username;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(xpath = "//div[text()='Login']")
    WebElement signInBtn;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public LoginPage validateLoginPageTitle() {
        Assert.assertEquals(TestUtil.getPageTitle(),pageTitle.getProperty("loginPage"));
        return this;
    }

    public LoginPage enterUserName(String un) {
        username.sendKeys(un);
        return this;
    }

    public LoginPage enterPassword(String pwd) {
        password.sendKeys(pwd);
        return this;
    }

    public HomePage clickLoginButton() {
        signInBtn.click();
        return new HomePage();
    }
}

