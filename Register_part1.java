/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.register_part1;
import javax.swing.*;
/**
 *
 * @author RC_Student_lab
 */
public class Register_part1 {  public String Username;
    public String Password;
    public String cellphone;
    public String Name;
    public String Surname;
   
   
    // Check username if has an underscore
    public void CheckUsername() {
        boolean hasUnderscore = Username.contains("_");

        if (hasUnderscore && Username.length() <= 5) {
            JOptionPane.showMessageDialog(null, "Username successfully captured");
        } else {
            JOptionPane.showMessageDialog(null, "Username is incorrectly formatted. Please ensure that your username contains : \n san underscore \n and is no more than five characters in length.");
            Username = JOptionPane.showInputDialog("Enter Username");
            CheckUsername();
        }
    }

    // Check password
    public boolean checkPassword(String password) {
        if (password.length() < 8) {
            JOptionPane.showMessageDialog(null, "Password must be at least 8 characters long.");
            return false;
        }

        boolean hasUppercase = false, hasDigit = false, hasSpecialChar = false;
        String specialChars = "~'!@#$%^&*()_+=<>?/{}[];:'\",.";

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) hasUppercase = true;
            if (Character.isDigit(ch)) hasDigit = true;
            if (specialChars.contains(String.valueOf(ch))) hasSpecialChar = true;
        }

        if (hasUppercase && hasDigit && hasSpecialChar) {
            JOptionPane.showMessageDialog(null, "Password is valid.");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Password must contain at least one uppercase letter, one digit, and one special character.");
            return false;
        }
    }

    // Register user
    public void RegisterUser() {
        // Username
        Username = JOptionPane.showInputDialog("Enter Username");
        CheckUsername();

       
        do {
            Password = JOptionPane.showInputDialog("Enter Password");
        } while (!checkPassword(Password));

        // Cellphone10 digits
        boolean validCellphone;
        do {
            cellphone = JOptionPane.showInputDialog("Enter Cellphone Number (10 digits):");
            validCellphone = cellphone.matches("\\d{10}"); // Checks for exactly 10 digits
            if (!validCellphone) {
                JOptionPane.showMessageDialog(null, "Invalid cellphone number. Please enter 10 digits.");
            }
        } while (!validCellphone);

        JOptionPane.showMessageDialog(null, "Registration successful!");
    }

    public static void main(String[] args) {
        Register_part1  userRegistration = new Register_part1 ();
        userRegistration.RegisterUser();
        Login login=new Login();
    Register_part1 user = null;
        login.loginUser(user);
    }
}


   


