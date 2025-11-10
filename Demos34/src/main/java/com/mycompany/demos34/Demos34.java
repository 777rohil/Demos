/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.demos34;

/**
 *
 * @author ROHIL
 */
public class Demos34 {

    public static void main(String[] args) {
        /* 09/11/2025 */
        
         /* PROG6112 PAST PAPER 2024 */
         /* Question One */
         
         // DECLARE AND POPULATE THE ARRAYS
         String[] movieNames = {"Napolean", "Openheimer"};
         
         // TWO-DIMENSIONAL ARRAYS FOR MONTHLYSALES
         //[movie][month] where: 0=Jan, 1 =Feb. 3=Mar
         int[][] monthlySales = {
             {3000, 1500, 1700},
             {3500, 1200, 1600}
         };
         
         String[] months ={"JAN", "FEB", "MAR"};
         
         // CREATE MOVIE TICKET INSTANCE
         MovieTickets movieTickets = new MovieTickets();
         
         //CALCULATE THE TOTAL SALES FOR EACH MOVIE
         int[] totalSalesPerMovie = new int[movieNames.length];
         for (int i = 0; i < movieNames.length; i++) {
            totalSalesPerMovie[i] = movieTickets.TotalMovieSales(monthlySales[i]);
        }
         
         // DISPLAY THE REPORT
         displayMovieReport(movieNames, months, monthlySales, totalSalesPerMovie, movieTickets);
    }

    private static void displayMovieReport(String[] movieNames, String[] months, int[][] monthlySales, int[] totalSalesPerMovie, MovieTickets movieTickets) {
        
        //PRINT HEADER
        System.out.println("--MOVIE TICKET SALES REPORT - 2024 \n");
        
        //PRINT COLUMN HEADERS
        System.out.printf("%-12s", "");
        for(String month : months){
            System.out.printf("%-8s", month);
        }
        System.out.println();
        
        //PRINT SEPERATORS
        System.out.println("-".repeat(10));
        for (int i = 0; i < months.length; i++) {
            System.out.println("-".repeat(10));
        }
         System.out.println();
         
        // PRINT ROWS WITH MOVIE DATA SALES
        for (int i = 0; i < movieNames.length; i++) {
            System.out.printf("%-12s", movieNames[i]);
            for (int j = 0; j < months.length; j++) {
                System.out.printf("%-8s", monthlySales[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        
        //PRINT TOTALS FOR EACH MOVIE
        for (int i = 0; i < movieNames.length; i++) {
            System.out.printf("Total movie ticket sales for %s: %d%n", movieNames[i], totalSalesPerMovie[i]);
        }
        
        //PRINT TOP PERFORMING MOVIE
        String topMovie = movieTickets.TopMovie(movieNames, totalSalesPerMovie);
        System.out.println("\nTop performing movie: " + topMovie);
    }
}
