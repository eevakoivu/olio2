/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vk6_3;

import java.util.ArrayList;

/**
 *
 * @author Käyttäjä
 */
public class Bank {
    //tieto sisältämistä tileista
    //metodi tilien lisäämiseen ja poistamiseen
    //metodi tilien etsimiseen, sis. tilinumero ulos tiliolio/tyhjä
    // private String account = null;
    //private int money;
    //private String foundaccount;
    
    ArrayList<String> accounts = new ArrayList<String>();
    
    public void addRegularAccount(String account, int money){
        accounts.add(account);
        System.out.println("Adding to bank: " + account + "," + money);
    }
    
    public void addCreditAccount(String account, int money, int credit){
        accounts.add(account);
        System.out.println("Adding to bank: " + account + "," + money + "," + credit);
    }
    
    public void removeAccount(String account){
        accounts.remove(account);
        System.out.println("Account removed.");
    }
    
    public void findAccount(String account){
        
        System.out.println("Searching for account: " + account);
        /*for(String element : accounts){    //etsitään ArrayLististä tilinuero
            if(element.contains(account)){ //jos sis. tilinumeron
                foundaccount = element;    //palautetaan tiliolio tai tyhjä
            }
        } */
    }
}
