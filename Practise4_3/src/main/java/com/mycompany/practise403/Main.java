/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practise403;

/**
 *
 * @author simbongile.mbombo
 */
public class Main {
    
    public static void main(String[] args) {
    Singleton peerList01 = Singleton.getInstance();
    Singleton peerList02 = Singleton.getInstance();
    
    for(String hostName:peerList01.getHostNames()){
      System.out.println("Host name: " + hostName);
    }

    System.out.println();
    for(String hostName:peerList02.getHostNames()){
      System.out.println("Host name: " + hostName);
    }
  }  
    
}
