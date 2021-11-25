import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertEquals;
public class Task1Objects {
    WebDriver driver;
    By home = By.linkText("Home");
    By projects = By.linkText("Projects");
    By help = By.linkText("Help");
    By signIn = By.linkText("Sign in");
    By register = By.linkText("Register");

    public Task1Objects(WebDriver driver) {
        this.driver = driver;
    }
    public void clickHome() {
        driver.findElement(home).click();
    }
    public void verifyHome() {
        String homeVF = driver.getCurrentUrl();
        assertEquals("https://www.redmine.org/", homeVF);
    }
    public void previousPage() {
        driver.navigate().back();
    }
    public void clickProjects() {
        driver.findElement(projects).click();
    }
    public void verifyProjects() {
        String projectsVF = driver.getCurrentUrl();
        assertEquals("https://www.redmine.org/projects", projectsVF);
    }
    public void clickHelp() {
        driver.findElement(help).click();
    }
    public void verifyHelp() {
        String helpVF = driver.getCurrentUrl();
        assertEquals("https://www.redmine.org/guide", helpVF);
    }
    public void clickSignIn() {
        driver.findElement(signIn).click();
    }
    public void verifySignIn() {
        String signInVF = driver.getCurrentUrl();
        assertEquals("https://www.redmine.org/login", signInVF);
    }
    public void clickRegister() {
        driver.findElement(register).click();
    }
    public void verifyRegister() {
        String registerVF = driver.getCurrentUrl();
        assertEquals("https://www.redmine.org/account/register", registerVF);
    }
}
