/******************************************************************************************

*Conversion Program

* Author: Christian Wilburn

* Project Purpose: convert user input to different units of measurement 

* Input: user will input a distance and choose how to have it converted. 

* Desired Output: calculated result will display 

* Variables and Classes: There is one class, with the main method. it uses mny different variables as well as
* the println method

* Formulas: the program calculates the conversion based on user input

* Testing: when run, the program should prompt for user input and choice of unit then calculate conversion. 

* 28 January 2025

*******************************************************************************************/ 
package conversionprogram;


import java.util.Scanner;

public class ConversionProgram {

    public static void menu() {
        System.out.println("\nMenu:");
        System.out.println("1. Convert to kilometers");
        System.out.println("2. Convert to inches");
        System.out.println("3. Convert to feet");
        System.out.println("4. Quit the program");
    }

    public static void showKilometers(double meters) {
        double kilometers = meters * 0.001;
        System.out.printf("%.2f meters is %.2f kilometers.%n", meters, kilometers);
    }

    public static void showInches(double meters) {
        double inches = meters * 39.37;
        System.out.printf("%.2f meters is %.2f inches.%n", meters, inches);
    }

    public static void showFeet(double meters) {
        double feet = meters * 3.281;
        System.out.printf("%.2f meters is %.2f feet.%n", meters, feet);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double meters;
        while (true) {
            System.out.print("Enter a distance in meters: ");
            meters = scanner.nextDouble();
            if (meters >= 0) {
                break;
            } else {
                System.out.println("Distance cannot be negative. Please try again.");
            }
        }

        int choice;
        do {
            menu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    showKilometers(meters);
                    break;
                case 2:
                    showInches(meters);
                    break;
                case 3:
                    showFeet(meters);
                    break;
                case 4:
                    System.out.println("Quitting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        } while (choice != 4);

        scanner.close();
    }
}