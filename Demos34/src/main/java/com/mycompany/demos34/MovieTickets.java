/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demos34;

/**
 *
 * @author ROHIL
 */
public class MovieTickets implements iMovieTickets{

    @Override
    public int TotalMovieSales(int[] movieTicketSales) {
        int total = 0;
        for(int sales : movieTicketSales){
            total += sales;
        }
        return total;
    }

    @Override
    public String TopMovie(String[] movies, int[] totalSales) {
       
        if(movies.length == 0 || totalSales.length == 0){
            return "No movies available";
        }
        
        int maxIndex = 0;
        for (int i = 0; i < totalSales.length; i++) {
            if (totalSales[i] > totalSales[maxIndex]){
                maxIndex = i;
            }
        }
        return movies[maxIndex];
    }
    
}
