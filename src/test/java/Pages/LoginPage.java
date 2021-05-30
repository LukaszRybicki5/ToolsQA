package Pages;

import Settings.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject {

    @FindBy(id="userName")
    WebElement usernameInput;

    @FindBy(id="password")
    WebElement passwordInput;

    @FindBy(id="login")
    WebElement loginButton;

    public LoginPage(WebDriver driver){
        super(driver);
    }

    public boolean isInitialized() {
        return usernameInput.isDisplayed();
    }

    public void enterUsername(String username) {
        usernameInput.clear();
        usernameInput.sendKeys(username);
    }

    public void enterPassword(String password){
        passwordInput.clear();
        passwordInput.sendKeys(password);
    }

    public void login(){
        loginButton.click();
    }

}
