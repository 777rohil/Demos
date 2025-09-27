/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.demos12;

import java.util.ArrayList;

/**
 *
 * @author ROHIL
 */
public class Demos12 {

    public static void main(String[] args) {
       /* 18/09/2025 */
       
       // ArrayList = A resizeable array. 
       // Elements can be added and removed after compilations phase
       // To store reference data types 
       
       // Create ArrayList
       ArrayList<String> food = new ArrayList<String>();
       
       // TO ADD TO THE ARRAYLIST TYPE THE NAME OF THE ARRAYLIST DOT ''ADD''
       food.add("Oats");
       food.add("Chicken");
       food.add("Eggs");
       
       // TO REPLACE A STORED VALUE, USE THE NAME OF THE ARRAY LIST DOT ''SET''
       food.set(0, "Nuts");
       
       // TO REMOVE A STORED VALUE, USE THE NAME OF THE ARRAYLIST DOT ''REMOVE''
       food.remove(0);
       
       // TO CLEAR THE ARRAYLIST USE DOT ''CLEAR''
       food.clear();
       
       //  TO DISPLAY THE ARRYLIST USE A FOR LOOP
        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
    }
}
