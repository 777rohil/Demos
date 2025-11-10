/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.demos28;


import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author ROHIL
 */
public class Demos28 {

    public static void main(String[] args) throws IOException {
        /* 04/11/2025 */
        
        /* How to write a file using java: 
                       1. FileWriter = Good for smaal to medium sized text files
                       2. BufferedWriter = Better performance for large amount of texts
                       3. PrintWriter = Best for structured data, like reports or logs
                       4. FileOutputStream = Best for binary files (e.g. images, audio files)
        */
        
        
        String filePath = "C:\\Users\\ROHIL\\Desktop\\ test.txt";
        String textContent = """
                             To write multi line of code for strings,
                             you will need to use three sets of parenthesis
                             in order for the program to execute flawlessly
                             """;
        
        try(FileWriter writer = new FileWriter(filePath);){
            writer.write(textContent);
            System.out.println("File has been written");
        }
        
           catch(FileNotFoundException e){
            System.out.println("Could not locate file location");
        }
        
        catch(IOException e){
            System.out.println("Could not write file");
        }
        
     
    }
}
