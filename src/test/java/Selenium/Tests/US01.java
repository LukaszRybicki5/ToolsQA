package Selenium.Tests;

import Selenium.Pages.*;
import Selenium.Settings.FunctionalTest;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US01 extends FunctionalTest {

    @Test
    public void us01Test() throws InterruptedException, AWTException {

        logInTest();

        addAndRemoveBookTest();

        logOutTest();
    }

    public void logInTest(){
        String correctUsername = "LukaszRybicki5";
        String correctPassword = "Lukasz2021!";

        LoginPage loginPage = new LoginPage(driver);
        assertTrue(loginPage.isInitialized());

        loginPage.enterUsername(correctUsername);
        loginPage.enterPassword(correctPassword);
        loginPage.login();

        HomePage homePage = new HomePage(driver);
        assertTrue(homePage.isInitialized());

        assertEquals(homePage.getUserNameText(), correctUsername);

    }

    public void addAndRemoveBookTest() throws AWTException, InterruptedException {

        HomePage homePage = new HomePage(driver);
        assertTrue(homePage.isInitialized());

        homePage.clickGoToBookStore();

        BooksListPage booksListPage = new BooksListPage(driver);
        assertTrue(booksListPage.isInitialized());

        booksListPage.clickOnGitPocketGuide();

        BookPage bookPage = new BookPage(driver);
        assertTrue(bookPage.isInitialized());

        bookPage.addToYourCollection();

        homePage.clickGoToProfile();

        ProfilePage profilePage = new ProfilePage(driver);
        assertTrue(profilePage.isInitialized());

        profilePage.deleteRecord();

    }

    public void logOutTest(){

        HomePage homePage = new HomePage(driver);
        assertTrue(homePage.isInitialized());

        homePage.clickLogOut();

        LoginPage loginPage = new LoginPage(driver);
        assertTrue(loginPage.isInitialized());
    }
}
