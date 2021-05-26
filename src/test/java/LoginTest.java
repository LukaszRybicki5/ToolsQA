import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/*
First approach to write test case for portfolio and to improve my coding/testing skills
 */
public class LoginTest {

    @BeforeClass
    public static void beforeTestsSettings(){
        System.out.println("Start");
    }

    @Test
    public void simpleLogin() {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        WebDriver webdriver = new ChromeDriver();

        webdriver.get("https://demoqa.com/login");

        webdriver.manage().window().maximize();

        WebElement webElementUserName = webdriver.findElement(By.id("userName"));

        webElementUserName.sendKeys("LukaszRybicki5");

        WebElement webElementPassword = webdriver.findElement(By.id("password"));

        webElementPassword.sendKeys("Lukasz2021!");

        WebElement webElementLoginButton = webdriver.findElement(By.id("login"));

        webElementLoginButton.click();

        WebDriverWait wait = new WebDriverWait(webdriver, 30);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("userName-value")));

        WebElement webElementLoginSuccessful = webdriver.findElement(By.id("userName-value"));

        String SuccessfulLogin = webElementLoginSuccessful.getText();

        Assert.assertEquals(SuccessfulLogin, "LukaszRybicki5");

    }

    @AfterClass
    public static void afterTestsSettings(){
        System.out.println("End");

    }

}
