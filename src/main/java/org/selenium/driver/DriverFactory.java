package org.selenium.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public final class DriverFactory {

    private static final ThreadLocal<WebDriver> driver =
            new ThreadLocal<>();

    private DriverFactory() {
        // Prevent object creation
    }

    public static void initDriver(String browser) {

        WebDriver webDriver;

        if (browser.equalsIgnoreCase("chrome")) {
            webDriver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("firefox")) {
            webDriver = new FirefoxDriver();

        } else {
            throw new IllegalArgumentException(
                    "Unsupported browser: " + browser);
        }

        driver.set(webDriver);

        getDriver().manage().window().maximize();
    }

    public static WebDriver getDriver() {
        if (driver.get() == null) {
            throw new IllegalStateException(
                    "WebDriver is not initialized");
        }

        return driver.get();
    }

    public static void quitDriver() {
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
        }
    }
}
