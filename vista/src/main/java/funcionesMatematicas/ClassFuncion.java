/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionesMatematicas;

/**
 *
 * @author USUARIO
 */
public class ClassFuncion {
    private Double n1;
    private Double n2;

    public ClassFuncion() {
    
    }

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
    
    public Double Restar(Double n1,Double n2){
        this.n1=n1;
        this.n2=n2;
        
        
        return n1-n2;
    
    
    }
    
    public Double Dividir(Double d1, Double d2){
        this.n1=n1;
        this.n2=n2;
        
        return d1/d2;
    
    
    }
    
}
