package test;

import org.junit.Test;

public class MainTest extends BaseTest{

    @Test
    public void mainTest() throws InterruptedException {
        navigationBar.navigateToLoginPage();
        loginPage.logIn("rcnkirbiyik@gmail.com", "Ercan30.");

        searchProduct.searchProduct("eldiven");
        basePage.scroll();
        basePage.randomFourFavourite();

        navigationBar.navigateToMainPage();
        searchProduct.searchProduct("canta");
        navigationBar.navigateAddToCard();

        navigationBar.navigateToCard();
        navigationBar.increaseItemCount();
        navigationBar.completeShopping();
        navigationBar.editCard();
    }

}
