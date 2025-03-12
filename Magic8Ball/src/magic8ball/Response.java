
package magic8ball;
import javax.swing.JOptionPane;

public class Response {
    public static void main(String[] args) {
        // create Magic8Ball object with file path
        
        Magic8Ball magicBall = new Magic8Ball("C:\\Users\\chris\\OneDrive\\Documents\\NetBeansProjects\\Magic8Ball\\src\\magic8ball\\8_ball_responses.txt");

        // display welcome message 
        JOptionPane.showMessageDialog(null, 
                "Welcome to the Magic 8 Ball!\nAsk a yes or no question, or type 'quit' to exit.",
                "Magic 8 Ball", 
                JOptionPane.INFORMATION_MESSAGE);

        // continue prompting for questions until quit
        while (true) {
            // user input 
            String question = JOptionPane.showInputDialog(null, 
                    "Your question:", 
                    "Magic 8 Ball", 
                    JOptionPane.QUESTION_MESSAGE);

            // if user types "quit", exit loop
            if (question == null || question.equalsIgnoreCase("quit")) {
                JOptionPane.showMessageDialog(null, 
                        "Goodbye!", 
                        "Magic 8 Ball", 
                        JOptionPane.INFORMATION_MESSAGE);
                break;
            }

        
            // display random response .
           JOptionPane.showMessageDialog(null, 
                    "Magic 8 Ball says: " + magicBall.getRandomResponse(), 
                    "Magic 8 Ball", 
                    JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
}
