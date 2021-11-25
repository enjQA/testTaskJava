import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;

import static org.testng.Assert.assertEquals;
@Listeners({ListenerTask3.class})
public class Task2Objects {
    WebDriver driver;

    By login = By.id("user_login");
    By pass = By.id("user_password");
    By passConf = By.id("user_password_confirmation");
    By passBoth = By.cssSelector("[name*='password']");
    By firstName = By.id("user_firstname");
    By lastName = By.id("user_lastname");
    By email = By.id("user_mail");

    public Task2Objects(WebDriver driver) {
        this.driver = driver;
    }
    public void loginInput() {
        driver.findElement(login)
                .sendKeys(Long.toHexString(Double.doubleToLongBits(Math.random())), Keys.ENTER);
    }
    public void loginClear() {
        driver.findElement(login).clear();
    }
    public void passInput() {
        driver.findElement(pass)
                .sendKeys(Long.toHexString(Double.doubleToLongBits(Math.random())), Keys.ENTER);
    }
    public void passConfInput() {
        driver.findElement(passConf)
                .sendKeys(Long.toHexString(Double.doubleToLongBits(Math.random())), Keys.ENTER);
    }
    public void passAndPassConf() {
        driver.findElement(pass).sendKeys("pasS123");
        driver.findElement(passConf).sendKeys("pasS123", Keys.ENTER);
    }
    public void firstNameInput() {
        driver.findElement(firstName)
                .sendKeys(Long.toHexString(Double.doubleToLongBits(Math.random())), Keys.ENTER);
    }
    public void firstNameClear() {
        driver.findElement(firstName).clear();
    }
    public void lastNameInput() {
        driver.findElement(lastName)
                .sendKeys(Long.toHexString(Double.doubleToLongBits(Math.random())), Keys.ENTER);
    }
    public void lastNameClear() {
        driver.findElement(lastName).clear();
    }
    public void emailInput() {
        driver.findElement(email)
                .sendKeys(Long.toHexString(Double.doubleToLongBits(Math.random())) + "@mail.com", Keys.ENTER);
    }
    public void emailClear() {
        driver.findElement(email).clear();
    }
    public void registerAssert() {
        String success = driver.getCurrentUrl();
        assertEquals("https://www.redmine.org/login", success);
    }

}
