package steps;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();

    @Given("I navigate to Sauce Demo")
    public void navigation(){
        loginPage.navigateTo("https://www.saucedemo.com/v1/");
    }

    @When("I enter the username {string}")
    public void enterUsername(String username){
        loginPage.EnterUsername(username);
    }

    @When("I enter the password {string}")
    public void enterPassword(String password){
        loginPage.EnterPassword(password);
    }

    @When("I click the login button")
    public void clickOnLoginButton(){
        loginPage.PressOnLoginButton();
    }

    @Then("I access to the website and the {string} is visible")
    public void assertAccessToTheWebsite(String title){
        String actualTitle = loginPage.getWebsiteTitle();

        Assert.assertEquals(actualTitle, title);
    }

    @Then("The message {string} is displayed")
    public void assertInvalidMessage(String message){
        String actualMessage = loginPage.getErrorMessage();

        Assert.assertEquals(actualMessage, message);
    }
}
