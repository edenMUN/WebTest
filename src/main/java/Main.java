import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Main {

    @BeforeClass
    public static void runOnceBeforeClass() {
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\edenmm\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.walla.co.il");

        System.setProperty("webdriver.gecko.driver" , "C:\\Users\\edenmm\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
        WebDriver driver2 = new FirefoxDriver();
        driver2.get("https://www.ynet.co.il");
    }

    @Test
    public void abc(){
    }


}


