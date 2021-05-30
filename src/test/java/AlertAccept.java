import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
public class AlertAccept{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url ="https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm";
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // identify element
        driver.findElement(By.xpath("//button[@name='submit']")).click();
        // Alert interface and switchTo().alert() method
        Alert al = driver.switchTo().alert();
        // click on OK to accept with accept()
        al.accept();
        driver.quit();
    }
}