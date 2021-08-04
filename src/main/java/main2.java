import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class main2 {
    private static WebDriver driver;

    @BeforeClass
    public static void runBeforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\edenmm\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
        driver = new ChromeDriver();
        driver.get("https://translate.google.com/");
    }

    @Test
    public static void translationbox(){
        System.out.println(driver.findElements(By.xpath("//textarea[@class='tw-ta tw-text-large XcVN5d goog-textarea' and id= 'tw-source-text-ta']")));
    }
}



