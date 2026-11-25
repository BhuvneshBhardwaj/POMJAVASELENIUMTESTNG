
package org.selenium.base;


import org.openqa.selenium.WebDriver;
import org.selenium.driver.DriverFactory;
import org.selenium.utils.ConfigReader;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    // WebDriver reference for test classes
    protected WebDriver driver;


    // This method executes before every @Test method
    @BeforeMethod(alwaysRun = true)
    public void setUp() {

        String browser = ConfigReader.getProperty("browser");
        String url = ConfigReader.getProperty("url");
        String explicitWait = ConfigReader.getProperty("explicitWait");
        DriverFactory.initDriver(browser);


        driver = DriverFactory.getDriver();

        driver.manage().window().maximize();

        driver.get(url);
    }


    // This method executes after every @Test method
    @AfterMethod(alwaysRun = true)
    public void tearDown() {

        // Step 1: Close browser session
        DriverFactory.quitDriver();

        // Step 2: Clear local driver reference
        driver = null;
    }

}
