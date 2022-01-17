/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice401;

/**
 *
 * @author simbongile.mbombo
 */
public class EmployeeStockPlan {
    
     private final int employeeShares = 10;
    private final int managerShares = 100;
    private final int directorShares = 1000;

    public EmployeeStockPlan() {
    }

    public int grantStock(Employee emp) {
        // Stock is granted based on the employee type
        if (emp instanceof Director) {
            return directorShares;
        } else {
            if (emp instanceof Manager) {
                return managerShares;
            } else {
                return employeeShares;
            }
        }
    }
    
}
