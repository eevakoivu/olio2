/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vk3_4;

/**
 *
 * @author Käyttäjä
 */
public class Bottle {
        
    //tieto pullon koosta ja hinnasta
    //oletusarvot 0.5 ja 1.8
    // -> get- ja set-metodit?
    
    private String name;
    private String manufacturer;
    private double total_energy;
    private double size;
    private double price;
    
    public Bottle(){ //oletusrakentaja
        name = "Pepsi Max";
        manufacturer = "Pepsi";
        total_energy = 0.3;
        size = 0.5;
        price = 1.8;
    } 
    
    public Bottle(String name, String manuf, float totE){
        
    }
    
    public String getName(){
        return name;
    }
    
    public String getManufacturer(){
        return manufacturer;
    }
    
    public double getEnergy(){
        return total_energy;
    }
    
    public double getPrice(){
        return price;
    }
    
    public double getSize(){
        return size;
    }
}
