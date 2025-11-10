/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demos20;

/**
 *
 * @author ROHIL
 */
public class RoadAccidentReport extends RoadAccidents {

    // CREATE CONSTRUCTORS
    public RoadAccidentReport(String vehicleType, String city, int NumberOfAccidents) {
        super(vehicleType, city, NumberOfAccidents);
    }

      // CREATE A PRINT METHOD
    public void printAccidentReport(){
        System.out.println("\nVEHICLE ACCIDENT REPORT" + "\n" + "*".repeat(13));
        System.out.println("VEHICLE TYPE: " + getVehicleType());
        System.out.println("CITY: " + getCity());
        System.out.println("ACCIDENT TOTAL: " + getNumberOfAccidents());
        System.out.println("*".repeat(13));
    }
    
    // ADD ALL NOTATATIONS
    @Override
    public String getAccidentVehicleType() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public int getAccidentTotal() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
