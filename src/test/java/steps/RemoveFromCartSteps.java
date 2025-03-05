package steps;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddToCartPage;
import pages.RemoveFromCartPage;

public class RemoveFromCartSteps {
    AddToCartPage removeCartPage = new AddToCartPage();
    RemoveFromCartPage cartBadge = new RemoveFromCartPage();
    
    @When("The cart badge shows {string}")
    public void assertCartBadgeCount(String count){
        String actualItems = removeCartPage.cartItems();
        Assert.assertEquals(actualItems, count);
    }

    @Then("The cart badge should not be visible")
    public void assertCartBadgeVisibility(){
        Assert.assertTrue(cartBadge.cartBadgeIsNotVisible());
    }
    
    
}
