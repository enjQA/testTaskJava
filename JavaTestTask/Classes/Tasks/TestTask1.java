import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestTask1 {

    WebDriver driver;
    Task1Objects objTask1;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.redmine.org/account/register");
    }
    @Test(priority = 1)
    public void home() {
        objTask1 = new Task1Objects(driver);
        objTask1.clickHome();
        objTask1.verifyHome();
    }
    @Test(priority = 2)
    public void projects() {
        objTask1 = new Task1Objects(driver);
        objTask1.clickProjects();
        objTask1.verifyProjects();
    }
    @Test(priority = 3)
    public void help() {
        objTask1 = new Task1Objects(driver);
        objTask1.clickHelp();
        objTask1.verifyHelp();
    }
    @Test(priority = 4)
    public void signIN() {
        objTask1 = new Task1Objects(driver);
        objTask1.clickSignIn();
        objTask1.verifySignIn();
    }
    @Test(priority = 5)
    public void register() {
        objTask1 = new Task1Objects(driver);
        objTask1.clickRegister();
        objTask1.verifyRegister();
    }
    @AfterTest
    public void out() {
        driver.quit();
    }
}
