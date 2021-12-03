package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{

    By enterEmail       = By.id("L-UserNameField");
    By enterPassword    = By.id("L-PasswordField");
    By loginButtonClick = By.id("gg-login-enter");

    public LoginPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void logIn(String email, String password) {
        sendKey(enterEmail,email);
        sendKey(enterPassword,password);
        click(loginButtonClick);
    }
}
