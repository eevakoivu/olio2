/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vk2_3;

import java.util.Scanner;

/**
 *
 * @author Käyttäjä
 */
public class Mainclass {
    public static void main(String[] args) {
        String s1 = "";
        String s2 = "";
        
        System.out.print("Give a name to the dog: ");
        //luodaan scan olio
        Scanner scan1 = new Scanner(System.in);
        //skannataan seuraavaan tyhjään merkkiin
        //merkkijono tallessa s:ssä
        s1 = scan1.next();
        
        Dog dog = new Dog(s1);
        
        System.out.print("What does a dog say: ");
        //luodaan scan olio
        Scanner scan2 = new Scanner(System.in);
        //skannataan seuraavaan tyhjään riviin
        //merkkijono tallessa s:ssä
        s2 = scan2.nextLine();
   
        dog.speak(s2);
    }
}
