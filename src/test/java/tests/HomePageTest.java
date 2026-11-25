package tests;

import org.selenium.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.selenium.base.BaseTest;

public class HomePageTest extends BaseTest {

    @Test
    public void verifySignupLoginNavigation() {

        // Create HomePage object
        HomePage homePage = new HomePage(driver);
        // Verify HomePage is displayed
        homePage.verifyHomePageIsDisplayed();
        // Click Signup / Login
        homePage.clickSignupLogin();

        // Verify navigation
        String currentUrl = driver.getCurrentUrl();

        Assert.assertTrue(
                currentUrl.contains("/login"),
                "User was not navigated to Login page"
        );
    }
}
