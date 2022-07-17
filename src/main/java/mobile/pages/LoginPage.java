package mobile.pages;

public abstract class LoginPage {
    public abstract LoginPage typeLogin(String userName);

    public abstract LoginPage typePassword(String password);

    public abstract LoginPage clickSubmit();

    public void login(String userName, String password) {
        typeLogin(userName);
        typePassword(password);
        clickSubmit();
    }

}
