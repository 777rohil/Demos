/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.demos29;

import java.util.Scanner;

/**
 *
 * @author ROHIL
 */
public class Demos29 {
    
     // Create Scanner Object
       static Scanner kb = new Scanner(System.in);
        
    public static void main(String[] args) {
        /* 04/11/2025 */
        
        /* Banking Program */
        
       
        
        // Declare Varriables
         double balance = 0;
        boolean isRunning = true;
        int choice;
        
        while(isRunning){
            
        // Display Menu
        System.out.println("*".repeat(15) + "\nBANKING PROGRAM" + "\n" +"*".repeat(15));
        System.out.println("1. Show balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("*".repeat(15));
        
        // Get and Process Users Choice
        System.out.print("Enter your choice (1 - 4): ");
        choice = kb.nextInt();
        
        // Create switch
        switch(choice){
            case 1: showBalance(balance);
            break;
            case 2: balance += deposit();                                                       // balance = balance + deposit()
            break;
            case 3: balance -= withdraw(balance);                                          // balance = balance - withdraw()
            break;
            case 4: isRunning = false;
            break;
            default: System.out.println("Invalid Choice");
            }
        }
        
        // Exit Message
        System.out.println("*".repeat(29) + "\nThank You For Using TrustBank" + "\n" + "*".repeat(29));
        
        // Close Scanner Object
        kb.close();
    }
    
    // showBalance()
    static void showBalance(double balance){
        System.out.printf("$" + balance + "\n");
    }
    
     // Deposit()
    static double deposit(){
        double amount;
        
        System.out.print("Enter an amount to be deposited: ");
        amount = kb.nextDouble();
        
        if(amount < 0){
            System.out.println("Amount cant be zero");
        }else{
            return amount;
        }
        return 0;
        
    }
    
    static double withdraw(double balance){
        
        double amount;
        
        System.out.print("Enter amount you wish to withdraw: ");
        amount = kb.nextDouble();
        
        if(amount > balance){
            System.out.println("Insufficient funds");
            return 0;
            
        }else if(amount < 0){
            System.out.println("Amount cant be negetive");
            return 0;
            
        }else{
            return amount;
        }
        
       
    }
}
