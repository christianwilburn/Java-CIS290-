/******************************************************************************************

* Magic 8 Ball

* Author: Christian Wilburn

* Project Purpose: Simulate a magic 8 ball by reading responses from a file and randomizing them
* in response to user input 

* Input: This program accepts inputs from the user in JOptionPane

* Desired Output: The program prompts the user to type a question and generates random output as an 
* answer to their question until they exit the program. 

* Variables and Classes: There is the main class and the response class with multiple variables in each. 

* Formulas: --the variables messageOne and messageTwo are concentrated to 

* Testing: The program should prompt the user for input and generate a response by reading the path 
* for a 8_ball_responses.txt and loops until the user exits the program. 

* 18 February 2025

********************************************************************************************/ 
package magic8ball;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

public class Magic8Ball {
    private ArrayList<String> responses;
    private Random randomGenerator;

    // loads responses from 8_ball_responses.txt.
    public Magic8Ball(String fileName) {
        responses = new ArrayList<>();
        randomGenerator = new Random();
        loadResponses("C:\\Users\\chris\\OneDrive\\Documents\\NetBeansProjects\\Magic8Ball\\src\\magic8ball\\8_ball_responses.txt");
    }

    // read file lines and adds them to responses array list
    private void loadResponses(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    responses.add(line.trim());
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, 
                "Error reading responses file: " + e.getMessage(), 
                "File Error", 
                JOptionPane.ERROR_MESSAGE);
        }
    }

    // return random response from file
    public String getRandomResponse() {
        if (responses.isEmpty()) {
            return "No responses available.";
        }
        int index = randomGenerator.nextInt(responses.size());
        return responses.get(index);
    }
}