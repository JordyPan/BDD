package Medibank.Managers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browserManager {

    WebDriver driver;
    Browser browser;

    public WebDriver initbrowser(String browserName)
    {
        switch (browserName)
        {
            case "Chrome":
                browser = new ChromeManager(driver);

                break;

            case "Firefox":
                //browser = new ChromeManager(driver);
                break;

            case "Edge":
                //browser = new ChromeManager(driver);
                break;

        }
        driver = browser.setup();
        BrowserInstanceManager.configDriver(driver);
        return driver;

    }
}
