package mobile.appiumDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import mobile.capabilities.CapabilitiesManager;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumDriverManager {

    private static AppiumDriver appiumDriver;

    public static AppiumDriver getAppiumDriver() {
        if (appiumDriver == null) {
            appiumDriver = createDriver();
        }
        return appiumDriver;
    }

    public static void tearDownDriver() {
        if (appiumDriver != null) {
            appiumDriver.quit();
        }
    }

    private static AppiumDriver createDriver() {
        String activeProfile = System.getProperty("spring.profiles.active");
        switch (activeProfile) {
            case "android": {
                try {
                    appiumDriver = new AndroidDriver(new URL(""), CapabilitiesManager.getCapabilities());
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
                break;
            }
            case "ios": {
                try {
                    appiumDriver = new IOSDriver(new URL(""), CapabilitiesManager.getCapabilities());
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
                break;
            }
        }
        return appiumDriver;
    }
}
