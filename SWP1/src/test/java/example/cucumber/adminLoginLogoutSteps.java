package example.cucumber;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import application.ProjectApp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class adminLoginLogoutSteps {
    private ProjectApp projectApp;
    private String password;

    public adminLoginLogoutSteps(ProjectApp projectApp) {
        this.projectApp = projectApp;
    }

    @Given("that the admin is logged in")
    public void thatTheAdminIsLoggedIn() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();

}
