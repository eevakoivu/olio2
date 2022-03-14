/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vk6_5;

/**
 *
 * @author Käyttäjä
 */
//luotollinen tili
//nostovaran tutkiminen, uuden tilin luonti ja tulostus ovat erilaisia
//tilitä voi nostaa rahaa luottorajaan asti
abstract public class Account {
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
    
    public abstract void printAccount();
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
    
    @Override
    public void printAccount(){
        System.out.println("Account number: " + account + " Amount of money: " + money);
    }
}

class CreditAccount extends Account{
    private int credit;
    
    public CreditAccount(String account, int money, int credit){
        this.account=account;
        this.money=money;
        this.credit=credit;
    }
    
    //luottorajan tutkiminen!!
    @Override
    public void withdrawMoney(int money){
        if(this.money-money>=credit){ //jos väh. luottorajan sisällä
            this.money-=money;
        }
    }
    
    @Override
    public void printAccount(){
        System.out.println("Account number: " + account + " Amount of money: " + money + " Credit limit: " + credit);
    }
    
}
