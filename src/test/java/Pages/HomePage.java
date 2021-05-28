package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageObject {

    @FindBy(id="userName-value")
    WebElement usernameValue;

    public HomePage(WebDriver driver){
        super(driver);
    }

    public boolean isInitialized() {
        return usernameValue.isDisplayed();
    }

    public String getUserNameText(){
        if (isInitialized() == true){
            return usernameValue.getText();
        }else
        return null;
    }

}
