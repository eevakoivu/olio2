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
public class BottleDispenser {
    private int bottles;
    private int money;
    
    // The array for the Bottle-objects
    private Bottle[] bottle_array; //taulukko bottle olioille
    
    
    public BottleDispenser() { //rakentaja
        bottles = 50;
        money = 0;
        
        // Initialize the array
        bottle_array = new Bottle[bottles]; //alustetaan pullojen määrällä
        // Add Bottle-objects to the array
        for(int i = 0;i<bottles;i++) { //alkiot 0-49
            // Use the default constructor to create new Bottles
            bottle_array[i] = new Bottle(); //luodaan oliot indeksiin käyttäen oletusrakentajaa
        }
    }
    
    public void addMoney() {
        money += 1;
        System.out.println("Klink! Added more money!");
    }
    
    public void buyBottle() {
        if(money == 0){
            System.out.println("Add money first!");
        }
        else if(bottles > 0){
        bottles -= 1;
        money -= 1;
        System.out.println("KACHUNK! " + bottle_array[bottles].getName() + " came out of the dispenser!");
        }
    }
    
    public void returnMoney() {
        money = 0;
        System.out.println("Klink klink. Money came out!");
    }
}
