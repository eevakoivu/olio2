/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vk6_5;

import java.util.ArrayList;

/**
 *
 * @author Käyttäjä
 */
public class Bank {
    
    
    ArrayList<Account> accounts = new ArrayList<Account>();
    
    public void addRegularAccount(String account, int money){
        accounts.add(new RegularAccount(account, money));
        System.out.println("Account created.");
    }
    
    public void addCreditAccount(String account, int money, int credit){
        accounts.add(new CreditAccount(account, money, credit));
        System.out.println("Account created.");
    }
    
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
                accounts.get(i).withdrawMoney(money); //ottaa huomioon tilin tyypin
            }
        }
    }
    
    public void printAccounts(){
        System.out.println("All accounts:");
        
        for(int i=0;i<accounts.size();i++){
            accounts.get(i).printAccount(); //ottaa huomioon tilin tyypin
        }
    }
}
