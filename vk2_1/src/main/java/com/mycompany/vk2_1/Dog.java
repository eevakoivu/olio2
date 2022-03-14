/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vk2_1;

/**
 *
 * @author Käyttäjä
 */

// rakentaja ottaa sisään koiran nimen ja tulostaa “"Hei, nimeni on <koiran nimi>!”
// puhumismetodi ottaa sisään lausahduksen, jonka koira sanoo
public class Dog {
    private String name;
    
    public Dog (String n) {
        name = n;
        System.out.println("Hey, my name is " + n + "!");
    }
    
    public void speak(String s){
        System.out.println(s);
    }
}
