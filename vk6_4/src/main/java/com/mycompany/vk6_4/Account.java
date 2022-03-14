/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vk6_4;

/**
 *
 * @author Käyttäjä
 */
abstract public class Account {
    //tavallisen tilin toiminta
    //perii abstraktin tililuokan 
    protected String account; //tilinumero
    protected int money;      //rahan määrä
    
    
    /*public Account(String account, int money){
        this.account=account;
        this.money=money;
    } */
    
    public void depositMoney(int money){
        this.money+=money;
    }
    
    public abstract void withdrawMoney(int money);
}

class RegularAccount extends Account {
    
    //lisätään tilinumero ja rahamäärä tilin tietoihin
    public RegularAccount(String account, int money){
        this.account=account;
        this.money=money;
    }
    
    //tili ei voi mennä negatiiviseksi
    @Override
    public void withdrawMoney(int money){
        if(this.money>=money){ //jos tilillä on enemmän rahaa kun sielä vähen.
            this.money-=money;
        }
    }
}

