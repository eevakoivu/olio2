/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vk4_2;

/**
 *
 * @author Käyttäjä
 */
public class Mainclass {
    public static void main(String[] args){

        //tallennetaan tiedoston input.txt data tiedostoon output.txt
        //readAndWrite() metodi parametriksi input ja output files
        
        ReadAndWriteIO io = new ReadAndWriteIO();
        io.readAndWrite("C:\\Users\\Käyttäjä\\Documents\\Olio-ohjelmointi\\vk4_1\\testi.txt", "output.txt");
    }
}
