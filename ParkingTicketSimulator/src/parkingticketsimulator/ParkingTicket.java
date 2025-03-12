
package parkingticketsimulator;


public class ParkingTicket {
    
    public void getMake(){
    
    }
    
    public void getModel(){
    
    }
    
    public void getColor(){
    
    }
    
    public void getLicense(){
    
    }
    
    public void getTime(){
    
    }
    
}

    public void printTicket() {
        String ticketMessage = "PARKING TICKET\n" +
                "----------------------------\n" +
                "Car Make: " + carMake + "\n" +
                "Car Model: " + carModel + "\n" +
                "Car Color: " + carColor + "\n" +
                "License Number: " + licenseNumber + "\n" +
                "Fine: $" + fine + "\n" +
                "Issued By: Officer " + officerName + "\n" +
                "Badge Number: " + badgeNumber;

        JOptionPane.showMessageDialog(null, ticketMessage, "Parking Ticket", JOptionPane.INFORMATION_MESSAGE);
    }
}