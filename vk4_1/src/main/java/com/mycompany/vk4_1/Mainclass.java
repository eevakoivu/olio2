/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vk4_1;

/**
 *
 * @author Käyttäjä
 */
public class Mainclass {
    public static void main(String[] args){
    
        //lue kaikki tiedoston tieto ja tulosta näytölle
        //System.out.println(System.getProperty( "user.dir" ));
        //create I/O object which method readFile() parametriksi tiedostopolku
        //poluksi kansion/tiedoston nimi
        
        ReadAndWriteIO io = new ReadAndWriteIO();
        //viedään olion io metodiin readFile tiedoston polku
        io.readFile("C:\\Users\\Käyttäjä\\Documents\\Olio-ohjelmointi\\vk4_1\\testi.txt");
    }
}
