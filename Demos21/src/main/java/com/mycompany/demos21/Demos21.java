/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.demos21;



/**
 *
 * @author ROHIL
 */
public class Demos21 {

    public static void main(String[] args) {
        /* 29/09/2025 */
 /* SINGLE AND 2D ARRAYS --> TEST REVISION */

        // CREATE SINGLE  ARRAY
        String[] month = {"January", "February", "March", "April", "May", "June"};

        // CREATE 2D ARRAY
        int[][] jobs = {{8, 2, 5},
        {7, 4, 5},
        {5, 5, 2},
        {2, 2, 3},
        {7, 7, 9},
        {7, 8, 5}};

        // DISPLAY
        System.out.println("*".repeat(21) + "\n" + "HOME MAKEOVER REPORT" + "\n" + "*".repeat(21));
        System.out.printf("%-15s %-10s %-10s %-10s \n", " ", "Bathrooms", "Kitchens", "Garden");

        // CREATE LOOP TO DISPLAY INFORMATION
        for (int i = 0; i < month.length; i++) {
            System.out.printf("%-15s %-10d %-10d %-10d \n", month[i], jobs[i][0], jobs[i][1], jobs[i][2]);
        }

        // DISPLAY THE TOTALS
        System.out.println("\n" + "*".repeat(14) + "\nMONTHLY TOTALS" + "\n" + "*".repeat(14));
        for (int i = 0; i < month.length; i++) {
            int total = jobs[i][0] + jobs[i][1] + jobs[i][2];
            if(total >= 15){
            System.out.printf("%-15s %-10d %-10s \n", month[i], total, "***"); 
            }else
            System.out.printf("%-15s %-10d \n", month[i], total);
        }

    }
}
