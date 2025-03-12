/******************************************************************************************

*M4 Code Review

* Author: Christian Wilburn 

* Project Purpose: Program to display Hello World in the console

* Input: user inputs a word and number to complete showChar method

* Desired Output: the character at the chosen position displays with user input number. 

* Variables and Classes: There is one class, with the main method. It uses the JOptionPane method and the showChar method.

* Formulas: the variable input and num are transformed to output and ltr to be displayed in message. 

* Testing: the program will display a prompt for a word and then a number before displaying the results. 

* 28 Jan 2025

********************************************************************************************/ 
package m4codereview;
import javax.swing.JOptionPane;

public class M4CodeReview {

// create showChar method with alpha and digt args
   static void showChar(char alpha, int digt) {
    JOptionPane.showMessageDialog(null, alpha + "- is at position: " + digt);
}

public static void main(String[] args) {
    String input = JOptionPane.showInputDialog(null, "Enter one word please");

    while (true) { // loop to keep asking until valid input is provided
        String num = JOptionPane.showInputDialog(null, "Please enter a number");
        try {
            int letr = Integer.parseInt(num);

            // check if number is within bounds
            if (letr >= 0 && letr < input.length()) {
                char output = input.charAt(letr);
                showChar(output, letr);
                break; // exit loop once a valid number is processed
            } else {
                JOptionPane.showMessageDialog(null,
                        "Please enter a number between 0 and " + (input.length() - 1));
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid numerical value!");
        }
    }
}
}
