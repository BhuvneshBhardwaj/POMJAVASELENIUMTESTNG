package org.selenium.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtils {

    private WebDriver driver;
    private WebDriverWait wait;

    // Constructor
    public WaitUtils(WebDriver driver) {

        this.driver = driver;

        wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(
                        Long.parseLong(ConfigReader.getProperty("explicitWait"))
                )
        );
    }

    // Wait until element is visible
    public WebElement waitForVisibility(By locator) {

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(locator)
        );
    }

    // Wait until element is clickable
    public WebElement waitForClickable(By locator) {

        return wait.until(
                ExpectedConditions.elementToBeClickable(locator)
        );
    }

    // Wait until element is present in DOM
    public WebElement waitForPresence(By locator) {

        return wait.until(
                ExpectedConditions.presenceOfElementLocated(locator)
        );
    }

    // Wait until element disappears
    public boolean waitForInvisibility(By locator) {

        return wait.until(
                ExpectedConditions.invisibilityOfElementLocated(locator)
        );
    }

    // Wait until URL contains expected text
    public boolean waitForUrlContains(String url) {

        return wait.until(
                ExpectedConditions.urlContains(url)
        );
    }
}
