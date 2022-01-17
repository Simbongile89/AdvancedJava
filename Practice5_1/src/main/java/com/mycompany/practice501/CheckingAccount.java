/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice501;

/**
 *
 * @author simbongile.mbombo
 */
public class CheckingAccount extends Account {
    
    private final double overDraftLimit;
    
public CheckingAccount(double balance) {
    this(balance, 0);
}
    
    public CheckingAccount(double balance, double overDraftLimit) {
        super(balance);
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public boolean withdraw(double amount) {
        if(amount <= balance + overDraftLimit) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getDescription() {
        return "Checking Account";
    }
    
    
}
