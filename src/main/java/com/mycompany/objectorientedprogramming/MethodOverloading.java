/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.objectorientedprogramming;

/**
 *
 * @author USER
 */
public class MethodOverloading {
    //parsing parameters to a method can be regarged as overloading
    // the code below shows method overloading which can output without arguments being parsed
    //...and also pasrse an arguments
    public void method1(){
    System.out.println("no arguments");
     }
     public void method1(int i){
    System.out.println("the integer arguments is:" + i);
     }
    // the code below 
  public static void main(String[] args){
  MethodOverloading methodOverloading = new MethodOverloading();
  methodOverloading.method1();
   methodOverloading.method1(45);
   
  
   //in method overloading java automatically promotes an argument to the next available marching datatype it finds
 //ABSTRACTION in java involves the user to see the implementatation of codes without knowing how the code works 
 //...when a user just sees a front end software and not the backend, because the back end is not important to the user, we call it ABSTRACTION
  // by using interfaces in programming it gives partial abstraction but
  //using abstract classes gives full abstraction
  
  //ENCASPULATION is binding the code and data together in a capsule to hide a complexity of a class
  //ENCASPULATION = datahiding + abstraction
  }
  
}
