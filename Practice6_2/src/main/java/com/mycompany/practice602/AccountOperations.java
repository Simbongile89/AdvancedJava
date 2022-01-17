/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice602;

/**
 *
 * @author simbongile.mbombo
 */
public interface AccountOperations {
    public double getBalance();
    public void deposit(double amount);
    public boolean withdraw(double amount);
    public String getDescription();
    
}
