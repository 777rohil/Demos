/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.demos01;

import java.util.Scanner;

/**
 *
 * @author ROHIL
 */
public class Demos01 {
//Practise Exercise 30/07 Decision Structures using if statements 
    
    public static void main(String[] args) {
        //Relational operaters --> Checks the relationship between two things
      //  <  Less Than
      //  >  Greater than
      // <=  Less than equal to
      // >=  Greater Than equal to
      // = Equal to
      // != Not Eqaul to
        
      //Average Test Score
      //Congratulate the user if they achieved a high mark
       
      double Score1, Score2, Score3, average;
      
      //Create Scanner Keyboard
      Scanner kb = new Scanner(System.in);
        System.out.println("This Program Will Average 3 Test Scores");
      
         // Get three test scores
        System.out.println("Enter Test1: ");
        Score1 = kb.nextDouble();
        System.out.println("Enter Test2: ");
        Score2 = kb.nextDouble();
        System.out.println("Enter Test3: ");
        Score3 = kb.nextDouble();
        //Calculate the average
        average = (Score1 + Score2 + Score3)/3.0;
        System.out.println("The average Score Is: " + average);
        
        //If the Average is higher than 80, congratulate them
        if(average >= 80){ // By adding the curly brace you allowed to comment more than once
            System.out.println("Comment: ");
            System.out.println("Well Done");
        }else
            System.out.println("not well done");
        
        
        
    }
}
