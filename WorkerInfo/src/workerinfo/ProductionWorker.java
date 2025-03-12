package workerinfo;
import javax.swing.JOptionPane;

public class ProductionWorker extends Employee {
    private int shift;
    private double payRate;

    public ProductionWorker(String name, String badgeNum, String hireDate, int shift, double payRate) {
        super(name, badgeNum, hireDate);
        
        // shift validation
        if (shift != 1 && shift != 2) {
            JOptionPane.showMessageDialog(null, "Invalid Shift! Enter 1 for Day Shift or 2 for Night Shift.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            this.shift = 1; // default to day shift
        } else {
            this.shift = shift;
        }
        
        this.payRate = payRate;
    }
    
    public int getShift(){
        return shift;
    }
    
    public double getPayRate(){
        return payRate;
    }
    
    // display worker info
    
    public void displayWorkerInfo() {
        String shiftType = (shift == 1) ? "Day Shift" : "Night Shift";
        String message = "Production Worker Details:\n" +
                "Name: " + getName() + "\n" +
                "Employee Number: " + getBadgeNum() + "\n" +
                "Hire Date: " + getHireDate() + "\n" +
                "Shift: " + shiftType + "\n" +
                "Hourly Pay Rate: $" + payRate;
        JOptionPane.showMessageDialog(null, message, "Worker Info", JOptionPane.INFORMATION_MESSAGE);
    }
}