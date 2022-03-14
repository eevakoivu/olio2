/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vk2_3;

/**
 *
 * @author Käyttäjä
 */
public class Dog {
   private String name;
    
    //koiran nimi tallennetaan name muuttujaan this avulla
    public Dog (String name) {
        this.name = name;
        System.out.println("Hey, my name is " + name + "!");
    }
    
    
    
    //koira ilmoittaa nimensä ennen ääntelyä
    public void speak(String s){
        System.out.println(this.name + ": " + s);
    } 
}
