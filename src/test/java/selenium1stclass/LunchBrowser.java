package selenium1stclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class LunchBrowser {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.selenium.dev/");
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration. ofSeconds(30));

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());



        driver.quit();
    }
}
