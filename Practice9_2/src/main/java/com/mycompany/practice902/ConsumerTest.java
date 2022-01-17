/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice902;

import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author simbongile.mbombo
 */
public class ConsumerTest {
     public static void main(String[] args) {
    
    List<Employee> eList = Employee.createShortList();
    Employee first = eList.get(0);
    
    Consumer<Employee> eCons = 
      e -> System.out.println(
        "Name: " + e.getSurName() + "  Role: " 
        + e.getRole() + "  Salary: " + e.getSalary()
      );
    
    System.out.println("=== First Salary");
    eCons.accept(first);
    
  }
}
