/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.demos04;

/**
 *
 * @author ROHIL
 */
public class Demos04  {

    /* 17/08/25 */
    // SWITCHES i.e CASE AND BREAK
    public static void main(String[] args) {
       
        /*
          A SWITCH IS A STATEMENT THAT ALLOWS FOR A VARRIABLE TO BE TESTED FOR EQUALITY AGAINST A LIST OF VALUES
        */
        
        String day = "Pizza";
        
        switch(day){
            case "sunday": System.out.println("It is Sunday");
            break;
            
            case "Monday": System.out.println("It is Monday");
            break;
            
            case "Tuesday": System.out.println("It is Tuesday");
            break;
            
            case "Wednesday": System.out.println("It is Wednesday");
            break;
            
            case "Thursday": System.out.println("It is Thursday");
            break;
            
            case "Friday": System.out.println("It is Friday");
            break;
            
            case "Saturday": System.out.println("It is Saturday");
            break;
            
            default:System.out.println("That is not a day");
        }
    }
}
