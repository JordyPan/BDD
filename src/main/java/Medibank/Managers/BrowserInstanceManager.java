package Medibank.Managers;

import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

public class BrowserInstanceManager {
    WebDriver driver;
    public static Map<Integer, WebDriver> DriverMap = new HashMap<>();
    public static Map<Integer, Scenario> ScenarioMap = new HashMap<>();

    public static synchronized void SetBrowserInstance(WebDriver driver)
    {
        DriverMap.put((int)(long)(Thread.currentThread().getId()),driver);
    }

    public static synchronized void SetScenarioInstance(Scenario scenario)
    {
        ScenarioMap.put((int)(long)(Thread.currentThread().getId()),scenario);
    }

    public static synchronized WebDriver GetBrowserInstance()
    {
       return DriverMap.get((int)(long)(Thread.currentThread().getId()));
    }

    public static synchronized Scenario GetScenarioInstance()
    {
        return ScenarioMap.get((int)(long)(Thread.currentThread().getId()));
    }

    public static void configDriver(WebDriver driver)
    {
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }

}
