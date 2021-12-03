package test;

import org.junit.Test;

public class SelectRandomFourProductTest extends BaseTest{

    @Test
    public void searchTest() throws InterruptedException {
        navigationBar.navigateToLoginPage();
        loginPage.logIn("rcnkirbiyik@gmail.com", "Ercan30.");

        searchProduct.searchProduct("tişört");
        basePage.scroll();
        basePage.randomFourFavourite();
    }
}
