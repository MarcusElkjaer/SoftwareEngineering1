package example.cucumber;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import app.ProjectApp;
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
    public void thatTheAdminIsLoggedIn() throws Exception {
        assertTrue(projectApp.adminLoggedIn());
    }

    @Given("that the admini is not logged in")
    public void thatTheAdminIsNotLoggedIn() throws Exception {
        assertFalse(projectApp.adminLoggedIn());
    }

    @Given("the password is {string}")
    public void thePasswordIs(String password) throws Exception {
        this.password = password;
    }

    @When("the admin logs out")
    public void theAdminLogsOut() throws Exception {
        projectApp.adminLogout();
    }

    @Then("the admin login succeeds")
    public void theAdminLoginSucceeds() throws Exception {
        assertTrue(projectApp.adminLogin(password));
    }

    @Then("the admin login fails")
    public void theAdminLoginFails() throws Exception {
        assertFalse(projectApp.adminLogin(password));
    }

    @Then("the admin is not logged in")
    public void theAdminIsNotLoggedIn() throws Exception {
        assertFalse(projectApp.adminLoggedIn());
    }


}
