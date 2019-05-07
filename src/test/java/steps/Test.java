package steps;

import core.selenium.WebDriverManager;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    WebDriver driver;
    @Given("^I am logged in to the Application$")
    public void verifyLoginToApplication() {
        driver = WebDriverManager.getInstance().getWebDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
    }
}
