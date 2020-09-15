/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Dominio;

/**
 *
 * @author USUARIO
 */
public class dominio {
    private Double n1;
    private Double n2;

    public Double getN1() {
        return n1;
    }

    public void setN1(Double n1) {
        this.n1 = n1;
    }

    public Double getN2() {
        return n2;
    }

    public void setN2(Double n2) {
        this.n2 = n2;
    }
    
    public Double Periodo1(Double n1, Double n2){
       this.n1=n1;
       this.n2=n2;
        
        return n1*0.40 + n2*0.60 ;
    
    }
      public Double Periodo2(Double n1, Double n2){
       this.n1=n1;
       this.n2=n2;
        
        return n1*0.40 + n2*0.60 ;
    
    }
       public Double Periodo3(Double n1, Double n2){
       this.n1=n1;
       this.n2=n2;
        
        return n1*0.40 + n2*0.60 ;
       }
}
