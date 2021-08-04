import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class main10 {
    private static WebDriver driver;

    @BeforeClass
    public static void BeforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\edenmm\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
        driver = new ChromeDriver();
        driver.get("https://dgotlieb.github.io/WebCalculator/");
    }

    @Test
    public void buttonheight(){
        WebElement username = driver.findElement(By.id("two"));
        System.out.println("buttonheight:" + username.getCssValue("height"));
    }

    @Test
    public void buttonwidth(){
        WebElement username = driver.findElement(By.id("six"));
        System.out.println("buttonwidth:" + username.getCssValue("width"));
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
