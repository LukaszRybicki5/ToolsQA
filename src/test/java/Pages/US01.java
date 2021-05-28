package Pages;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US01 extends FunctionalTest {

    @Test()
    public void correctLogin() throws InterruptedException {

        driver.get("https://demoqa.com/login");

        String correctUsername = "LukaszRybicki5";
        String correctPassword = "Lukasz2021!";

        LoginPage loginPage = new LoginPage(driver);
        assertTrue(loginPage.isInitialized());

        loginPage.enterUsername(correctUsername);
        loginPage.enterPassword(correctPassword);
        loginPage.login();


        HomePage homePage = new HomePage(driver);

        assertEquals(homePage.getUserNameText(), correctUsername);
    }

}
