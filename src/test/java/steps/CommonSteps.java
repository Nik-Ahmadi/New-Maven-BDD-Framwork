package steps;

import base.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Page;
import utilities.SeleniumUtility;

import java.time.Duration;

public class CommonSteps extends SeleniumUtility {
    /*
    @Given("open browser")
    public void open_browser() {
        openBrowser();
    }

     */

    @When("navigate to url")
    public void navigate_to_url() {
        navigateURL();
    }
    @Then("get title and validate title is {string}")
    public void get_title_and_validate_title_is(String expectedTitle) {
        String title = getDriver().getTitle();
        Assert.assertEquals(title , expectedTitle);

    }
    @Then("assure create primary button exists")
    public void assure_create_primary_button_exists() {
        System.out.println(getElementText(Page.PRIMARY_BUTTON));

    }
    /*
    @Then("close browser")
    public void close_browser() {
        closeBrowser();
        }
     */

    @Then("click on Create primary account")
    public void click_on_create_primary_account() {
        clickElement(Page.PRIMARY_BUTTON);
    }
    @Then("validate {string} appears")
    public void validate_appears(String expectedHeading) {
        String h2Text = getElementTextWait(Page.PRIMARY_HEADING_ACCOUNT,10);
        Assert.assertEquals(h2Text,expectedHeading);
    }
    String email = "Chris.divit@email.com";
    @Then("fill the Create Primary Account Form")
    public void fill_the_create_primary_account_form() {
        // getDriver().findElement(By.id("email")).sendKeys(email);
        setElementData(Page.EMAIL , email);
       // getDriver().findElement(By.xpath("//option[@value='Mr.']")).click();
        clickElement(Page.TITLE);
        //getDriver().findElement(By.id("firstName")).sendKeys("Chris");
        setElementData(Page.FIRSTNAME, "Chris");
        //getDriver().findElement(By.id("lastName")).sendKeys("divit");
        setElementData(Page.LASTNAME , "divit");
        //getDriver().findElement(By.xpath("//option[@value='MALE']")).click();
        clickElement(Page.GENDER);
        //getDriver().findElement(By.xpath("//option[@value='SINGLE']")).click();
        clickElement(Page.MARITAL_STATUS);
        //getDriver().findElement(By.id("employmentStatus")).sendKeys("Employed");
        setElementData(Page.EMPLOYMENT_STATUS , "Employed");
       // getDriver().findElement(By.id("dateOfBirth")).sendKeys("01/26/1990", Keys.RETURN);
        setElementData(Page.DATE_OF_BIRTH , "01/26/1990");
        clickElement(Page.DATE_OF_BIRTH);

    }
    @Then("submit the form")
    public void submit_the_form() {
        clickElement(Page.CREATE_ACCOUNT);

    }
    @Then("validate {string} appears and verify email")
    public void validate_appears_and_verify_email(String expectedHeading) {
        String singUpHeading = getElementTextWait(Page.SIGN_UP_HEADING,10);
        Assert.assertEquals(singUpHeading,expectedHeading);
        String verifyEmail = getElementText(Page.VERIFY_EMAIL);
        Assert.assertEquals(verifyEmail, email);
    }
    @Then("verify error {string} appears")
    public void verify_error_appears(String expectedError) {
        String verifyErrorExsit = getElementTextWait(Page.ACCOUNT_EXIST_ERROR, 10);
        Assert.assertEquals(verifyErrorExsit ,expectedError);

    }
}
