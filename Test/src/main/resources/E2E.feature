Feature: checkout functionality

  Scenario: As a user I am able to checkout as guest
    Given I visit the website as a guest user
    When I search for the product "dress" from searchbox
    Then I navigate to product details page
    When I select a random product
    And I navigate to PDP
    And I click on "ADD TO CART" button
    When I click on bag icon from header
    Then I navigate to shopping bag page
    When I proceed to checkout as guest
    Then I navigate to checkout page
