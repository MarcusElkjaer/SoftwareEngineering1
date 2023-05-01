package example.cucumber;

import domain.Employee;
import domain.Project;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEmployeetoProjectTest {
    private Project project;
    private Employee employee;

    @Given("Project with id {int} and name {string} exists")
    public void create_project(int id, String name) {
        project = new Project(name, id);
    }

    @Given("Employee with name {string} and age {int} and initials {string} exists")
    public void an_employee(String name, int age, String initials) {
        employee = new Employee(name, age, initials);
    }

    @When("User adds employee {string} to Project with id {int}")
    public void add_employee_to_project(String name, int id) {
        project.addEmployee(employee);
    }

    @Then("employee {string} should be assigned to Project with id {int}")
    public void the_project_should_have_one_more_employee(String name, int id) {
        assert (project.getEmployees().size() == 1);
        assert (project.getEmployees().get(0).equals(employee));
    }
}