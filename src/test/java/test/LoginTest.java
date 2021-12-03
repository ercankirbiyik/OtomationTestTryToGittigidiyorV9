package test;

import base.BasePage;
import org.junit.Test;

public class LoginTest extends BaseTest{

    @Test
    public void loginTest() throws InterruptedException {
        navigationBar.navigateToLoginPage();
        loginPage.logIn("rcnkirbiyik@gmail.com", "Ercan30.");
    }
}