/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice3;

import java.text.NumberFormat;

/**
 *
 * @author simbongile.mbombo
 */
public class Employee {
       private int empId;
    private String name;
    private String ssn;
    private double salary;

    public Employee(int empId, String name, String ssn, double salary) {
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        // Make sure the name value is not null or empty
        if (name != null && !name.equals("")) {
            this.name = name;
        }
    }

    public void raiseSalary(double increase) {
        // Make sure the increase is not less than 0
        if (increase > 0) {
            salary += increase;

        }
    }

    public  void printEmployee() {

        System.out.println(); // Print a blank line as a separator
        // Print out the data in this Employee object
        System.out.println("Employee id:         " + getEmpId());
        System.out.println("Employee name:       " + getName());
        System.out.println("Employee Soc Sec #:  " + getSsn());
        System.out.println("Employee salary:     " + NumberFormat.getCurrencyInstance().format((double) getSalary()));
    }
}


