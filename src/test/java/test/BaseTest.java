package test;

import base.BasePage;
import base.LoginPage;
import base.NavigationBar;
import base.SearchProduct;
import org.junit.After;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {

    WebDriver driver;
    WebDriverWait wait;

    LoginPage loginPage;
    BasePage basePage;
    NavigationBar navigationBar;
    SearchProduct searchProduct;

   @BeforeAll
    public void setUpEach(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.gittigidiyor.com/");

        basePage = new BasePage(driver,wait);
        loginPage = new LoginPage(driver,wait);
        navigationBar = new NavigationBar(driver,wait);
        searchProduct = new SearchProduct(driver,wait);
    }

    @AfterAll
    public void tearDown(){
        System.out.println("Test done.");
    }
}
