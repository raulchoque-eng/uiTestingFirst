package core.selenium.webdrivers;

import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;


/**
 * Firefox class driver initialization
 *
 * @author Raúl Choque
 * @version 0.0.1
 */
public class Firefox implements Browser {

    @Override
    public WebDriver initDriver() {
        FirefoxDriverManager.getInstance().version("66.0.3").setup();
        FirefoxOptions options = new FirefoxOptions().setProfile(new FirefoxProfile());

        //Use to ignore ssl errors
        options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        options.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options);
        options.merge(options);
        options.addArguments("disable-infobars");

        System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
        return new FirefoxDriver(options);

    }
}
