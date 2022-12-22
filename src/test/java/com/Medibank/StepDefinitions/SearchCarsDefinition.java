package com.Medibank.StepDefinitions;

import Medibank.Managers.BrowserInstanceManager;
import Medibank.PageObject.CarGuidesHomePage;
import Medibank.PageObject.SearchCarsPage;
import com.Medibank.PageActions.CarGuidesHomePageAction;
import com.Medibank.PageActions.SearchCarsPageAction;
import com.Medibank.base.base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class SearchCarsDefinition extends base {
    WebDriver driver;
    CarGuidesHomePage carGuidesHomePage;
    SearchCarsPage searchCarsPage;
    CarGuidesHomePageAction carGuidesHomePageAction;
    SearchCarsPageAction searchCarsPageAction;
    public SearchCarsDefinition()
    {
        driver = BrowserInstanceManager.GetBrowserInstance();
        carGuidesHomePageAction = new CarGuidesHomePageAction();
        searchCarsPageAction = new SearchCarsPageAction();

    }
    @Given("user is on the home page {string}")
    public void user_is_on_the_home_page(String url) {
        carGuidesHomePageAction.NavigateHome(url);
    }
    @When("user hovers to the menu {string}")
    public void user_hovers_to_the_menu(String menuName,DataTable dataTable){
        List<List<String>> menuItems = dataTable.asLists();

        carGuidesHomePageAction.HoverBuySellMenu();
    }
    @And("clicks on {string} link")
    public void clicks_on_link(String link) {
        // Write code here that turns the phrase above into concrete actions
        carGuidesHomePageAction.ClickLink(link);
    }
    @And("select car brand as {string} from AnyMake Dropdown")
    public void select_car_brand_as_from_any_make_dropdown(String brandName) {
        searchCarsPageAction.SelectAnyMake(brandName);
    }
    @And("select car model as {string} from SelectModel Dropdown")
    public void select_car_model_as_from_select_model_dropdown(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("select location as {string} from Location Dropdown")
    public void select_location_as_from_location_dropdown(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("select max price as {string} from Price\\(Max) Dropdown")
    public void select_max_price_as_from_price_max_dropdown(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("user clicks on Find_My_Next_Car button")
    public void user_clicks_on_find_my_next_car_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user should see list of search cars")
    public void user_should_see_list_of_search_cars() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("Page title should include {string}")
    public void page_title_should_include(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
