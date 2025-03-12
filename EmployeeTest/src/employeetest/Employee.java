
package employeetest;


public class Employee {
 
    private String name;
    private int idNumber;
    private String department;
    private String position;

    // accept name, idNumber, department, and position.
    public Employee(String name, int idNumber, String department, String position) {
        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;
    }

    // accept name and idNumber, and assign empty strings for department and position.
    public Employee(String name, int idNumber) {
        this(name, idNumber, "", "");
    }

    // No arg constructor assigns empty strings and 0 to idNumber.
    public Employee() {
        this("", 0, "", "");
    }

    public String getName() {
        return name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
