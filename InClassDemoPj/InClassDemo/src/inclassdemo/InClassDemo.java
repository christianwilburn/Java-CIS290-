
package inclassdemo;

//******************************************************************************************

/* In Class Demo

//* Author: Christian Wilburn

//* Project Purpose: Program to dsplay name and school information

//* Input: This program does not accept inputs

//* Desired Output: Student name, school, and message

//* Variables and Classes: There is one class, with the main method. It uses the System.out.println method.

//* Formulas: Concatenate a message 

//* Testing: When the program is run, it outputs Christian Wilburn, I am a student at Schoolcrafte College, Go Ocelots.

//* 7 January 2025
//******************************************************************************************************************/ 

public class InClassDemo {

    public static void main(String[] args) {
        
        String name = "Christian WIlburn";
        String school = "schoolcraft College";
        String message = "Go Ocelots"; 
        String divider = "************************";
        
        System.out.println(divider);
        System.out.println(name);
        System.out.println("I am a student at "+school);
        System.out.println(message);
        System.out.println(divider);
    }
    
}
