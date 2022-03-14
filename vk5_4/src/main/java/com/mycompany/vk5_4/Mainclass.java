/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vk5_4;

/**
 *
 * @author Käyttäjä
 */
public class Mainclass {
    public static void main(String[] args){
     // osaolioiden rakentajassa mitä osaa rakennetaan
     // tee auton osat osaluokkina ja liitä autoon autoa luodessa
     // autolla metodi print() -> mitä osia auto pitää sisällään
        Car car = new Car();
        car.print();
    }
}
