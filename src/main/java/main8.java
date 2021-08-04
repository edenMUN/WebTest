import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.xml.xpath.XPath;
import java.util.List;

public class main8 {
    private static WebDriver driver;

    @BeforeClass
    public static void BeforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\edenmm\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
        driver = new ChromeDriver();
        driver.get("https://dgotlieb.github.io/Controllers/");
    }

    @Test
    public void selectRadioButton() {
        List<WebElement> RadioButton = driver.findElements(By.className("group2"));
        for(WebElement currentButton : RadioButton) {
            if (currentButton.getText().equals("Cheese")) {
                currentButton.click();
            }
        }
            Select selection = new Select(driver.findElement(By.name("dropdownmenu")));
            selection.selectByValue("Milk");
            for (int i = 0; i < selection.getOptions().size(); i++) {
                System.out.println(selection.getOptions().get(i).getText());
            }
        }
    }

