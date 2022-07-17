import mobile.pages.LoginPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Autowired
    private LoginPage loginPage;

    @Test
    public void test() {
        loginPage.login("TestUserName", "TestPass");
    }
}
