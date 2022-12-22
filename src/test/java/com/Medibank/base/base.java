package com.Medibank.base;

import Medibank.Managers.BrowserInstanceManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class base {
    WebDriver driver;
    public WebElement WaitElementClick(WebElement webElement)
    {
        driver = BrowserInstanceManager.GetBrowserInstance();
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        webElement = webDriverWait.until(ExpectedConditions.elementToBeClickable(webElement));
        return webElement;
    }


    public WebElement WaitElementVisable(WebElement webElement)
    {
        driver = BrowserInstanceManager.GetBrowserInstance();
        WebDriverWait webDriverWait = new WebDriverWait(driver,Duration.ofSeconds(10));
        webElement = webDriverWait.until(ExpectedConditions.visibilityOf(webElement));
        return webElement;
    }

    public Alert WaitAlertPresent()
    {
        driver = BrowserInstanceManager.GetBrowserInstance();
        WebDriverWait webDriverWait = new WebDriverWait(driver,Duration.ofSeconds(10));
        Alert alert = webDriverWait.until(ExpectedConditions.alertIsPresent());
        return alert;
    }

    public WebElement clickItem(WebElement webElement)
    {
        WaitElementClick(webElement).click();

        return webElement;
    }

    public void Hover(WebElement webElement)
    {
        driver = BrowserInstanceManager.GetBrowserInstance();
        Actions actions = new Actions(driver);
        actions.moveToElement(WaitElementVisable(webElement)).build().perform();
    }

    public void SelectDropDown(WebElement selectName, String Name)
    {
        WaitElementVisable(selectName);
        Select select = new Select(selectName);
        select.selectByVisibleText(Name);

    }
}
