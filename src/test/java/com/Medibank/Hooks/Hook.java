package com.Medibank.Hooks;

import Medibank.Managers.BrowserInstanceManager;
import Medibank.Managers.browserManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;

public class Hook {

    WebDriver driver;

    @Before
    public void setup(Scenario scenario)
    {
        SetDriver(getBrowserType());
        driver = BrowserInstanceManager.GetBrowserInstance();
        BrowserInstanceManager.SetScenarioInstance(scenario);
    }

    @After
    public void tearDown()
    {
        driver = BrowserInstanceManager.GetBrowserInstance();
        driver.close();
        driver.quit();
    }

    public String getBrowserType()
    {
        return "Chrome";
    }


    public void SetDriver(String browser)
    {
        browserManager browserManager = new browserManager();
        browserManager.initbrowser(browser);

    }
}
