/******************************************************************************************

* Employee Class

* Author: Christian Wilburn

* Project Purpose: Program to display employee info 

* Input: This program does not accept inputs

* Desired Output: The employee name, id, dept and position is displayed in the console

* Variables and Classes: There are two classes, main and Employee with variables to hold each employee's data.

* Formulas: none

* Testing: When the program is run without inputs, the employee info appears in the console.

* 4 February 2025

*********************************************************************************************/ 
package employeetest;


public class EmployeeTest {
    public static void main(String[] args) {
        
        // create three Employee objects with given data
        Employee employee1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
        Employee employee2 = new Employee("Mark Jones", 39119, "IT", "Programmer");
        Employee employee3 = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");

        // display data for each employee
        System.out.println("Employee Data:");
        System.out.println("------------------------------");

        System.out.println("Name: " + employee1.getName());
        System.out.println("ID Number: " + employee1.getIdNumber());
        System.out.println("Department: " + employee1.getDepartment());
        System.out.println("Position: " + employee1.getPosition());
        System.out.println();

        System.out.println("Name: " + employee2.getName());
        System.out.println("ID Number: " + employee2.getIdNumber());
        System.out.println("Department: " + employee2.getDepartment());
        System.out.println("Position: " + employee2.getPosition());
        System.out.println();

        System.out.println("Name: " + employee3.getName());
        System.out.println("ID Number: " + employee3.getIdNumber());
        System.out.println("Department: " + employee3.getDepartment());
        System.out.println("Position: " + employee3.getPosition());
    }
}