package application;

import domain.Employee;

import java.util.ArrayList;
import java.util.Observable;

public class projectApp extends Observable {

    ArrayList<Employee> employeeArrayList = new ArrayList<Employee>();


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



}
