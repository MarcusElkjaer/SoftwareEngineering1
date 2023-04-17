package domain;

import domain.Activity;
import domain.Employee;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class Project {
    private String projectName;
    private Employee projectLeader;
    private int id;
    private GregorianCalendar startDate = new GregorianCalendar(1000, 0, 1);
    List<Activity> activities = new ArrayList<>();


    public Project(String name, int id){
        this.projectName = projectName;
        this.id = id;
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



}
