Feature: Open category and filter

  Scenario: As a user, I open the category and filter by category
    Given I am on the homepage
    When I should see logo
    Then I should see search bar
    When I click on "Women" Tab
    Then I should see shop by option
    And I shop by "Tops"
    Then I should see filter option
    And I should see sorting selection
    And I should see product items
    And I should see add to cart button on product items
    When I filter by category "Tees"
    Then I should see product list has been filtered by "Tees"
