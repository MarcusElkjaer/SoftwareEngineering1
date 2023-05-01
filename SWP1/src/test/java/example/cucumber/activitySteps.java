package example.cucumber;

import app.ProjectApp;
import domain.Activity;
import domain.Project;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class activitySteps {

    private ProjectApp projectApp;
    private Project project;
    private List<Activity> activities;
    private Activity activity;

    private String projectName;
    private String activityName;

    @Given("these projects are contained in the library")
    public void theseProjectsAreContainedInTheLibrary(List<List<String>> acts) {
        for (List<String> actList : acts) {
            project.addActivity(new Activity(actList.get(0)));
        }
    }

    @Given("that a project with the name {string} exists.")
    public void thatAProjectWithTheNameExists(String projectName) {

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
