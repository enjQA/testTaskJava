import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

@Listeners(ListenerTask2.class)
public class TestTask2 {

    public static WebDriver driver;
    Task2Objects objTask2;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.redmine.org/account/register");
    }

    @Test(priority = 1)
    public void loginInput() {
        try {
            objTask2 = new Task2Objects(driver);
            objTask2.loginInput();
            Thread.sleep(1000);
            objTask2.registerAssert();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println();
    }

    @Test(priority = 2)
    public void passInput() {
        try {
            objTask2 = new Task2Objects(driver);
            objTask2.loginClear();
            Thread.sleep(1000);
            objTask2.passInput();
            Thread.sleep(1000);
            objTask2.registerAssert();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test(priority = 3)
    public void passAndPassConfInputs() {
        try {
            objTask2 = new Task2Objects(driver);
            objTask2.passAndPassConf();
            Thread.sleep(1000);
            objTask2.registerAssert();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Test(priority = 4)
    public void firstNameInput() {
        try {
            objTask2 = new Task2Objects(driver);
            objTask2.firstNameInput();
            Thread.sleep(1000);
            objTask2.registerAssert();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test(priority = 5)
    public void lastNameInput() {
        try {
            objTask2 = new Task2Objects(driver);
            objTask2.firstNameClear();
            objTask2.lastNameInput();
            Thread.sleep(1000);
            objTask2.registerAssert();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test(priority = 6)
    public void emailInput() {
        try {
            objTask2 = new Task2Objects(driver);
            objTask2.lastNameClear();
            objTask2.emailInput();
            Thread.sleep(1000);
            objTask2.registerAssert();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
