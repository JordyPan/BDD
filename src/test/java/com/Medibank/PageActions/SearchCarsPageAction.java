package com.Medibank.PageActions;

import Medibank.Managers.BrowserInstanceManager;
import Medibank.PageObject.CarGuidesHomePage;
import Medibank.PageObject.SearchCarsPage;
import com.Medibank.base.base;
import org.openqa.selenium.WebDriver;

public class SearchCarsPageAction extends base {

    WebDriver driver;
    SearchCarsPage searchCarsPage = null;
    public SearchCarsPageAction()
    {
        driver = BrowserInstanceManager.GetBrowserInstance();

        this.searchCarsPage = new SearchCarsPage(driver);
    }

    public void SelectAnyMake(String brandName)
    {
        SelectDropDown(searchCarsPage.getAnyMakeField(),brandName);
    }
}
