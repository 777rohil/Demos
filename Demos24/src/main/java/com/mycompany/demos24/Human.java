/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demos24;

/**
 *
 * @author ROHIL
 */
public class Human {
    
    String name;
    int age;
    double mass;

    public Human(String name, int age, double mass) {
        this.name = name;
        this.age = age;
        this.mass = mass;
    }
    
    void eat(){
        System.out.println( this.name + " is eating");
    }
    
    void drink(){
        System.out.println(this.name + " is drinking * burp! *");
    }
    
}
