import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SamTest {

    @Test
    public void test(){

        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebDrivers\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");
        driver.findElement(By.id("first-name")).sendKeys("First Name");
        driver.findElement(By.id("last-name")).sendKeys("Last Name");
        driver.findElement(By.xpath("//a[contains(text(),'Submit')]")).click();
        driver.close();

    }
}
