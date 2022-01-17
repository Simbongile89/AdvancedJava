/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice503;

/**
 *
 * @author simbongile.mbombo
 */
public enum Branch {
    LA("Basic"), BOSTON("Loan"), BANGALORE("Full"), MUMBAI("Full");
       
        String serviceLevel;
        private Branch(String serviceLevel){
            this.serviceLevel = serviceLevel;
        }
        
        public String getServiceLevel(){
          return serviceLevel;
        }
    
}
