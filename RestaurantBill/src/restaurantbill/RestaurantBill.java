/******************************************************************************************

* In Class Assignment Module 2

* Author: Christian Wilburn

* Project Purpose: Program to calculate the tax and tip on a bill

* Input: This program does not accept inputs

* Desired Output: The total amount of the bill including tax and tip should display as the output. 

* Variables and Classes: There is one class, with the main method. There are multiple variable including tax, tip, mealCharge and totalBill. 

* Formulas: totals are calculated based on user input as well as preset values.  

* Testing: When the program is run without errors, it should correctly calculate the amount of tax on the bill plus 20% tip.

* 14 January 2025

*********************************************************************************************/ 
package restaurantbill;
import java.util.Scanner;

public class RestaurantBill {
    
    public static void main (String [] args) {
        
       Scanner bill = new Scanner(System.in);
        
       double mealCharge = 0.0;
       double tax = .065;
       double tip = .2;
       double totalBill = 0.0;

       //User input for meal price 
       
        System.out.println("What is the price of your meal?");
        mealCharge = bill.nextDouble();
        
        // Calculate and display tax
        
        tax *= mealCharge;
        mealCharge += tax;
        
        System.out.println("Your tax is $"+tax);
        
        //Calculate and display tip
        
        tip *= mealCharge;
        
        System.out.println("Your tip amount is $"+tip);
        
        // Calculate and display total 
        
        totalBill = mealCharge += tip;
        
        System.out.println("Your total including tax and tip is $"+totalBill);
       
        bill.close();
        
       
    }
}