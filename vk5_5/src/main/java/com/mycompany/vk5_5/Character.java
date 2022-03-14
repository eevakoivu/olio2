/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vk5_5;

/**
 *
 * @author Käyttäjä
 */
public abstract class Character { //abstrakti luokka
    protected String name;

    public String getName(){
        return name;
    }
    
}

abstract class WeaponBehavior{ //tähän ei viitata
    protected String name;
    
    public String getName(){
        return name;
    }
}

class King extends Character{ //periytyy Character-luokasta
    
    public King(){
        // super(choice); //viitataan Character rakentajaan
        this.name="King";
    }
}

class Knight extends Character{
    
    public Knight(){
        this.name="Knight";
    }
}

class Queen extends Character{
    
    public Queen(){
        this.name="Queen";
    }
}

class Troll extends Character{
    
    public Troll(){
        this.name="Troll";
    }
}



class Knife extends WeaponBehavior{
    
    public Knife(){
        this.name = "Knife";
    }

}

class Axe extends WeaponBehavior{
    
    public Axe(){
        this.name = "Axe";
    }
}

class Sword extends WeaponBehavior{
    
    public Sword(){
        this.name = "Sword";
    }
}

class Club extends WeaponBehavior{
    public Club(){
        this.name = "Club";
    }
}
