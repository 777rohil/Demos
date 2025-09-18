/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.demos03;

/**
 *
 * @author ROHIL
 */
public class Demos03 {

    public static void main(String[] args) {
        /*
        Create a simple two-dimensional Array
        */
        
        // 31/07 Class revision
        
        int [] []  studentResults = {{20, 15, 30},
                                    {35, 56, 45},
                                    {50, 45, 98}};
    
                                  
      System.out.println("student one" + studentResults[0][0]);
      
        System.out.println("\nStudent Results: ");
        
        for (int i = 0; i < studentResults.length; i++) {
             System.out.println("Results for student" + (i + 1) + ": ");
             
              
              
             for (int j = 0; j < studentResults.length; j++) {
                 System.out.println("results" + studentResults[i][j]);
                
            }System.out.println();
            
        }
    }
}
