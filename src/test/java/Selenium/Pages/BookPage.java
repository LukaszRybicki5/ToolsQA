package Selenium.Pages;

import Selenium.Settings.PageObject;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.event.KeyEvent;

import static java.lang.Thread.*;

public class BookPage extends PageObject {

    @FindBy(xpath = "//div[contains(@class,\"text-right\")]/*[@id=\"addNewRecordButton\"]")
    WebElement addToYourCollectionButton;

    public BookPage(WebDriver driver){
        super(driver);
    }

    public boolean isInitialized() {
        return addToYourCollectionButton.isDisplayed();
    }

    public void addToYourCollection() throws InterruptedException {

        sleep(2000);
//
        addToYourCollectionButton.click();
//
        sleep(2000);

        driver.switchTo().alert().accept();

        //simpleAlert.accept();
    }

}
