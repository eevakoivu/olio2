/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vk6_4;

import java.util.ArrayList;

/**
 *
 * @author Käyttäjä
 */
public class Bank {
    //tieto sisältämistä tileista
    //metodi tilien lisäämiseen ja poistamiseen
    //metodi tilien etsimiseen, sis. tilinumero ulos tiliolio/tyhjä
    //tilit toimivat pankin rajapinnan kautta
    
    ArrayList<Account> accounts = new ArrayList<Account>();
    
    public void addRegularAccount(String account, int money){
        //lisätään tili oli listaan
        accounts.add(new RegularAccount(account, money));
        System.out.println("Account created.");
    }
    
    /*public void addCreditAccount(String account, int money, int credit){
        accounts.add(account);
        System.out.println("Adding to bank: " + account + "," + money + "," + credit);
    } */
    
    public void removeAccount(String account){
        accounts.remove(account);
        System.out.println("Account removed.");
    }
    
    public void findAccount(String account){
        
        for(int i=0;i<accounts.size();i++){ //käydään lista läpi
            if(accounts.get(i).account.equals(account)){ //jos sis. tilinumeron
                System.out.println("Account number: " + accounts.get(i).account + " Amount of money: " + accounts.get(i).money);
            }
        }
    }
    
    public void depositMoney(String account, int money){
        
        for(int i=0;i<accounts.size();i++){
            if(accounts.get(i).account.equals(account)){
                accounts.get(i).depositMoney(money);
            }
        }
    }
    
    public void withdrawMoney(String account, int money){
        
        for(int i=0;i<accounts.size();i++){
            if(accounts.get(i).account.equals(account)){
                accounts.get(i).withdrawMoney(money);
            }
        }
    }
}
