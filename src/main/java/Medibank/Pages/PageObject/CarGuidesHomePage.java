package Medibank.Pages.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarGuidesHomePage {
    WebDriver driver;

    public CarGuidesHomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(linkText = "buy + sell")
    private WebElement buyPlussellMenu;

    @FindBy(linkText = "reviews")
    private WebElement reviewsMenu;

    @FindBy(linkText = "Search Cars")
    private WebElement SearchCarsBtn;

    public WebElement getBuyPlussellMenu()
    {
        return buyPlussellMenu;
    }

    public WebElement getReviewsMenu()
    {
        return reviewsMenu;
    }

    public WebElement getSearchCarsBtn()
    {
        return SearchCarsBtn;
    }

}
