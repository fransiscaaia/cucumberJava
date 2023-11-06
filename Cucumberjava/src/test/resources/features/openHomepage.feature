Feature: Open homepage

  Scenario: As a user, I open the homepage website
    Given I am on the homepage
    When I should see logo
    Then I should see search bar
    And I should see sign in text
    And I should see create account text
    And I should see cart icon
    And I should see promo section
    And I should see hot seller items
