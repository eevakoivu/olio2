/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vk3_2;

/**
 *
 * @author Käyttäjä
 */
public class Bottle {
    private String name;
    private String manufacturer;
    private double total_energy;
    
    public Bottle(){ //oletusrakentaja, miksi tarvitaan toinen rakentaja
        this.name = "Pepsi Max";
        this.manufacturer = "Pepsi";
        this.total_energy = 0.3;
    } 
    
    public Bottle(String name, String manuf, float totE){ //tässä määritellään tiedot
        
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getManufacturer(){
        return this.manufacturer;
    }
    
    public double getEnergy(){
        return this.total_energy;
    }
}
