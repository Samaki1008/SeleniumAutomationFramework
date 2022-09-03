package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects {

    WebDriver driver;
    @FindBy(id = "first-name")
    WebElement firstName;

    @FindBy(id ="last-name")
    WebElement lastname;

    @FindBy(xpath = "//a[contains(text(),'Submit')]")
    WebElement submitbutton;

    public HomePageObjects(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void Homepagetest1(){
        firstName.sendKeys("hello");
        lastname.sendKeys("world");
        submitbutton.click();

    }

}
