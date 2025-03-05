package pages;

import java.util.NoSuchElementException;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class AddToCartPage extends BasePage {

    public AddToCartPage() {
        super(driver);
    }

    // Elements
    private String addToCartButtonXPath = "//div[@class='inventory_item']//div[text()='%s']/ancestor::div[@class='inventory_item']//button";
    private String cartItemCount = "//*[@id='shopping_cart_container']/a/span";

    public void addProductToCart(String productName) {
        try {
            String xpathButton = String.format(addToCartButtonXPath, productName);
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            WebElement addToCartButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathButton)));
            addToCartButton.click();
        } catch (NoSuchElementException e) {
            System.out.println("The product" + productName + "wasn't found");
        } catch (TimeoutException e) {
            System.out.println("The button" + productName + "it is not clickable");
        }
    }

    public String cartItems() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            WebElement cartBadge = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(cartItemCount)));
            return cartBadge.getText();
        } catch (NoSuchElementException e) {
            return "0";
        } catch (TimeoutException e) {
            return "0"; 
        }
    }
}
