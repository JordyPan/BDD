@Search-Cars
Feature: Acceptance testing to validate that search cars functionality is working fine


  @SearchCars
  Scenario Outline: Validate Search Cars page
    Given user is on the home page "<URL>"
    When user hovers to the menu buy + sell
      | Menu |
      | buy + sell |
      | reviews |
      | news |
      | advice |
    And clicks on "Search Cars" link
    And select car brand as "<CarBrand>" from AnyMake Dropdown
    And select car model as "<CarModel>" from SelectModel Dropdown
    And select location as "<CarLocation>" from Location Dropdown
    And select max price as "<CarPriceMax>" from Price(Max) Dropdown
    And user clicks on Find_My_Next_Car button
    Then user should see list of search cars
    And Page title should include "<PageTitle>"

    Examples:
      | URL | CarBrand | CarModel | CarLocation | CarPriceMax | PageTitle |
      |https://www.carsguide.com.au/| BMW | 1 Series | VIC - ALL | $200,000 | Bmw 1 Series Under 200000 for Sale |

