package example.cucumber;

import domain.Employee;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertTrue;

public class addEmployee {
    private Employee employee;
    @Given("that the employees initials are {string} or less")
    public void that_the_employees_initials_are_or_less(String string) {
        assertTrue(employee.checkInitials());
        throw new io.cucumber.java.PendingException();
    }
    @Given("they are under the age of {int}")
    public void they_are_under_the_age_of(Integer int1) {
        assertTrue(employee.checkAge());
        throw new io.cucumber.java.PendingException();
    }
    @Then("the employee has been added")
    public void add_the_employee_has_been_added() {
        assertTrue(true);
        throw new io.cucumber.java.PendingException();
    }

    @Given("that employee has more than {string} initials")
    public void that_employee_has_more_than_initials(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the error message {string} is given")
    public void the_error_message_is_given(String string1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("that employee is older than {int} ears old")
    public void that_employee_is_older_than_ears_old(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the error message {string} is given")
    public void the_error_message_is_shown(String string1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
