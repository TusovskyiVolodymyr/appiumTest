package mobile.capabilities;

import mobile.utils.ProfileUtils;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

public class CapabilitiesManager {


    private static DesiredCapabilities capabilities;

    public static DesiredCapabilities getCapabilities() {
        switch (ProfileUtils.getActiveProfile()) {
            case "android": {
                capabilities = new DesiredCapabilities();
                capabilities.setCapability("platformName", Platform.ANDROID);
                break;
            }
            case "ios": {
                capabilities = new DesiredCapabilities();
                capabilities.setCapability("platformName", Platform.IOS);
                break;
            }
        }
        return capabilities;
    }
}
