/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vk2_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Käyttäjä
 */
public class Mainclass {
    public static void main(String[] args) {
        String input = "";
        String input2 = "";
        int x=0;
    
        System.out.print("Give a name to the dog: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            input = br.readLine();
        } catch (IOException ex) {
            System.out.println("Virhe!");
        }
        
        Dog dog = new Dog(input);
        
        while(x == 0) {  //while main vai dog luokkaan?
        System.out.print("What does a dog say: ");
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            input2 = br2.readLine();
        } catch (IOException ex) {
            System.out.println("Virhe!");
        }
   
        x = dog.speak(input2);
        
        }
       
    }
}
