package mobile.pages;

import io.appium.java_client.AppiumBy;
import mobile.appiumDriver.AppiumDriverManager;
import org.openqa.selenium.By;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("ios")
@Component
public class IOSLoginPage extends LoginPage {

    private By login = AppiumBy.iOSClassChain("login");
    private By passwordLocator = AppiumBy.iOSClassChain("password");
    private By submit = AppiumBy.iOSClassChain("submit");

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
