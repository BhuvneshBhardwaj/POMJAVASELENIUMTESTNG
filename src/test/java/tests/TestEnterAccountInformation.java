package tests;

import org.selenium.base.BaseTest;
import org.selenium.pages.EnterAccountInformation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestEnterAccountInformation extends BaseTest {

    @Test
    public void fillAccountInformation() {
        EnterAccountInformation accountInfo = new EnterAccountInformation(driver);
        accountInfo.enterAccountInformation();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(
                currentUrl.contains("/account_created"),
                "User was not navigated to Login page");

    }

}
