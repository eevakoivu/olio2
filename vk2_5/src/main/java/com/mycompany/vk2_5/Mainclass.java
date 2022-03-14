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
public class Mainclass {
    public static void main(String[] args) {
        String input = "";
        String input2 = "";
    
        // scanner-luokan avulla (parametrinä myös merkkijono)
        // scanner metodit hasNextInt() ja hasNextBoolean()
        
        
        //while(scanner.hasNext)
        //hasNextInt() -> palauttaa true/false
        //scanner.Next tulostetaan
        
        
        
        System.out.print("Give a name to the dog: ");
        Scanner scan = new Scanner(System.in);
        input = scan.next();
        
        Dog dog = new Dog(input);
    
        System.out.print("What does a dog say: ");
        Scanner scan2 = new Scanner(System.in);
       
        
        dog.speak(scan2.nextLine());

    }
        
}
