@UITest
Feature: Phone Purchase E2E Tests

  Scenario: Login with valid username and password
    Given I have opened the browser and navigated to the StackDemo login page

    When I click on the username dropdown
    And I press Enter
    And I click on the password dropdown
    And I press Enter
    And I click on the Login button
    And I click on the OnePlus phone Vendor button
    And I click on the add to cart button
    And I click on the checkout button
    And I fill out the shipping address with "John" "Doe" "123 Main St" "California" "12345"
    Then The total checkout price should be "$599.00"
    And I click on the submit button
    Then The confirmation message should be "Your Order has been successfully placed."


  Scenario: Purchase Apple phone
    Given I have opened the browser and navigated to the StackDemo login page

    When I click on the username dropdown
    And I press Enter
    And I click on the password dropdown
    And I press Enter
    And I click on the Login button
    And I click on the Apple phone Vendor button
    And I click on the the iPhone12 to add to cart button
    And I click on the checkout button
    And I fill out the shipping address with "Tester" "Doe" "New Street 32" "California" "1122"
    Then The total checkout price should be "$799.00"
    And I click on the submit button
    Then The confirmation message should be "Your Order has been successfully placed."
