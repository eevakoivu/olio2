/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vk4_5;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipInputStream;


/**
 *
 * @author Käyttäjä
 */
public class ReadAndWriteIO {
    
       // koodi osoitteesta: https://linuxtut.com/java-read-zip-file-and-convert-directly-to-string-0afed/
       public void readAndWrite(String file){
           
           try {
               FileInputStream fis = new FileInputStream(file);
               BufferedInputStream bis = new BufferedInputStream(fis);
               ZipInputStream zis = new ZipInputStream(bis);
            
                //otetaan kaikki tiedostot
                while(zis.getNextEntry() != null){
                    String str = new String(zis.readAllBytes());
                
                    System.out.println(str);
                }
           } catch (FileNotFoundException ex) {
               Logger.getLogger(ReadAndWriteIO.class.getName()).log(Level.SEVERE, null, ex);
           } catch (IOException ex) {
               Logger.getLogger(ReadAndWriteIO.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
}
            
