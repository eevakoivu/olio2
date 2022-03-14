/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vk4_4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Käyttäjä
 */
public class ReadAndWriteIO {
    
        //etsitään tekstistä kaikki v kirjaimet
        public void readAndWrite(String inputfile, String outputfile){
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(inputfile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputfile));
            
            String output = "";
            while((output = br.readLine()) != null){
                //jos ei tyhjä, alle 30 merkkiä ja sisältää v
                if (!(output.trim().isEmpty()) && (output.length() < 30) && output.contains("v") ){ 
                    bw.write(output+"\n");
                }
            }
            bw.close();
            br.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadAndWriteIO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ReadAndWriteIO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
