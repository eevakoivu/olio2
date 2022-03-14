/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vk2_4;

/**
 *
 * @author Käyttäjä
 */


public class Dog {
    private String name;
    private String sentence;
    private int x=0;
    
    
    //trim() poistaa välilyönnit
    //isEmpty() onko input tyhjä
    //jos RAKENTAJAAN annettu koiran nimi on tyhjä (välilyönnit myös) -> Doge
    //oletuslausahdus says-muuttujaan "Much wow!"
    //tarkistetaan merkkijonon (nimen) sisältö
    public Dog (String name) {
 
        if(name.trim().isEmpty()) {
            this.name = "Doge";
        }
        else {
            this.name = name;
        }
        
        System.out.println("Hey, my name is " + this.name + "!");
        
        this.sentence = "Much wow!";
    }
    
    
    
    //tarkastetaan lausahduksen sisältö
    //tyhjä -> tulostetaan oletuslausahdus -> kysytään uusdestaan
    public int speak(String s){
        
        if(s.trim().isEmpty()) {
            System.out.println(this.name + ": " + this.sentence);
            x=0;
        }
        else {
            System.out.println(this.name + ": " + s);
            x=1;
        }
        
        return x;
    }
}
