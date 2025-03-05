package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import pages.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", 
    glue = "steps",
    plugin = { "pretty", "html:target/cucumber-reports" },
    tags = "@removeOneProduct")

public class testRunner {
    @AfterClass
    public static void clearDriver(){
        BasePage.quitBrowser();
    }
}