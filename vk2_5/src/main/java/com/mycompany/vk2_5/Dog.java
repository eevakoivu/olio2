/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vk2_5;

import java.util.Scanner;

/**
 *
 * @author Käyttäjä
 */
public class Dog {
    private String name;
    private String sentence;
    
    public Dog (String name) {
 
        this.name = name;
        System.out.println("Hey, my name is " + this.name + "!\n");
        
        
    }
    
    // osaa kertoa onko syöte kokonaisluku vai boolean arvo (usean sanan)
    
    public void speak(String s){
        
        Scanner scanner = new Scanner(s);
        
        while(scanner.hasNext()) {
        if(scanner.hasNextInt()){
            System.out.println("Such integer: " + scanner.next());
        }
        else if(scanner.hasNextBoolean()){
            System.out.println("Such boolean: " + scanner.next());
            
        }
        else{
            System.out.println(scanner.next());
        }
        }
    }
}
