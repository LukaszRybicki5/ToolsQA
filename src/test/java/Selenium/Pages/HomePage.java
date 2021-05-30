package Selenium.Pages;

import Selenium.Settings.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.event.KeyEvent;

import static java.lang.Thread.sleep;

public class HomePage extends PageObject {

    @FindBy(id="userName-value")
    WebElement usernameValue;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/div[2]/div[1]/div[1]/div[3]/button")
    WebElement logOutButton;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/div[1]/div/div/div[6]/div/ul/li[3]")
    WebElement goToProfile;

    @FindBy(id = "gotoStore")
    WebElement goToBookStore;

    public HomePage(WebDriver driver){
        super(driver);
    }

    public boolean isInitialized() {
        return usernameValue.isDisplayed();
    }

    public String getUserNameText(){
        return usernameValue.getText();
    }

    public void clickLogOut(){
        logOutButton.click();
    }

    public void clickGoToBookStore(){
        goToBookStore.click();
    }

    public void clickGoToProfile() throws AWTException, InterruptedException {
        Robot robot = new Robot();

        sleep(1000);

        robot.keyPress(KeyEvent.VK_DOWN);

        sleep(1000);

        robot.keyPress(KeyEvent.VK_DOWN);

        sleep(1000);

        robot.keyPress(KeyEvent.VK_DOWN);

        if (goToProfile.isEnabled()){
            goToProfile.click();
        }
    }

}
