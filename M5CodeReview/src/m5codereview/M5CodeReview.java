 /******************************************************************************************

* M5 Code Review 

* Author: Christian Wilburn

* Project Purpose: Calculate the average of user input test scores using TestScores class

* Input: User inputs 3 different test scores

* Desired Output: JOptionPane will display the calculated value of the test scores

* Variables and Classes: There are two classes , with the main method and the TestScores method 

* Formulas: each of the 3 user input score are held in their own variable.  

* Testing: when the user inputs the scores, it should validate format ant type of input and then calculate the average 

* 4 February 2025

********************************************************************************************/ 
package m5codereview;
import javax.swing.JOptionPane;

public class M5CodeReview {


    public static void main(String[] args) {
        
        TestScores test = new TestScores();
        
        //validate score one
        while (true) {
        String input1 = JOptionPane.showInputDialog(null, "Enter First Score");
        
            try {
            int scrOne = Integer.parseInt(input1);
            
            if (scrOne>=0 && scrOne<=100){
            test.setScoreOne(scrOne);
            break;
            }
            else{
            JOptionPane.showMessageDialog(null,
                        "Please enter a number between 0 and 100");
            }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"Please enter a number");
            }
        }
        
       //validate score two 
        while (true) {
        String input2 = JOptionPane.showInputDialog(null, "Enter Second Score");
        
            try {
           int scrTwo = Integer.parseInt(input2);

            if (scrTwo>=0 && scrTwo<=100){
            test.setScoreTwo(scrTwo);
            break;
            }
            else{
            JOptionPane.showMessageDialog(null,
                        "Please enter a number between 0 and 100");
            }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"Please enter a number");
            }
        }        

        // validate score three
        while (true) {
        String input3 = JOptionPane.showInputDialog(null, "Enter Third Score");
        
            try {
           int scrThree = Integer.parseInt(input3);
            
            if (scrThree>=0 && scrThree<=100){
            test.setScoreThree(scrThree);
            break;
            }
            else{
            JOptionPane.showMessageDialog(null,
                        "Please enter a number between 0 and 100");
            }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"Please enter a number");
            }
        }
        
        JOptionPane.showMessageDialog(null,test.getAverage());
 
    }
    
}
