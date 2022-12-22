package Medibank.Managers;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.manager.SeleniumManager;

import java.io.IOException;

public class ChromeManager implements Browser {

    WebDriver driver;
    //KeyValReader keyValReader;
    Boolean headless;

    public ChromeManager(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public WebDriver setup() {
        SeleniumManager.getInstance().getDriverPath("chromedriver");
        try {

            driver = new ChromeDriver(ChromeOptions());
            BrowserInstanceManager.SetBrowserInstance(driver);
            return driver;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public ChromeOptions ChromeOptions() throws IOException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");

        //if (HeadLessState()) {
            //options.addArguments("headless");
        //}

        return options;
    }

    /*
    public Boolean HeadLessState() throws IOException {
        //keyValReader = new KeyValReader("Config");
        //String State = keyValReader.getProp("headless");
        headless = false;

        if (System.getenv("RunMode") != null) {

            if(System.getenv("RunMode").equalsIgnoreCase("Headless"))
            {
                headless = true;
            }
            else if(System.getenv("RunMode").equalsIgnoreCase("Normal"))
            {
                headless = false;
            }


        } else {
            if (State.equalsIgnoreCase("true")) {
                headless = true;
            }
            //}

        }
        return headless;
    }

     */
}
