package testPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by yayu on 4/21/2017.
 */
public class KeyWord {
    @Test
    public void enterKeys() {

        System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("file:///C:/Users/yayu/Desktop/index1.html");
        driver.findElement(By.name("field"));
        WebElement field = driver.findElement(By.name("field"));
        field.sendKeys("A");


        Robot r = null;


        try {
            r = new Robot();
            r.keyPress(KeyEvent.VK_A);
            r.keyRelease(KeyEvent.VK_A);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}

