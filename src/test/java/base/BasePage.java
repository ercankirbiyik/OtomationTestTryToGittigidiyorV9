package base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.BaseTest;

import java.util.Random;

    public class BasePage  extends BaseTest {
        WebDriver driver;
        WebDriverWait wait;

        public BasePage(WebDriver driver, WebDriverWait wait) {
            this.driver=driver;
            this.wait=wait;
        }

        public BasePage() {

        }

        public WebElement find(By path) {
            WebElement element = driver.findElement(path);
            return element;
        }

        public void click(By path) {
            find(path).click();
        }

        public void hover(By path) {
            Actions actions = new Actions(driver);
            actions.moveToElement(find(path)).perform();
        }

        public void sendKey(By path, String message) {
            find(path).sendKeys(message);
        }

        public void scroll() throws InterruptedException {
            By closeCookies = By.className("tyj39b-5");
            click(closeCookies);

            WebElement element = driver.findElement(By.xpath("//*[@aria-label='1. sayfa']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",element);
            Thread.sleep(1000);
        }

        public void randomFourFavourite() throws InterruptedException {
            Random rand = new Random();
            int i=0;
            while (i!= 4){
                int products=  rand.nextInt(32)+1;
                By favourite1 = new By.ByXPath("(//div[@class='ndodpt-1 bgCibU sc-1n49x8z-13 ceCTui'])["+ products +"]");
                Thread.sleep(1000);
                try{
                    click((By) favourite1);
                    i++;
                }
                catch(Exception e){
                    JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
                    javascriptExecutor.executeScript("arguments[0].click()",find(favourite1));
                    i++;
                }
            }
        }

    }

