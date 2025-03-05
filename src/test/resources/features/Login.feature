@Login
Feature: Login
    Navigate to the website and login with credentials

    Background: Navigate to the website
        Given I navigate to Sauce Demo

    @validLogin
    Scenario:  Successful login with valid credentials
        When I enter the username "standard_user"
        And I enter the password "secret_sauce"
        And I click the login button
        Then I access to the website and the "Products" is visible

    @invalidLogin
    Scenario: Failed login with invalid credentials
        When I enter the username "standard_user"
        And I enter the password "wrong_pass"
        And I click the login button
        Then The message "Epic sadface: Username and password do not match any user in this service" is displayed

    @lockedOutUserLogin
    Scenario: Login with a locked-out user
        When I enter the username "locked_out_user"
        And I enter the password "secret_sauce"
        And I click the login button
        Then The message "Epic sadface: Sorry, this user has been locked out." is displayed