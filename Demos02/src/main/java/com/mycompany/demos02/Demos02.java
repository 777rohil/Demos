/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.demos02;

import javax.swing.JOptionPane;

/**
 *
 * @author ROHIL
 */
public class Demos02 {

    public static void main(String[] args) {
        //Nested if Statements using JOptionPane
        
        //Ask the user for their test score 
        int testScore; // Number
        String input; // To hold the users input
        
        //Input the numeric test Score
        input = JOptionPane.showInputDialog("Enter Your Test score: ");
        testScore = Integer.parseInt(input);
        
        //Display the Grade (Option One: Messy)
        /*
        
        if(testScore < 50){
            JOptionPane.showMessageDialog(null, "You Failed");
        }else{
           if(testScore < 75){
               JOptionPane.showMessageDialog(null, "You Passed");
           } else{
               if(testScore >= 75){
                   JOptionPane.showMessageDialog(null, "You Passed With A distinction");
               }
           }
        }
        */
        
        //Display The Grade (Option Two: Neat)
        if(testScore < 50){
        JOptionPane.showMessageDialog(null, "You Failed");
        }else if(testScore < 75){
        JOptionPane.showMessageDialog(null, "You Passed");
        } else if (testScore >= 75){
        JOptionPane.showMessageDialog(null, "You Passed With A distinction");
               }
        
        
           }
        }
    

