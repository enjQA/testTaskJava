import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.time.Duration;

@Listeners(ListenerTask3.class)
public class TestTask3 {

    public static WebDriver driver;
    Task3Objects objTask3;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.redmine.org/account/register");
    }
    @Test(dataProvider = "task3", dataProviderClass = DataProviderTask3.class)
        public void Register(String d1) {
            objTask3 = new Task3Objects(driver);
            objTask3.loginInput(d1);
            objTask3.pass(d1);
            objTask3.passConf(d1);
            objTask3.firstNameInput(d1);
            objTask3.lastNameInput(d1);
            objTask3.emailInput(d1+"@mail.com");
            objTask3.submit();
            objTask3.registerAssert();
    }
}
