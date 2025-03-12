
package workerinfo;
import javax.swing.JOptionPane;

public class Employee {
    private String name;
    private String badgeNum;
    private String hireDate;
    
    public Employee(String name, String badgeNum, String hireDate){
        if (!isValidBadgeNum(badgeNum)) {
            
            // validate badge number
            JOptionPane.showMessageDialog(null, "Invalid Employee Number! Format should be XXX-L (X: 0-9, L: A-M).",
                    "Error", JOptionPane.ERROR_MESSAGE);
            this.badgeNum = "000-A"; // default in case of invalid input
        } else {
            this.badgeNum = badgeNum;
        }
        
        
        
        this.name = name;
        this.hireDate = hireDate;
    }
    
    private boolean isValidBadgeNum(String employeeNum) {
        return employeeNum.matches("\\d{3}-[A-M]");
    }
    
    public String getName(){
        return name;
    }
    
    public String getBadgeNum(){
        return badgeNum;
    }
    
    public String getHireDate(){
        return hireDate;
    }
}
