import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class main3 {
private static WebDriver driver;

    @BeforeClass
    public static void BeforeClass(){
        System.setProperty("webdriver.gecko.driver" , "C:\\Users\\edenmm\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://www.youtube.com");
    }

    @Test
    public void Youtubebutton(){
        System.out.println(driver.findElement(By.id("logo-icon")));

    }
}
