import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;

import static org.testng.Assert.assertEquals;
@Listeners({ListenerTask3.class})
public class Task3Objects {
    WebDriver driver;

    By login = By.id("user_login");
    By pass = By.id("user_password");
    By passConf = By.id("user_password_confirmation");
    By passBoth = By.cssSelector("[name*='password']");
    By firstName = By.id("user_firstname");
    By lastName = By.id("user_lastname");
    By email = By.id("user_mail");
    By submitButt = By.name("commit");

    public Task3Objects(WebDriver driver) {
        this.driver = driver;
    }
    public void loginInput(String value) {
        driver.findElement(login).sendKeys(value);
    }
    public void pass(String value) {
        driver.findElement(pass).sendKeys(value);
    }
    public void passConf(String value) {
        driver.findElement(passConf).sendKeys(value);
    }
    public void firstNameInput(String value) {
        driver.findElement(firstName).sendKeys(value);
    }
    public void lastNameInput(String value) {
        driver.findElement(lastName).sendKeys(value);
    }
    public void emailInput(String value) {
        driver.findElement(email).sendKeys(value);
    }
    public void submit(){
        driver.findElement(submitButt).click();
    }
    public void registerAssert() {
        String success = driver.getCurrentUrl();
        assertEquals("https://www.redmine.org/login", success);
    }

}