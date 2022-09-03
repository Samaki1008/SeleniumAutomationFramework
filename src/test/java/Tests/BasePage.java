package Tests;

import Utils.UtilsClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BasePage {

    UtilsClass util = new UtilsClass();
    public WebDriver driver;


    @BeforeSuite
    public void beforeclass(){
        System.setProperty("webdriver.chrome.driver", util.CHROME_DRIVER_PATH );
        driver = new ChromeDriver();


    }


    @AfterSuite
    public void afterclass(){
        driver.close();
        driver.quit();

    }

    public WebDriver getDriver(){
        return driver;
    }
}
