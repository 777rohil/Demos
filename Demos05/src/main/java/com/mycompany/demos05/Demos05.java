/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.demos05;

import java.util.Scanner;

/**
 *
 * @author ROHIL
 */
public class Demos05 {

    public static void main(String[] args) {
        /* 20/08/2025*/
        /*
         LOGICAL OPERATORS ARE USED TO CONNECT TWO OR MORE EXPRESSIONS.
               --> THERE ARE THREE LOGICAL OPERATORS: 1) && = THE AND OPERATOR [BOTH CONDITIONS MUST BE TRUE]
                                                      2) || = THE OR OPERATOR [EITHER CONDITION MUST BE TRUE]
                                                      3) !  = THE NOT OPERATOR [REVERSES BOOLEAN VALUE OF A CONDITION]
        
        */
        
       // 1) && OPERATOR
//         Scanner kb = new Scanner(System.in);
//         int temp = kb.nextInt();
//       
//       if(temp > 30){
//           System.out.println("It is hot outside");
//       }else if(temp >= 20 && temp <= 30){
//           System.out.println("It is warm outside");
//       }else{
//           System.out.println("It is cold outside");
//       }
//       
      
       // 2) || OPERATOR
//      Scanner kb = new Scanner(System.in);
//       
//        System.out.println("You are playing a game! Press q or Q to Quit");
//        String Response = kb.next();
//        
//        if(Response.equals("q") || Response.equals("Q")){
//            System.out.println("You Quit the game");
//        }else{
//            System.out.println("You are still playing the game");
//        }

       // 3) ! OPERATOR
        Scanner kb = new Scanner(System.in);
      
        System.out.println("You are playing a game! Press q or Q to Quit");
        String Response = kb.next();
       
        if(!Response.equals("q") && !Response.equals("Q")){
           System.out.println("You are still playing the game");
        }else{
             System.out.println("You Quit the game");
         }
        
    }
}
