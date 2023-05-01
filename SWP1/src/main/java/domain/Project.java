package domain;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class Project {
    private String projectName;
    private Employee projectLeader;
    private int id;
    private GregorianCalendar startDate = new GregorianCalendar(1000, 0, 1);
    List<Activity> activityList = new ArrayList<>();


    public Project(String projectName, int id){
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

    public void addActivity(Activity activity) { activityList.add(activity); }

    public List<Activity> getActivityList() {
        return activityList;
    }



}
