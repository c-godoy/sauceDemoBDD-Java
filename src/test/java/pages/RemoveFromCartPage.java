package pages;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RemoveFromCartPage extends BasePage {

    public RemoveFromCartPage() {
        super(driver);
    }

    // Elements
    private By cartItemCount = By.xpath("//*[@id='shopping_cart_container']/a/span");

    public boolean cartBadgeIsNotVisible() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            WebElement cartBadge = wait.until(ExpectedConditions.visibilityOfElementLocated(cartItemCount));
            return cartBadge.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

}
