package employeeApp;

import java.util.Arrays;

public class Company {
    private String id;
    private String name;
    private double giro; 
    private String[] developerNames;

    public Company(String id, String name, double giro, String[] developerNames){
        this.id = id;
        this.name = name;
        this.giro = giro;
        this.developerNames = developerNames;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getGiro() {
        return giro;
    }
    public void setGiro(double giro) {
        if(giro < 0){
            this.giro = 0;
        } else {
            this.giro = giro;    
        }   
    }
    public String[] getDeveloperNames() {
        return developerNames;
    }
    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }
    public void addEmployee(int index, String name){
        try{
            boolean doesExist = false;
            for(String developerName: developerNames){
                if(developerName != null && developerName.equals(name)){
                    doesExist = true;
                    break;
                }
            }
            if(!doesExist){
                if(developerNames[index] == null){
                    developerNames[index] = name;
                } else{
                    System.out.println("This index is occupied.");
                }
            } else{
                System.out.println("An employee with the name " + name + " already exists.");
            }
        } catch(Exception exception){
            System.out.println("Invalid index.");
        }   
    }
    @Override
    public String toString() {
        return "Id: " + id + " Name: " + name + " Giro: " + giro + " Developer Names: " + Arrays.toString(developerNames);
    }
}
