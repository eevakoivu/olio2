/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vk5_5;

import java.util.Scanner;

/**
 *
 * @author Käyttäjä
 */
public class Mainclass {
    public static void main(String[] args){
        int choice;
        int choice1;
        int choice2;
        Character hahmo = null;
        WeaponBehavior ase = null;
        
        do{
        System.out.println("*** BATTLE SIMULATOR ***");
        System.out.println("1) Create a character");
        System.out.println("2) Fight with a character");
        System.out.println("0) Quit");
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Your choice: ");
        choice = scan.nextInt();
        
        if(choice == 1){
            System.out.println("Choose your character:");
            System.out.println("1) King");
            System.out.println("2) Knight");
            System.out.println("3) Queen");
            System.out.println("4) Troll");
            
            Scanner scan1 = new Scanner(System.in);
            System.out.print("Your choice: ");
            choice1 = scan.nextInt(); //hahmo
            
            System.out.println("Choose your weapon:");
            System.out.println("1) Knife");
            System.out.println("2) Axe");
            System.out.println("3) Sword");
            System.out.println("4) Club");
            
            Scanner scan2 = new Scanner(System.in);
            System.out.print("Your choice: ");
            choice2 = scan.nextInt(); //ase
            
            switch(choice1){
                case 1:
                    hahmo = new King(); //hahmo olio kuningas
                    break;
                case 2:
                    hahmo = new Knight();
                    break;
                case 3:
                    hahmo = new Queen();
                    break;
                case 4:
                    hahmo = new Troll();
                    break;
                
            }
            
            switch(choice2){ //luodaan aseet 
                case 1:
                    ase = new Knife();
                    break;
                case 2:
                    ase = new Axe();
                    break;
                case 3:
                    ase = new Sword();
                    break;
                case 4:
                    ase = new Club();
                    break;
            }
        }
        else if(choice == 2){
            System.out.println(hahmo.getName() + " fights with weapon " + ase.getName());
               
        }

        }while(choice != 0);
        
                                
    }
}
