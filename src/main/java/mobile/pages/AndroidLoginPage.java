package mobile.pages;

import io.appium.java_client.AppiumBy;
import mobile.appiumDriver.AppiumDriverManager;
import org.openqa.selenium.By;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("android")
public class AndroidLoginPage extends LoginPage {

    private By login = AppiumBy.accessibilityId("login");
    private By passwordLocator = AppiumBy.accessibilityId("password");
    private By submit = AppiumBy.accessibilityId("submit");

    @Override
    public LoginPage typeLogin(String userName) {
        AppiumDriverManager.getAppiumDriver().findElement(login).sendKeys(userName);
        return this;
    }

    @Override
    public LoginPage typePassword(String password) {
        AppiumDriverManager.getAppiumDriver().findElement(passwordLocator).sendKeys(password);
        return this;
    }

    @Override
    public LoginPage clickSubmit() {
        AppiumDriverManager.getAppiumDriver().findElement(submit).click();
        return this;
    }
}
