/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demos20;

/**
 *
 * @author ROHIL
 */
public abstract class RoadAccidents implements IRoadAccidents {
    
    // CREATE DATA FIELDS
   public String vehicleType;
   public  String city;
   public int NumberOfAccidents;

   // CREATE CONSTRUCTORS
    public RoadAccidents(String vehicleType, String city, int NumberOfAccidents) {
        this.vehicleType = vehicleType;
        this.city = city;
        this.NumberOfAccidents = NumberOfAccidents;
    }
   
    // CREATE GET METHODS

    public String getVehicleType() {
        return vehicleType;
    }

    public String getCity() {
        return city;
    }

    public int getNumberOfAccidents() {
        return NumberOfAccidents;
    }
    
   
}
