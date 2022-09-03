package Tests;

import PageObjects.HomePageObjects;
import Utils.UtilsClass;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.sql.Time;


public class HomePageTest extends BasePage{

    UtilsClass util = new UtilsClass();
    @Test
    public void HomePageTesting(){
        driver.get(util.URL);
        HomePageObjects test1 = new HomePageObjects(driver);
        test1.Homepagetest1();

    }

}

