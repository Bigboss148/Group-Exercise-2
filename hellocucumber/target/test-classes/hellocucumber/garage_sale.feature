Feature: looking for a nearby garage sales

Scenario: search by location
    Given I am on the home page
    When I enter "Omaha Ne" In location
    And I click the search button
    Then I should see a list of garage sales closest to me


 Scenario: no sales happening
    Given I am on the home page
    When I search for "Omaha, ne"
    And I click the search button
    Then I should see a message "no garage sales available near you"