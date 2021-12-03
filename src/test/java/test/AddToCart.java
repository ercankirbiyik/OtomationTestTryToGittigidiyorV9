package test;

import org.junit.Test;

public class AddToCart extends BaseTest {

    @Test
    public void seventhBagToCardTest() throws InterruptedException {

        navigationBar.navigateToLoginPage();
        loginPage.logIn("rcnkirbiyik@gmail.com", "Ercan30.");


        navigationBar.navigateToMainPage();
        searchProduct.searchProduct("canta");
        navigationBar.navigateAddToCard();


    }

}