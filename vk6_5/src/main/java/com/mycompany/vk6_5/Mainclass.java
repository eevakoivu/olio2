/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vk6_5;

import java.util.Scanner;

/**
 *
 * @author Käyttäjä
 */
public class Mainclass {
    public static void main(String[] args){
        int choice = 0;
        String account = null;
        int money = 0;
        int credit = 0;
        
        Scanner scan = new Scanner(System.in);
        Bank bank = new Bank(); //luodaan Bank-olio
        
        do {
        System.out.println();
        System.out.println("*** BANK SYSTEM ***");
        System.out.println("1) Add a regular account");
        System.out.println("2) Add a credit account");
        System.out.println("3) Deposit money");
        System.out.println("4) Withdraw money");
        System.out.println("5) Remove an account");
        System.out.println("6) Print account information");
        System.out.println("7) Print all accounts");
        System.out.println("0) Quit");
        
        System.out.print("Your choice: ");
        choice = scan.nextInt();
        
        if(choice == 1){
            System.out.print("Give an account number: ");
            account = scan.next();
            System.out.print("Amount of money to deposit: ");
            money = scan.nextInt();
            
            bank.addRegularAccount(account, money);
            
        }
        else if(choice == 2){
            System.out.print("Give an account number: ");
            account = scan.next();
            System.out.print("Amount of money to deposit: ");
            money = scan.nextInt();
            System.out.print("Give a credit limit: ");
            credit = scan.nextInt();
            
            bank.addCreditAccount(account, money, credit);
            
        }
        else if(choice == 3){
            System.out.print("Give an account number: ");
            account = scan.next();
            System.out.print("Amount of money to deposit: ");
            money = scan.nextInt();
            
            bank.depositMoney(account, money);
        }
        else if(choice == 4){
            System.out.print("Give an account number: ");
            account = scan.next();
            System.out.print("Amount of money to withdraw: ");
            money = scan.nextInt();
            
            bank.withdrawMoney(account, money);
        }
        else if(choice == 5){
            System.out.print("Give the account number of the account to delete: ");
            account = scan.next();
            
            bank.removeAccount(account);

        }
        else if(choice == 6){
            System.out.print("Give the account number of the account to print information from: ");
            account = scan.next();
            bank.findAccount(account);

        }
        else if(choice == 7){
            bank.printAccounts();
        }
        else if(choice == 0){
        }
        else{
            System.out.println("Invalid choice.");
        }
        
        }while(choice != 0);
        
        
        
    }
}
