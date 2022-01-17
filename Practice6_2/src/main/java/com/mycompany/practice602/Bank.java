/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice602;

/**
 *
 * @author simbongile.mbombo
 */
public class Bank implements BankOperations {
       private Customer[] customers;
    private int numberOfCustomers;

    public Bank() {
        customers = new Customer[10];
        numberOfCustomers = 0;
    }

    public void addCustomer(String f, String l,Branch b) {
        int i = numberOfCustomers++;
        customers[i] = new Customer(f, l,b);
    }

    public int getNumOfCustomers() {
        return numberOfCustomers;
    }

    public Customer getCustomer(int customerIndex) {
        return customers[customerIndex];
    }
}
    

