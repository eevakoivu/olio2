/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vk3_4;

import java.util.ArrayList;

/**
 *
 * @author Käyttäjä
 */
public class BottleDispenser {
    private int bottles;
    private int money;
    
    ArrayList<Bottle> list = new ArrayList<Bottle>(); //luodaan ArrayList bottle tietotyypistä
 
    //pulloautomaatti käyttämään ArrayListiä
    
    public BottleDispenser() { //rakentaja
        bottles = 5; //5 pulloa
        money = 0;
        
        for(int i = 0;i<bottles;i++) { //indeksit 0-4
     
            list.add(new Bottle()); //lisätään listaan oliot
            
        }

    }
    
    public void addMoney() {
        money += 1;
        System.out.println("Klink! Added more money!");
    }
    
    //metodi poistaa pullon Arraylististä
    
    public void buyBottle() {

        if(money < list.get(bottles-1).getPrice()){ //indeksi 4
            System.out.println("Add money first!");
        }
        else if(bottles > 0){
        bottles -= 1; //muuttuu indeksi 4
        money -= list.get(bottles).getPrice(); //indeksi 4
        System.out.println("KACHUNK! " + list.get(bottles).getName() + " came out of the dispenser!"); //indeksi 4
        removeObject();
        }
    }
    
    public void returnMoney() {
        money = 0;
        System.out.println("Klink klink. Money came out!");
    }
    
    public void removeObject(){
        list.remove(bottles); //indeksi 4
        
    }
    
    public void listBottles(){
        
        for(int i = 0;i<bottles;i++) {
     
            System.out.println(i+1 + ". Name: " + list.get(i).getName()); //viittaaminen olioon!
            System.out.println("\tSize: " + list.get(i).getSize() + "\tPrice: " + list.get(i).getPrice());
            
        }
        
    }
}
