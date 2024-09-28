package selenium1stclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FindElementTest {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration. ofSeconds(100));

       driver.findElement(By.id("user-name")).sendKeys("standard_user");
       driver.findElement(By.id("password")).sendKeys("secret_sauce");

       driver.findElement(By.id("login-button")).click();

        driver.quit();
    }
}
