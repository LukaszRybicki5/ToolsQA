import org.junit.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


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
        WebDriver driver = new ChromeDriver();
        String url ="https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm";
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // identify element
        driver.findElement(By.xpath("//button[@name='submit']")).click();
        // Alert interface and switchTo().alert() method
        Alert al = driver.switchTo().alert();
        // click on OK to accept with accept()
        al.accept();
        //driver.quit();
    }

    @AfterClass
    public static void afterTestsSettings(){
        System.out.println("End");

    }

}
