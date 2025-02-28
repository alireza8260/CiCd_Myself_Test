package cydeo.steps;

import cydeo.pages.PracticePage;
import cydeo.utilities.BrowserUtils;
import cydeo.utilities.ConfigurationReader;
import cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static org.junit.Assert.*;

public class StepDefs {
    PracticePage practicePage = new PracticePage();

    @Given("user should be in home page")
    public void user_should_be_in_home_page() {
        System.out.println("Login Method run in hook");


    }
    @When("user should choose {string} page")
    public void user_should_choose_page(String page) {
       practicePage.clickLinkText(page);



    }
    @Then("user should be login with valid credentails")
    public void user_should_be_login_with_valid_credentails() {
        practicePage.login();

    }
    @Then("user should see {string} message")
    public void user_should_see_message(String expectedMessage) {
        String actualMessage = practicePage.message.getText();
       assertTrue(actualMessage.contains(expectedMessage));

    }

}
