package corejava.has_a_relation;

import java.util.Arrays;
import java.util.List;
// Aggregation Example
public class Aggregation {
    public static void main(String[] args) {
        // Create departments
        Department hrDepartment = new Department("HR");
        Department itDepartment = new Department("IT");
        Department financeDepartment = new Department("Finance");

        // Create a list of departments
        List<Department> departments = Arrays.asList(hrDepartment,itDepartment,financeDepartment);

        // Create a university wih departments
        University myUniversity = new University(departments);

        // Display university information
        myUniversity.displayUniversityInfo();
    }
}

// Department class (can exits independently)
class Department{
    private String name;

    // Department constructor
    public Department(String name){
        this.name=name;
    }

    // Department methods
    public void displayDepartmentInfo(){
        System.out.println("Department: " +name);
    }
}

// University class with aggregation relationship
class University{
    private List<Department> departments; // Aggregation

    // University constructor
    public University(List<Department> departments){
        this.departments = departments;
    }

    // Display information about all departments in the university
    public void displayUniversityInfo(){
        System.out.println("University Information");
        for (Department department: departments){
            department.displayDepartmentInfo();
        }
    }

}
