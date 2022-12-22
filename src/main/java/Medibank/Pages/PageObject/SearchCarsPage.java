package Medibank.Pages.PageObject;

import com.beust.ah.A;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchCarsPage {

    WebDriver driver;

    public SearchCarsPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "makes")
    private WebElement AnyMakeField;

    public WebElement getAnyMakeField()
    {
        return AnyMakeField;
    }

}
