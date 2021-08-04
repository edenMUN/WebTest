import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class main4 {
    private static WebDriver driver;

    @BeforeClass
    public static void BeforeClass(){
        System.setProperty("webdriver.gecko.driver" , "C:\\Users\\edenmm\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("http://www.seleniumhq.org");
    }

    @Test
    public void searchtextfield(){
        WebElement searchElement = driver.findElement(By.xpath("//input[@id='gsc-i-id1']"));
        System.out.println(searchElement);
        searchElement.sendKeys("selenium");
    }

}
