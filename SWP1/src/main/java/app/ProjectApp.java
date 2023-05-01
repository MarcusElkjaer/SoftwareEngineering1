package app;

import app.OperationNotAllowedException;
import domain.Activity;
import domain.Employee;
import domain.Project;

import java.util.ArrayList;
import java.util.Observable;

public class ProjectApp extends Observable {

    private boolean adminLoggedIn = false;
    ArrayList<Employee> employeeArrayList = new ArrayList<Employee>();

    public int projectCount;
    ArrayList<Project> projectList = new ArrayList<Project>();

    ////// Admin things //////
    public boolean adminLoggedIn() {
        // returns true if admin is logged in, false if admin isn't logged in
        return adminLoggedIn;
    }

    public boolean adminLogin(String password) {
        adminLoggedIn = password.equals("adminadmin");
        setChanged();
        notifyObservers();
        return adminLoggedIn;
    }

    public void adminLogout() {
        adminLoggedIn = false;
        setChanged();
        notifyObservers();
    }

    private void checkAdministratorLoggedIn() throws OperationNotAllowedException {
        if (!adminLoggedIn()) {
            throw new OperationNotAllowedException("Administrator login required");
        }
    }

    ////// Employee things //////
    public boolean checkAge(Employee employee) {
            if (employee.getAge() >= 70) {
                return false;
            }
        return true;
    }
    //Tjekker om om initals opfylder max 4 initialer
    public boolean checkInitials(Employee employee) {
            if (employee.getInitials().length() > 5) {
                return false;
                //Throw expection, find ud af hvordan man gør det****
            }
            return true;
        }


    public boolean addEmployee(Employee employee) {
        int sizeOfEmpList = employeeArrayList.size();
        if (checkInitials(employee) && checkAge(employee)) {
            employeeArrayList.add(employee);
        }
        if (sizeOfEmpList < employeeArrayList.size()) {
            return true;
        }
        return false;
    }

    ////// Project things /////

    public void createProject (String projectName){;
        projectList.add(new Project(projectName, projectCount));
        projectCount++;
    }
    public void addProject(Project project){
        projectList.add(project);
    }



}
