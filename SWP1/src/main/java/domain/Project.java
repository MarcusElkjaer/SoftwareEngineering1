package domain;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class Project {
    private String projectName;
    private Employee projectLeader;
    private int id;

    private ArrayList<Employee> employees;

    List<Activity> activities = new ArrayList<>();



    public Project(String projectName, int id){
        this.projectName = projectName;
        this.id = id;
        this.employees = new ArrayList<>();
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProjectLeader(Employee employee) {
        this.projectLeader = employee;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
    public ArrayList<Employee> getEmployees() {
        return employees;
    }
    public Employee getProjectLeader() {
        return projectLeader;
    }
}
