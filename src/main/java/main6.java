import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class main6 {
    private static WebDriver driver;

    @BeforeClass
    public static void BeforeClass(){
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\edenmm\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
        driver = new ChromeDriver();
        driver.get("https://translate.google.com/");
    }

    @Test
    public void translatbox(){
        WebElement translatbox = driver.findElement(By.className("er8xn"));
        translatbox.sendKeys("שלום");
    }
}