package core.selenium;


import core.selenium.webdrivers.Firefox;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by Silvia Valencia on 2/2/2018.
 * Class to manage web driver.
 */
public class WebDriverManager {
    private WebDriverConfig webDriverConfig = WebDriverConfig.getInstance();
    private WebDriver webDriver;
    private WebDriverWait webDriverWait;

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
        //this.webDriver = new Chrome().initDriver();
        this.webDriver = new Firefox().initDriver();
        this.webDriver.manage().window().maximize();
        this.webDriver.manage()
                .timeouts()
                .implicitlyWait(webDriverConfig.getImplicitWaitTime(), TimeUnit.SECONDS);
        webDriverWait = new WebDriverWait(webDriver, webDriverConfig.getExplicitWaitTime(),
                webDriverConfig.getWaitSleepTime());
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