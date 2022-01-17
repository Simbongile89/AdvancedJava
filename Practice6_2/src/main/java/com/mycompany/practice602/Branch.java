/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice602;

/**
 *
 * @author simbongile.mbombo
 */
public enum Branch {
    
    LA("Basic"), Boston("Loan"), Bangalore("Full"), Mumbai("Full");
       
        String serviceLevel;
        private Branch(String serviceLevel){
            this.serviceLevel = serviceLevel;
        }
        
        public String getServiceLevel(){
          return serviceLevel;
        }
    
}
