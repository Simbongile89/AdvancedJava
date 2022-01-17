/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice803;

import java.util.List;

/**
 *
 * @author simbongile.mbombo
 */
public class RoboMailTest {
  public static void main(String[] args) {
    
    List<Employee> pl = Employee.createShortList();
    RoboMail robo = new RoboMail();
        
    System.out.println("\n==== RoboMail 01");    
    System.out.println("\n=== All Sales 50+");
    pl.stream()
        .filter(p -> p.getAge() >= 50)
        .filter(p -> p.getDept().equals("Sales"))
        .forEach(p -> robo.roboMail(p));
  }  
}
