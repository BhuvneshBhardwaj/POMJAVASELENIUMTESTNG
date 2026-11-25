package org.selenium.pages;

import org.selenium.utils.ActionUtils;
import org.selenium.utils.WaitUtils;
import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver driver;

    protected WaitUtils waitUtils;

    protected ActionUtils actionUtils;


    // Constructor
    public BasePage(WebDriver driver) {

        // Initialize WebDriver
        this.driver = driver;

        // Initialize WaitUtils
        waitUtils = new WaitUtils(driver);

        // Initialize ActionUtils
        actionUtils = new ActionUtils(driver);
    }


    // Open application URL
    public void openUrl(String url) {

        driver.get(url);
    }


    // Get current page URL
    public String getCurrentUrl() {

        return driver.getCurrentUrl();
    }


    // Get page title
    public String getPageTitle() {

        return driver.getTitle();
    }


    // Refresh current page
    public void refreshPage() {

        driver.navigate().refresh();
    }


    // Navigate back
    public void navigateBack() {

        driver.navigate().back();
    }


    // Navigate forward
    public void navigateForward() {

        driver.navigate().forward();
    }
}
