package Selenium.Pages;

import Selenium.Settings.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BooksListPage extends PageObject {

    @FindBy(linkText = "Git Pocket Guide")
    WebElement gitPocketGuide;

    public BooksListPage(WebDriver driver){
        super(driver);
    }

    public void clickOnGitPocketGuide(){
        gitPocketGuide.click();
    }

    public boolean isInitialized() {
        return gitPocketGuide.isDisplayed();
    }

}
