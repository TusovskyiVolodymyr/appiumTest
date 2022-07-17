package mobile.utils;

public class ProfileUtils {
    public static String getActiveProfile() {
        return System.getProperty("spring.profiles.active");
    }
}
