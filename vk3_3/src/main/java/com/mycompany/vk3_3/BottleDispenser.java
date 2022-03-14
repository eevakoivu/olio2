/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vk3_3;

/**
 *
 * @author Käyttäjä
 */
public class BottleDispenser {
    private int bottles;
    private int money;
    
    // The array for the Bottle-objects
    private Bottle[] bottle_array; //taulukko bottle olioille
    
    
    public BottleDispenser() { //rakentaja
        bottles = 50;
        money = 0;
        
        // Initialize the array
        bottle_array = new Bottle[bottles];
        // Add Bottle-objects to the array
        for(int i = 0;i<bottles;i++) { //indeksit 0-49
            // Use the default constructor to create new Bottles
            bottle_array[i] = new Bottle();
        }
    }
    
    public void addMoney() {
        money += 1;
        System.out.println("Klink! Added more money!");
    }
    
    // vertaa pullon hintaa ja rahamäärää
 
    public void buyBottle() {

        if(money < bottle_array[bottles-1].getPrice()){ //viitataan indeksiin 49
            System.out.println("Add money first!");
        }
        else if(bottles > 0){
        bottles -= 1;
        money -= bottle_array[bottles].getPrice(); //viitataan indeksiin 49
        System.out.println("KACHUNK! " + bottle_array[bottles].getName() + " came out of the dispenser!");
        }
    }
    
    public void returnMoney() {
        money = 0;
        System.out.println("Klink klink. Money came out!");
    }
}
