package steps;

import java.util.List;

import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddToCartPage;

public class AddToCartSteps {
    AddToCartPage cartPage = new AddToCartPage();

    @When("The user adds the {string} to the cart")
    public void addProductToTheCart(String product){
        cartPage.addProductToCart(product);
    }

    @Then("The cart badge should show {string}")
    public void assertCartBadgeCount(String items){
        String actualItems = cartPage.cartItems();
        Assert.assertEquals(actualItems, items);
    }

    @When("The user adds the following products to the cart:")
    public void addMultipleProductsToTheCart(DataTable dataTable) {
        List<String> products = dataTable.asList(String.class);
        for (String product : products) {
            cartPage.addProductToCart(product);
        }
    }

}
