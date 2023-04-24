package example.cucumber;

import domain.Activity;
import domain.Project;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class activitySteps {

    private String projectName;
    private String activityName;
    private Project project;
    private Activity activity;

    @Given("that a project with the name {string} exists.")
    public void thatTheAProjectWithTheNameExists(String projectName) {

    }
    @Given("the assigned project leader is logged in.")
    public void theAssignedProjectLeaderIsLoggedIn() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the project leader creates an activity.")
    public void theProjectLeaderCreatesAnActivity() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("an activity is created successfully.")
    public void anActivityIsCreatedSuccessfully() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
