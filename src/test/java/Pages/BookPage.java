package Pages;

import Settings.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.event.KeyEvent;

import static java.lang.Thread.*;

public class BookPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[2]/div[9]/div[2]")
    WebElement addToYourCollectionButton;

    public BookPage(WebDriver driver){
        super(driver);
    }

    public boolean isInitialized() {
        return addToYourCollectionButton.isDisplayed();
    }

    public void addToYourCollection() throws AWTException, InterruptedException {

        Robot robot = new Robot();

        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);

        sleep(2000);

        addToYourCollectionButton.click();

        sleep(2000);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_ENTER);
        //robot.keyRelease(KeyEvent.VK_ENTER);

        //Alert simpleAlert = driver.switchTo().alert();

        //simpleAlert.accept();
    }




}
