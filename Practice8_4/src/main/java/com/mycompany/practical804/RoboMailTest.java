/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practical804;

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
    System.out.println("\n=== Male Eng Under 65");
    pl.stream()
        .filter(p -> p.getGender().equals(Gender.MALE))
        .filter(p -> p.getDept().equals("Eng"))
        .filter(p -> p.getAge() < 65)
        .forEach(p -> robo.roboMail(p));    
  }  
}
