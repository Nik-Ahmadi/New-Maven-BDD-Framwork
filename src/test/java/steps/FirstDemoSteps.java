package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstDemoSteps {
    @Given("say hello")
    public void say_hello() {
        System.out.println("Hello");
    }
    @When("say how are you")
    public void say_how_are_you() {
        System.out.println("Say How Are You");
    }
    @Then("say GoodBye")
    public void say_good_bye() {
        System.out.println("Say GoodBye");
    }
}
