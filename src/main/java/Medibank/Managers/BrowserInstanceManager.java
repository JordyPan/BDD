package Medibank.Managers;

import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

public class BrowserInstanceManager {

    public static Map<Integer, WebDriver> DriverMap = new HashMap<>();

    public static synchronized void SetBrowserInstance(WebDriver driver)
    {
        DriverMap.put((int)(long)(Thread.currentThread().getId()),driver);
    }

    public static synchronized WebDriver GetBrowserInstance()
    {
       return DriverMap.get((int)(long)(Thread.currentThread().getId()));
    }

}
