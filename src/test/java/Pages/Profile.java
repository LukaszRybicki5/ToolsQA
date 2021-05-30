package Pages;

import Settings.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.awt.*;
import java.awt.event.KeyEvent;

import static java.lang.Thread.sleep;

public class Profile extends PageObject {

    @FindBy(id="delete-record-undefined")
    WebElement deleteRecord;

    @FindBy(id="closeSmallModal-ok")
    WebElement submitOK;

    public Profile(WebDriver driver) {
        super(driver);
    }


    public boolean isInitialized() {
       return deleteRecord.isDisplayed();
    }

    public void deleteRecord() throws AWTException, InterruptedException {
        
        deleteRecord.click();

        sleep(1000);

        submitOK.click();

        Robot robot = new Robot();

        sleep(1000);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        sleep(1000);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

}
