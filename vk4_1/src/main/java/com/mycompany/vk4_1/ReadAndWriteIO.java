/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vk4_1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Käyttäjä
 */
public class ReadAndWriteIO {
    
    //readFile metodi parametriksi tiedoston nimi
    public void readFile(String s){
        
        try {
            //luodaan FileReader olio BufferedReader olion sisälle
            BufferedReader br = new BufferedReader(new FileReader(s));
            String output = "";
            while((output = br.readLine()) != null){
                System.out.println(output);
            }
            br.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadAndWriteIO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ReadAndWriteIO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
