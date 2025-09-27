/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.demos13;

import java.util.ArrayList;

/**
 *
 * @author ROHIL
 */
public class Demos13 {

    public static void main(String[] args) {
        /* 18/09/2025 */
        
        // 2D ArrayLists
        ArrayList<ArrayList<String>> Rohil = new ArrayList();
        
        
        
        ArrayList<String> bakery = new ArrayList<String>();
        
        bakery.add("Pancakes");
        bakery.add("Milk Tart");
        bakery.add("Cookies");
        
        
        ArrayList<String> peace = new ArrayList<String>();
        
        peace.add("Love");
        peace.add("Money");
        peace.add("Exercise");
        
        ArrayList<String> colours = new ArrayList<String>();
        
        colours.add("Blue");
        colours.add("Yellow");
        
        // MUST BE PLACED AT THE END OF THE ARRAYLIST
        Rohil.add(bakery);
        Rohil.add(peace);
        Rohil.add(colours);
        
        
        // TO DISPLAY THE ARRAY
        for (int i = 0; i < Rohil.size(); i++) {
            System.out.println(Rohil.get(i));
        }
        
        //TO DISPLAY A SPECIFIC INDEX --> DOT GET (# INDEX ) -->  System.out.println(bakery.get(0));
       
    }
}
