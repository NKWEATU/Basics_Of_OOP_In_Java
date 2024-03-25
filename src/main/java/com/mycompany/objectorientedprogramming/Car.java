/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.objectorientedprogramming;

/**
 *
 * @author USER
 */
public class Car {
    public String model; // these are the blue prints of the code
    public String colour;
    public int     seats;
    
    //the code below is how to use 'constructors in java'
  /*  Car (String model, String colour, int seats){
    this.model = model;
    this.colour = colour;
    this.seats = seats;
    }*/
    
  public void display(){   //this make the code accessible from the main class
    System.out.println("model is :" + model);
      System.out.println("model is :" + colour);
        System.out.println("model is :" + seats);
        
    }
   public void initialize(String model_audi, String yellow, int i) {

model = model_audi;
colour = yellow;
seats = i;

}
}
