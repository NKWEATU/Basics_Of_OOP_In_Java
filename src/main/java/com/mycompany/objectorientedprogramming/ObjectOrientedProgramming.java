/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.objectorientedprogramming;

/**
 *
 * @author USER
 */
public class ObjectOrientedProgramming {

    public static void main(String[] args) {
        
       // Car c = new Car("Hondar Accord","Ash colour",9);// name of constructor must be same with the class name
       // c.display();// this code accesses the constructor from the 'Car' class, constructors don't have 'return type'
        
       Car ferarri = new Car();
        ferarri.model = "ferrari 234";
        ferarri.seats = 6;
        ferarri.colour = "red";
        ferarri.display();
        
        Car jeep = new Car();
        jeep.model = "jeep 2334";
        jeep.seats = 7;
        jeep.colour = "blue";
        jeep.display();
        
        Car rangerover = new Car();
        rangerover.model = "rangerover 23445";
        rangerover.seats = 8;
        rangerover.colour = "black";
        rangerover.display();
        
        // the 3 ways to intialize an object are declaration, method and from the main class using variables.
        
       Car c = new Car(); // this is the second way to initialize an objec through 'method'.
       c.initialize("model_audi", "yellow", 34);//but its not advisable because its makes the code complex as you have to repeat thesame procedures for each objects
        c.display();//there are bound to be errors    
        System.out.println("The number of seats are: "+c.seats);
        
         // whenever overloading method, the child class is always given precedence before checking parent type
       
      MethodOverloading methodOverloading = new MethodOverloading();
      methodOverloading.method1(56);
      methodOverloading.method1();
      
      ObjectOrientedProgramming oop = new ObjectOrientedProgramming();
      oop.m1(new Object());
      oop.m1("string");
      oop.m1(null);
    }
    public void m1(String str){
        
        System.out.println("string version");
    }
     public void m1(Object obj){
        
        System.out.println("object version");
    }
    
}
