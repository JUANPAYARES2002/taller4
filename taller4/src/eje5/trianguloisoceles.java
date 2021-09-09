/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje5;

/**
 *
 * @author El Centurion
 */
public class trianguloisoceles {
     private int base;
    private int altura;

    public trianguloisoceles() {
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    public double CalcularArea(){
    
    
    return (this.base*this.altura)/2;
    }
    
    public double CalcularLado(){
    double lado=0;
    lado =Math.sqrt((base/2)*(base/2)+ altura*altura);
    
    
    return lado;
    }
    
    
    public double CalcularPerimetro(){
        
   
    return (2*CalcularLado()+base);
    }

}
