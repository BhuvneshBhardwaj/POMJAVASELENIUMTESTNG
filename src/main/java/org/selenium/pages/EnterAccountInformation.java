package org.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EnterAccountInformation extends BasePage {

    private By title = By.xpath("//input[@id='id_gender1']");
    private By password = By.xpath("//input[@id='password']");
    private By dobdate = By.xpath("//select[@id='days']");
    private By dobmonths = By.xpath("//select[@id='months']");
    private By dobyear = By.xpath("//select[@id='years']");
    private By firstName = By.xpath("//input[@id='first_name']");
    private By lastName = By.xpath("//input[@id='last_name']");
    private By company = By.xpath("//input[@id='company']");
    private By address1 = By.xpath("//input[@id='address1']");
    private By country = By.xpath("//select[@id='country']");
    private By state = By.xpath("//input[@id='state']");
    private By city = By.xpath("//input[@id='city']");
    private By zipcode = By.xpath("//input[@id='zipcode']");
    private By mobileNumber = By.xpath("//input[@id='mobile_number']");
    private By createAccount = By.xpath("//button[normalize-space()='Create Account']");


    public EnterAccountInformation(WebDriver driver) {
        super(driver);
    }

    public void enterAccountInformation() {
        Registration registration = new Registration(driver);
        registration.clickSignupLogin();
        registration.submitSignupDetails();
        actionUtils.SelectRadioButton(title);
        actionUtils.enterText(password, "test");
        actionUtils.SelectDropdownByValue(dobdate, "31");
        actionUtils.SelectDropdownByValue(dobmonths, "12");
        actionUtils.SelectDropdownByValue(dobyear, "2000");
        actionUtils.enterText(firstName, "test");
        actionUtils.enterText(lastName, "test");
        actionUtils.enterText(company, "Nalco");
        actionUtils.enterText(address1, "Sector 18, Gurgaon");
        actionUtils.SelectDropdownByValue(country, "India");
        actionUtils.enterText(state, "Haryana");
        actionUtils.enterText(city, "Gurgaon");
        actionUtils.enterText(zipcode, "122018");
        actionUtils.enterText(mobileNumber, "9876543210");
        actionUtils.click(createAccount);

    }
}
