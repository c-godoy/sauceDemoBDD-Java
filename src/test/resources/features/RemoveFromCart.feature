@RemoveFromCart
Feature: Remove products from cart

    Background:
        Given I navigate to Sauce Demo
        When I enter the username "standard_user"
        And I enter the password "secret_sauce"
        And I click the login button

    @removeOneProductFromTheCart
    Scenario: Remove a product from the cart
        When The user adds the "Sauce Labs Backpack" to the cart
        And The cart badge shows "1"
        Then The cart badge should not be visible