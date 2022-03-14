/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vk4_2;

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
    
    /* public void readFile(String s){
        
        try {
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
    } */
    
    public void readAndWrite(String inputfile, String outputfile){
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(inputfile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputfile));
            
            String output = "";
            while((output = br.readLine()) != null){
                //kirjoitetaan luettu rivi outputfileen
                bw.write(output);
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
