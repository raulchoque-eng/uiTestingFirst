package core.selenium;


import core.selenium.webdrivers.BrowserFactory;
import core.selenium.webdrivers.Firefox;
import core.utils.PropertyAccessor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by Silvia Valencia on 2/2/2018.
 * Class to manage web driver.
 */
public class WebDriverManager {

    private WebDriver webDriver;
    private WebDriverWait webDriverWait;
    private PropertyAccessor wait;
    private BrowserFactory browserFactory;

    private static WebDriverManager instance = null;

    /**
     * Constructor of page WebDriverManager.
     */
    protected WebDriverManager() {
        initialize();
    }

    /**
     * Gets Instance of a WebElement.
     *
     * @return Instance of WebElement.
     */
    public static WebDriverManager getInstance() {
        if (instance == null || instance.webDriver == null) {
            instance = new WebDriverManager();
        }
        return instance;
    }

    /**
     * Initializes the settings for the driver.
     */
    private void initialize() {
        System.out.println("implicitTime: " + wait.getInstace().getImplicitWaitTime());
        //this.webDriver = new Chrome().initDriver();
        //browserFactory.getBrowser("firefox");
        this.webDriver = new Firefox().initDriver();
        this.webDriver.manage().window().maximize();
        this.webDriver.manage()
                .timeouts()
                .implicitlyWait(wait.getInstace().getImplicitWaitTime(), TimeUnit.SECONDS);
        webDriverWait = new WebDriverWait(webDriver, wait.getInstace().getExplicitWaitTime(),
                wait.getInstace().getWaitSleepTime());
    }

    /**
     * Gets the WebDriver.
     *
     * @return WebDriver.
     */
    public WebDriver getWebDriver() {
        return webDriver;
    }

    /**
     * Gets the WebDriver Wait.
     *
     * @return WebDriverWait.
     */
    public WebDriverWait getWait() {
        return webDriverWait;
    }

}