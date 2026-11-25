package org.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.selenium.utils.ConfigReader;

public class Registration extends BasePage {
    private By websiteLogo = By.xpath("//img[@alt='Website for automation practice']");
    private By signupLoginLink = By.xpath("//a[contains(text(),'Signup / Login')]");
    private By username = By.xpath("//input[@placeholder='Name']");
    private By email = By.xpath("//input[@data-qa='signup-email']");
    private By clicksignup = By.xpath("//button[normalize-space()='Signup']");

    public Registration(WebDriver driver) {
        super(driver);
    }

    public boolean isHomePageDisplayed() {
        return actionUtils.isDisplayed(websiteLogo);
    }

    public void clickSignupLogin() {

        actionUtils.click(signupLoginLink);
    }

    public void submitSignupDetails() {
        actionUtils.enterText(username, ConfigReader.getProperty("username"));
        actionUtils.enterText(email, ConfigReader.getProperty("email"));
        actionUtils.click(clicksignup);
    }

}
