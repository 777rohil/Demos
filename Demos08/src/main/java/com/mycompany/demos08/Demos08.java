/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.demos08;

import java.util.Scanner;

/**
 *
 * @author ROHIL
 */
public class Demos08 {

    public static void main(String[] args) {
        /* 20/08/2025 */

 /*
        Nested Loop --> a loop inside a loop
         */
        Scanner kb = new Scanner(System.in);

        int rows;
        int columns;
        String symbol = "";

        System.out.println("ENTER # OF ROWS: ");
        rows = kb.nextInt();
        System.out.println("ENTER # OF COLUMNS: ");
        columns = kb.nextInt();
        System.out.println("ENTER SYMBOL TO USE");
        symbol = kb.next();

        for (int i = 1; i <= rows; i++) {
            System.out.println();

            for (int j = 1; j <= columns; j++) {
                System.out.print(symbol);
            }
        }

    }
}
