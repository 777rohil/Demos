/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.demos19;

import java.util.Scanner;

/**
 *
 * @author ROHIL
 */
public class Demos19 {

    public static void main(String[] args) {
        /* 27/09/2025 */
 /* PRACTISE FOR TEST --> ICE TASK TWO */

 /*   
            DEVELOP A JAVA APPLICATION WITH THE PURPOSE OF RECORDING AND DISPLAYING 
            ROAD ACCIDENTS FOR CARS AND MOTORBIKES IN DIFFERENT CITIES. THE APPLICATION 
            WILL PROMPT THE USER TO INPUT CAR AND BIKE ACCIDENTS IN A SPECIFIC CITY AND THEN
            DISPLAY THE TOTAL NUMBER OF RECORDED ROAD ACCIDENTS THAT OCCURED IN THREE
            DIFFERENT CITIES.
            THE RESULTING REPORT WILL SHOW ROAD ACCIDENTS FOR CARS AND MOTORBIKES, ALONG
            WITH THE TOWN AND THE NUMBER OF ACCIDENTS FOR EACH VEHICLE TYPE.
 */
       
          // CREATE SCANNER OBJECT
          Scanner kb = new Scanner(System.in);
          
          // CREATE SINGLE ARRAY FOR THE SET CITIES
          String[] City = {"Cape Town", "Johannesburg", "Port Elizebeth"};
          
          // CREATE 2D ARRAY TO STORE NUMBER OF ACCIDENTS
          int [] [] accidentReport = new int [3][2];
          
          // PROMPT THE USER FOR DATA FOR THE ARRAYS
          for (int i = 0; i < City.length; i++) {
              System.out.print(" Enter the number of car accidents for " + City[i] + " : ");
               accidentReport [i][0] = kb.nextInt();
               
               System.out.print("Enter the number of motorbike accidents for " + City[i] + " : ");
               accidentReport [i][1] = kb.nextInt();
        }
          
          // DISPLAY YOUR REPORT
          System.out.println("*".repeat(27) + "\n" + "ACCIDENT REPORT" + "\n" + "*".repeat(27) + "\n");
          System.out.printf("%-15s %-10s %-10s \n" , "" ,"Car" , "Motor Bike" );
          
          // CREATE A FOR LOOP TO DISPLAY THE INFORMATION
          for (int i = 0; i < City.length; i++) {
              System.out.printf("%-15s %-10d %-10d  \n" ,City[i] , accidentReport[i][0] , accidentReport[i][1]);
        }
          
          // DISPLAY THE TOTALS
          String mostCity = "";
          int mostTotal = 0;
          
          System.out.println("\n" + "*".repeat(35) + "\n" + "ROAD ACCIDENT TOTALS FOR EACH CITY" + "\n" + "*".repeat(35));
          for (int i = 0; i < City.length; i++) {
            int total = accidentReport[i][0] + accidentReport[i][1];
              System.out.printf("%-15s %-10s \n", City[i], total );
              
              if(total > mostTotal){
                  mostTotal = total;
                  mostCity = City[i];
              }
        }
          
          // DISPLAY THE CITY WITH MOST ACCIDENTS
          System.out.println("\n City with the most vehicle accidents: " + mostCity);
          
    }
}
