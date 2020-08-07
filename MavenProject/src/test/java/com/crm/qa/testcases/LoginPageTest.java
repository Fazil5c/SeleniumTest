package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LandingPage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;
import javafx.scene.layout.Priority;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

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
    }

    @Test
    public void validateLoginPage() throws IOException {
        LandingPage landingPageObject = new LandingPage();
        landingPageObject.validateLandingPageTitle()
                .validateLandingPageTitle()
                .clickSignIn()
                .validateLoginPageTitle()
                .enterUserName(prop.getProperty("username"))
                .enterPassword(prop.getProperty("password"))
                .clickLoginButton()
                .validateHomePageTitle();

    }

    @AfterMethod
    public void tearDown() throws IOException {
        TestUtil.takeScreenshotAtEndOfTest();
        driver.quit();
    }

}
