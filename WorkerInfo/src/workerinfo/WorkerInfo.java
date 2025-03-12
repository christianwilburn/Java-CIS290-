/******************************************************************************************

* Worker Info - M8 In Class Assignment 

* Author: Christian Wilburn 

* Project Purpose: Display production worker info by extending Employee class

* Input: User inputs all employee data

* Desired Output: the production worker info will display in a pop-up

* Variables and Classes: classes - Employee, ProductionWorker, WorkerInfo

* Formulas: none

* Testing: The info that is input by the user is displayed in the production worker info pop-up.

* 11 March 2025 
*************************************************************************************/ 

package workerinfo;
import javax.swing.JOptionPane;

public class WorkerInfo {


    public static void main(String[] args) {
        
       // user input for employee details
        String name = JOptionPane.showInputDialog("Enter Employee Name:");
        String badgeNum = JOptionPane.showInputDialog("Enter Employee Number (Format: XXX-L where L is A-M):");
        String hireDate = JOptionPane.showInputDialog("Enter Hire Date (MM/DD/YYYY):");
        
        // shift input
        int shift = Integer.parseInt(JOptionPane.showInputDialog("Enter Shift (1 for Day, 2 for Night):"));

        // input pay rate input
        double payRate = Double.parseDouble(JOptionPane.showInputDialog("Enter Hourly Pay Rate:"));

        // create ProductionWorker object
        ProductionWorker worker = new ProductionWorker(name, badgeNum, hireDate, shift, payRate);

        // display worker information
        worker.displayWorkerInfo();
    }
}
