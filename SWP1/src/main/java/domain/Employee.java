package domain;

import javax.naming.Name;

public class Employee {
    private String name;
    private int age;
    private String initials;

    private int activitiesCount;

    public Employee(String name,int age, String initials){
            this.name = name;
            this.age = age;
            this.initials = initials;
            this.activitiesCount = 0;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getInitials(){
     return initials;
    }

    public int getAssignedActivities() {
        return activitiesCount;
    }
    public boolean checkAge(){
        if (age >=70){
            return false;
            //Throw expection, find ud af hvordan man gør det****
        }
        return true;
    }
    //Tjekker om om initals opfylder max 4 initialer
    public boolean checkInitials(){
            if (initials.length() > 5){
                return false;
            //Throw expection, find ud af hvordan man gør det****
            }
            return true;
    }
    public void assignActivity(Activity activity) {
        this.activitiesCount++;
    }
}

