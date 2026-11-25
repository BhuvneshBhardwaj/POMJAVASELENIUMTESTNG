package org.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private By websiteLogo = By.xpath("//img[@alt='Website for automation practice']");
    private By signupLoginLink =
            By.xpath("//a[contains(text(),'Signup / Login')]");

    public HomePage(WebDriver driver) {

        super(driver);
    }

    public void verifyHomePageIsDisplayed() {

        actionUtils.isDisplayed(websiteLogo);
    }

    public void clickSignupLogin() {

        actionUtils.click(signupLoginLink);
    }

}
