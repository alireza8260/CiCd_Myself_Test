package cydeo.steps;

import cydeo.pages.StatusCodePage;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StatusCodeDefs {
    StatusCodePage statusCodePage = new StatusCodePage();
    @Then("user should see the below list of status code")
    public void user_should_see_the_below_list_of_status_code(List<String> expectedlistOFstatus) {
        System.out.println("expectedlistOFstatus = " + expectedlistOFstatus);
       List<String>actualListOfStatus = new ArrayList<>();
        for (WebElement each : statusCodePage.listOfStatusCode) {
            String[] statusCodes = each.getText().split("\\s+"); // Splits on whitespace or newlines
            actualListOfStatus.addAll(Arrays.asList(statusCodes));
        }
        System.out.println("actualListOfStatus = " + actualListOfStatus);
         Assert.assertEquals(expectedlistOFstatus, actualListOfStatus);


    }
}
