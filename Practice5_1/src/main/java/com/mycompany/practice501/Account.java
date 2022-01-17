/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice501;

/**
 *
 * @author simbongile.mbombo
 */
public  abstract class Account {
    
    protected double balance;
    
    public Account(double balance) {
        this.balance = balance;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void deposit(double amount) {
        balance += amount;
    }
    
    @Override
    public String toString() {
        return getDescription() + ": current balance is " + balance;
    }
    
    public abstract boolean withdraw(double amount);
    
    public abstract String getDescription();
    
    
}
