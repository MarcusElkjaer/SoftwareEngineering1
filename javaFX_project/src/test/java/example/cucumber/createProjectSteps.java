package example.cucumber;

import static org.junit.jupiter.api.Assertions.assertTrue;

import domain.Project;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class createProjectSteps {
	private Project project;
	private String projectName;

	@Given("that the company get a project with the name {string}.")
	public void that_the_company_get_a_project_with_the_name(String projectName) {
		this.projectName = projectName;
	}
	@When("an employee creates the project.")
	public void an_employee_creates_the_project() {
		int id = generateID();
		project = new Project(projectName,id);
	}
	@Then("a project with the name {string} is created successfully.")
	public void a_project_with_the_name_is_created_successfully(String projectName) {
		// Write code here that turns the phrase above into concrete actions
		assert projectName.equals(project.getProjectName());
	}
	@Then("the project gets given a project id.")
	public void the_project_gets_given_a_project_id() {
		// Write code here that turns the phrase above into concrete actions
		assert project.getId() > 0;
	}
	private int generateID() {
		return 1234;
	}
}