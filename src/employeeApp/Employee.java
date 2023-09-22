package employeeApp;

import java.util.Arrays;

public class Employee {
    private String id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthplans;

    public Employee(String id, String fullName, String email, String password, String[] healthplans){
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthplans = healthplans;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String[] getHealthplans() {
        return healthplans;
    }
    public void setHealthplans(String[] healthplans) {
        this.healthplans = healthplans;
    }
    public void addHealthplan(int index, String name){
        try{
            boolean doesExist = false;
            for(String healthPlan: healthplans){
                if(healthPlan != null && healthPlan.equals(name)){
                    doesExist = true;
                    break;
                }
            }
            if(!doesExist){
                if(healthplans[index] == null){
                    healthplans[index] = name;
                } else{
                    System.out.println("This index is occupied.");
                }
            } else{
                System.out.println("A health plan with the name " + name + " already exists.");
            }
        } catch(Exception exception){
            System.out.println("Invalid index.");
        }   
    }

    @Override
    public String toString() {
        return "ID: " + id + " Full Name: " + fullName + " E-mail: " + email + " Password: " + password + " Health plan: " + Arrays.toString(healthplans) ;
    }
}
