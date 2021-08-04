import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class main7 {
    private static WebDriver driver;

    @BeforeClass
    public static void BeforeClass(){
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\edenmm\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.youtube.com//");
    }

    @Test
    public void searchbutton(){
        WebElement searchbox = driver.findElement(By.id("search"));
        searchbox.sendKeys("Ni Una Más");
        driver.findElement(By.id("search-icon-legacy")).click();


    }
}
//    Ni Una Más
