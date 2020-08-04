package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {
    @FindBy(id="email")
    WebElement username;

    @FindBy(id="passwd")
    WebElement password;

    @FindBy(name="SubmitLogin")
    WebElement signInBtn;

    public LoginPage(){
        PageFactory.initElements(driver, this);
    }

    public HomePage loginToApplication(String un,String pwd){
        username.sendKeys(un);
        password.sendKeys(pwd);
        signInBtn.click();
        return new HomePage();
    }
}

