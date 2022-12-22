package com.Medibank.StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchCarsDefinition {
    @Given("user is on the home page {string}")
    public void user_is_on_the_home_page(String string) {
        
    }
    @When("user hovers to the menu buy + sell")
    public void user_hovers_to_the_menu_buy_sell(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new io.cucumber.java.PendingException();
    }
    @When("clicks on {string} link")
    public void clicks_on_link(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("select car brand as {string} from AnyMake Dropdown")
    public void select_car_brand_as_from_any_make_dropdown(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("select car model as {string} from SelectModel Dropdown")
    public void select_car_model_as_from_select_model_dropdown(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("select location as {string} from Location Dropdown")
    public void select_location_as_from_location_dropdown(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("select max price as {string} from Price\\(Max) Dropdown")
    public void select_max_price_as_from_price_max_dropdown(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user clicks on Find_My_Next_Car button")
    public void user_clicks_on_find_my_next_car_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user should see list of search cars")
    public void user_should_see_list_of_search_cars() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Page title should include {string}")
    public void page_title_should_include(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
