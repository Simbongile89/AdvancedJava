/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice401;

/**
 *
 * @author simbongile.mbombo
 */
public class Director extends Manager {
    
    private double budget;

    public Director(int empId, String name, String ssn, double salary, String deptName) {
        super(empId, name, ssn, salary, deptName);
    }

    public Director(int empId, String name, String ssn, double salary, String department, double budget) {
        super(empId, name, ssn, salary, department);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    @Override
    public String toString() {
        return super.toString() + "\nBudget:          " + getBudget();
    }
    
}
