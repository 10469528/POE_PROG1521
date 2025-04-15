/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.register_part1;
import javax.swing.*;

/**
 *
 * @author RC_Student_lab
 */

public class Login {


    // Method to handle user login by verifying details
   
    public void loginUser(Register_part1 registeredUser) {
        // Prompt user to enter their username for login
        String inputUsername = JOptionPane.showInputDialog("Login - Enter your username");

        // Prompt user to enter their password for login
        String inputPassword = JOptionPane.showInputDialog("Enter - Enter your password");

        // Check if entered username and password match the registered user's credentials
        if (inputUsername.equals(registeredUser.Username) &&
            inputPassword.equals(registeredUser.Password)) {

            // If login is successful, display a personalized welcome message
            JOptionPane.showMessageDialog(null,
                "Welcome " + registeredUser.Name + ", " + registeredUser.Surname +
                ", it is great to see you again.");
        } else {
            // If login fails, show an error message
            JOptionPane.showMessageDialog(null,
                "Username or password incorrect, please try again.");
            
            
        }  
    }
          
}   
          
           
            

    

        
        
    
                
            
        
    

