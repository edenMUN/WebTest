import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class main5 {
    private static WebDriver driver;

    @BeforeClass
    public static void BeforeClass(){
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\edenmm\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
    }

    @Test
    public void searchgetTitle(){
        System.out.println(driver.getTitle().contains("Amazon.com. Spend less. Smile more."));
    }

    @Test
    public void searchtextfield(){
        WebElement searchElement = driver.findElement(By.id("twotabsearchtextbox"));
        searchElement.sendKeys("Leather shoes");
        driver.findElement(By.id("nav-search-submit-button")).click();
    }
}
