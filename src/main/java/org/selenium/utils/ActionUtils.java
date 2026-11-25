package org.selenium.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ActionUtils {

    private WebDriver driver;
    private WaitUtils waitUtils;

    // Constructor
    public ActionUtils(WebDriver driver) {

        this.driver = driver;
        waitUtils = new WaitUtils(driver);
    }

    // Click on element
    public void click(By locator) {

        WebElement element = waitUtils.waitForClickable(locator);
        element.click();
    }

    public void doubleClick(By locator) {
        Actions actions = new Actions(driver);
        WebElement element = waitUtils.waitForClickable(locator);
        actions.doubleClick(element).perform();
    }


    // Enter text into textbox
    public void enterText(By locator, String text) {

        WebElement element = waitUtils.waitForVisibility(locator);

        element.clear();
        element.sendKeys(text);
    }

    // Get text from element
    public String getText(By locator) {

        WebElement element = waitUtils.waitForVisibility(locator);

        return element.getText();
    }

    // Check whether element is displayed
    public boolean isDisplayed(By locator) {

        try {
            waitUtils.waitForVisibility(locator);
            return true;

        } catch (org.openqa.selenium.TimeoutException e) {
            return false;
        }
    }

    // Get attribute value
    public String getAttribute(By locator, String attributeName) {

        WebElement element = waitUtils.waitForVisibility(locator);

        return element.getAttribute(attributeName);
    }

    public void SelectRadioButton(By locator) {
        WebElement element = waitUtils.waitForClickable(locator);
        if (!element.isSelected()) {
            element.click();
        }
    }

    public void SelectDropdownByValue(By locator, String value) {
        WebElement element = waitUtils.waitForClickable(locator);
       Select dropdown = new Select(element);
        dropdown.selectByValue(value);
    }
}
