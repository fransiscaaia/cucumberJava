Feature: Search Product

  Scenario: As a user, I search product
    Given I am on the homepage
    When I should see search bar
    And I click on the search bar
    Then I search for "hoodie"
    When I should see search result for "hoodie"
    And I should see sorting selection
    And I should see product list
    And I should see product items
    And I should see add to cart button on product items
    When I click on add to cart button
    Then I should direct to product detail
