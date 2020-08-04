package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LandingPage;
import com.crm.qa.pages.LoginPage;
import javafx.scene.layout.Priority;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    LandingPage landingPage;
    LoginPage loginPage;
    HomePage homePage;

    public LoginPageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        TestBase.initialization();
        landingPage = new LandingPage();
    }

    @Test(priority = 0)
    public void landingPageTitleTest() {
        String title = landingPage.validateLandingPageTitle();
    }

    @Test(priority = 1)
    public void validateLoginToTheApplication() {
        loginPage = landingPage.clickSignIn();
        homePage = loginPage.loginToApplication(prop.getProperty("username"), prop.getProperty("password"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
