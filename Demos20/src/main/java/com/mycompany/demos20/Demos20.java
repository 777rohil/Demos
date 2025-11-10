/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.demos20;

import java.util.Scanner;

/**
 *
 * @author ROHIL
 */
public class Demos20 {

    public static void main(String[] args) {
          /* 28/09/2025 */
          
          /* ICE TASK FOUR --> TEST REVISION */
          
          // CREATE SCANNER METHOD
          Scanner kb = new Scanner(System.in);
          
          System.out.print("Enter the accident vehicle type: ");
          String vehicleType = kb.nextLine();
          
          System.out.print("Enter the city for the vehicle accidents: ");
          String city = kb.nextLine();
          
          System.out.print("Enter the total " + vehicleType + " accidents for " + city + ": ");
          int NumberOfAccidents = kb.nextInt();
          
          RoadAccidentReport report = new RoadAccidentReport(vehicleType, city, NumberOfAccidents);
          report.printAccidentReport();
          kb.close();
    }
}
