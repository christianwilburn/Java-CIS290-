/******************************************************************************************

* Ships: M8 Code Review

* Author: Christian Wilburn

* Project Purpose: Use inheritance to create different types of ship classes

* Input: This program does not accept inputs

* Desired Output: The ship info for each ship will display in a pop-up

* Variables and Classes: Classes- Ship, ChruiseShip, CargoShip, Sail

* Formulas: none

* Testing: The ship info for each ship will display in a pop-up

* 11 March 2025

********************************************************************************************/ 
package sail;
import javax.swing.JOptionPane;

public class Sail {

    public static void main(String[] args) {
        //  array of Ship objects
        Ship[] ships = new Ship[3];

        // populate array with different ship types
        ships[0] = new Ship("Claster Mass", "1980");
        ships[1] = new CruiseShip("Trouty & Rowdy", "2002", 6780);
        ships[2] = new CargoShip("High Seas Fiesta", "2020", 200000);

        // display info about each ship
        StringBuilder message = new StringBuilder("Ship Information:\n\n");
        for (Ship ship : ships) {
            message.append(ship.toString()).append("\n\n");
        }

        JOptionPane.showMessageDialog(null, message.toString(), "Ship Details", JOptionPane.INFORMATION_MESSAGE);
    }
}
