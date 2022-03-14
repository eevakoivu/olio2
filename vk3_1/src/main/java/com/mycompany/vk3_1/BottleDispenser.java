/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vk3_1;

/**
 *
 * @author Käyttäjä
 */
public class BottleDispenser {
    private int bottles;
    private int money;
    
    public BottleDispenser() { //Rakentaja
        bottles = 5;
        money = 0;
    }
    
    public void addMoney() {
        money += 1;
        System.out.println("Klink! Added more money!");
    }
    
    // pullojen määrä ei voi olla negatiivinen
    // rahatta ei voi ostaa
    public void buyBottle() {
        if(money == 0){
            System.out.println("Add money first!");
        }
        else if(bottles > 0){
        bottles -= 1;
        money -= 1;
        System.out.println("KACHUNK! A bottle came out of the dispenser!");
        }
    }
    
    public void returnMoney() {
        money = 0;
        System.out.println("Klink klink. Money came out!");
    }

    
}
