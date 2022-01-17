/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice2;

/**
 *
 * @author simbongile.mbombo
 */
public class EmployeeTest {
    
     public static void main(String[] args) {
        Employee emp = new Employee ();
        emp.setEmpId(101);
        emp.setName("Jane Smith");
        emp.setSsn ("012-34-5678");
        emp.setSalary(120_345.27);
        System.out.println ("Employee id:         " + emp.getEmpId());
        System.out.println ("Employee name:       " + emp.getName());
        System.out.println ("Employee Soc Sec #:  " + emp.getSsn());
        System.out.println ("Employee salary:     " + emp.getSalary());
    }
    
}
