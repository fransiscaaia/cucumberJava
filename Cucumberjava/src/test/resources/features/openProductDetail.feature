Feature: Open Product Detail

  Scenario: As a user, I open product detail page
    Given I am on the homepage
    When I should see search bar
    And I click on the search bar
    Then I search for "jacket"
    When I should see search result for "jacket"
    And I should see product list
    When I click on product "Juno Jacket"
    Then I should direct to product detail of "Juno Jacket"
    And I should see product image
    And I should see product price
    And I should see add to cart button
    And I should see product detail and information
    And I should see related product section
    When I click on product image
    Then I should see product image becomes full screen