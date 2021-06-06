package Selenium.Settings;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class FunctionalTest {

    protected static WebDriver driver;

    @BeforeClass
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver", //
                "/home/tomasz/Dokumenty/chromeDriver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @After
    public void cleanUp() {
        //driver.manage().deleteAllCookies();
    }

    @AfterClass
    public static void tearDown(){
//        driver.manage().deleteAllCookies();
//        driver.close();
//        driver.close();
    }


}