@AddToCart
Feature: Add to Cart
    Add products to the cart

    Background:
        Given I navigate to Sauce Demo
        When I enter the username "standard_user"
        And I enter the password "secret_sauce"
        And I click the login button

    @addOneProduct
    Scenario: Add a single product to the cart
        When The user adds the "Sauce Labs Backpack" to the cart
        Then The cart badge should show "1"

    @addMultipleProducts
    Scenario: Add multiple products to the cart
        When The user adds the following products to the cart:
            | ProductName           |
            | Sauce Labs Backpack   |
            | Sauce Labs Bike Light |
        Then The cart badge should show "2"