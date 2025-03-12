/******************************************************************************************

* Exam One

* Author: christian Wilburn

* Project Purpose: Determine whether a given temp will freeze or boil specified substances

* Input: user inputs temp

* Desired Output: console will display which substances will freeze or boil at given temp

* Variables and Classes: temperature and main class - system out method 

* Formulas: temps are compared to user input value 

* Testing: When the program is run with user input it will display what substances will freeze or boil at the given temp

* 11 February 2025

********************************************************************************************/
package examone;
import java.util.Scanner;

public class ExamOne {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a temperature
        System.out.print("Enter a temperature (in °F): ");
        double inputTemp = scanner.nextDouble();

        // Create a Temperature object 
        Temperature temp = new Temperature(inputTemp);

        System.out.println("\nAt " + inputTemp + "°F:");

        // Check which substances will freeze at the given temperature
        System.out.println("Substances that will freeze:");
        boolean freezesAny = false;
        if (temp.isEthylFreezing()) {
            System.out.println("  Ethyl alcohol (freezes at -173°F or below)");
            freezesAny = true;
        }
        if (temp.isOxygenFreezing()) {
            System.out.println("  Oxygen (freezes at -362°F or below)");
            freezesAny = true;
        }
        if (temp.isWaterFreezing()) {
            System.out.println("  Water (freezes at 32°F or below)");
            freezesAny = true;
        }
        if (!freezesAny) {
            System.out.println("  None");
        }

        // Check which substances will boil at the given temperature
        System.out.println("\nSubstances that will boil:");
        boolean boilsAny = false;
        if (temp.isEthylBoiling()) {
            System.out.println("  Ethyl alcohol (boils at 172°F or above)");
            boilsAny = true;
        }
        if (temp.isOxygenBoiling()) {
            System.out.println("  Oxygen (boils at -306°F or above)");
            boilsAny = true;
        }
        if (temp.isWaterBoiling()) {
            System.out.println("  Water (boils at 212°F or above)");
            boilsAny = true;
        }
        if (!boilsAny) {
            System.out.println("  None");
        }

        scanner.close();
    }
}