package com.Medibank.PageActions;

import Medibank.Managers.BrowserInstanceManager;
import Medibank.PageObject.CarGuidesHomePage;
import com.Medibank.base.base;
import org.openqa.selenium.WebDriver;


public class CarGuidesHomePageAction extends base {
    WebDriver driver;
    CarGuidesHomePage carGuidesHomePage = null;
    public CarGuidesHomePageAction()
    {
        driver = BrowserInstanceManager.GetBrowserInstance();

        this.carGuidesHomePage = new CarGuidesHomePage(driver);
    }

    public void NavigateHome(String url)
    {
        driver.get(url);
    }
    public void HoverBuySellMenu()
    {
        Hover(carGuidesHomePage.getBuyPlussellMenu());
    }

    public void ClickLink(String link)
    {
        if(link.equalsIgnoreCase("Search Cars"))
        {
            clickItem(carGuidesHomePage.getSearchCarsBtn());
        }

    }





}
