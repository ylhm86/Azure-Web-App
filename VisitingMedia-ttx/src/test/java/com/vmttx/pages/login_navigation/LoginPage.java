package com.vmttx.pages.login_navigation;

import com.vmttx.utilities.BrowserUtils;
import com.vmttx.utilities.ConfigurationReader;
import com.vmttx.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//input[@class='jss61'])[1]")
    @CacheLookup
    public WebElement userNameElement;

    @FindBy(xpath = "(//input[@class='jss61'])[2]")
    @CacheLookup
    public WebElement passwordElement;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButtonElement;

    @FindBy(xpath = "//a[contains(text(),'forgot password?')]")
    public WebElement forgotPasswordElement;

    @FindBy(tagName = "h2")
    public WebElement titleElement;

    @FindBy(css = "[class='alert alert-error'] > div")
    public WebElement errorMessageElement;


    public void login(String username, String password) {
        userNameElement.sendKeys(username);
        passwordElement.sendKeys(password);
        loginButtonElement.click();
    }

    public void login() {
        String username = ConfigurationReader.getProperty("adminuser");
        String password = ConfigurationReader.getProperty("adminpassword");
        userNameElement.sendKeys(username);
        passwordElement.sendKeys(password);
        loginButtonElement.click();
    }


    public void login(String role) {
        String username = "";
        String password = "";
        if (role.equalsIgnoreCase("adminuser")) {
            username = ConfigurationReader.getProperty("adminuser");
            password = ConfigurationReader.getProperty("adminpassword");
        } else if (role.equalsIgnoreCase("salesperson")) {
            username = ConfigurationReader.getProperty("salesperson");
            password = ConfigurationReader.getProperty("salespersonpassword");
        }
        userNameElement.sendKeys(username);
        passwordElement.sendKeys(password);
        loginButtonElement.click();
    }

    public String getErrorMessage() {
        return errorMessageElement.getText();
    }


    public void goToLandingPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url" + ConfigurationReader.getProperty("environment")));
    }
}
