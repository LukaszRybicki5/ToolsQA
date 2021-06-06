package Selenium.Pages;

import Selenium.Settings.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;

import static java.lang.Thread.sleep;

public class ProfilePage extends PageObject {

    private WebDriverWait driverWait = new WebDriverWait(driver, //
            WebDriverWait.DEFAULT_SLEEP_TIMEOUT);

    @FindBy(id="delete-record-undefined")
    WebElement deleteRecordButton;

    @FindBy(id="closeSmallModal-ok")
    WebElement okButton;

    public ProfilePage(WebDriver driver) {
        super(driver);
    }


    public boolean isInitialized() {
       return deleteRecordButton.isDisplayed();
    }

    public void deleteRecord() {

        clickElement(deleteRecordButton);

        clickElement(okButton);

        driverWait.withMessage("Waiting for popup");


        confirmPopup(driver);
    }

    /**
     * Click element with basic wait
     *
     * @param element of page
     */
    private void clickElement(WebElement element) {
        driverWait.until(ExpectedConditions.visibilityOf(element));
        element.click();
    }

    /**
     * Confrim Pop-up message
     *
     * @param driver that is used
     */
    private void confirmPopup(WebDriver driver) {
        driver.switchTo().alert().accept();
    }
}
