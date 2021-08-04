import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class main9 {
    private static WebDriver driver;

    @BeforeClass
    public static void BeforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\edenmm\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
    }

    @Test
    public void login(){
        WebElement username = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("pass"));
        username.sendKeys("abc@gmail.com");
        password.sendKeys("123456");
        WebElement login = driver.findElement(By.name("login"));
        login.click();
    }
}
