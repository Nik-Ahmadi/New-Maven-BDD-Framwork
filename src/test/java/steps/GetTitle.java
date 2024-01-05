package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
    WebDriver driver;
    @Given("open the browser")
    public void open_the_browser() {
         driver= new ChromeDriver();

    }
    @When("navigate to google.com")
    public void navigate_to_google_com() {
        driver.get("https://www.google.com");

    }
    @Then("the title should be google")
    public void the_title_should_be_google() {
       String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(title, "Google");

    }
    @Then("close the browser")
    public void close_the_browser() {
        driver.quit();
    }
}
