package tests;

import org.selenium.base.BaseTest;
import org.selenium.pages.Registration;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest extends BaseTest {

    @Test
    public void registerNewUser(){

        Registration register = new Registration(driver);
        register.isHomePageDisplayed();
        register.clickSignupLogin();

        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(
                currentUrl.contains("/login"),
                "User was not navigated to Login page");

        register.submitSignupDetails();
        //https://www.automationexercise.com/signup
        String signupUrl = driver.getCurrentUrl();

        Assert.assertTrue(
                signupUrl.contains("/signup"),
                "User was not navigated to Signup page");

    }




}
