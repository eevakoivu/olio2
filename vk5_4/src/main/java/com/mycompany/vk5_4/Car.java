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
public class Car {
    
    public Car(){ //Rakentaja
        Body body = new Body();
        Chassis chassis = new Chassis();
        Engine engine = new Engine();
        Wheel wheel1 = new Wheel();
        Wheel wheel2 = new Wheel();
        Wheel wheel3 = new Wheel();
        Wheel wheel4 = new Wheel();
    }
    
    public void print(){ //Print-metodi
        System.out.println("Car parts:");
        System.out.println("\tBody");
        System.out.println("\tChassis");
        System.out.println("\tEngine");
        System.out.println("\t4 Wheels");
    }

}

class Body{
    public Body(){
        System.out.println("Manufacturing: Body");
    }
}

class Chassis{
    public Chassis(){
        System.out.println("Manufacturing: Chassis");
    }
}

class Engine{
    public Engine(){
        System.out.println("Manufacturing: Engine");
    }
}

class Wheel{
    public Wheel(){
        System.out.println("Manufacturing: Wheel");
    }
}
