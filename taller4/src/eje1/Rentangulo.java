/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje1;


public class Rentangulo {
     
    private double base;
    private double altura;
    
    public Rentangulo(){
        this.base = 5;
        this.altura=10;
    }
   
    public double getBase(){
        return this.base;
    }   
    
    public double getAltura(){
        return this.altura;
    }
    
    
    public void setBase(double base){
        this.base = base;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    
    public double calcularArea(){
        return this.base * this.altura;
    }
    
    public double calcularPerimetro(){
        return 2*(this.altura + this.base);
    }   
}
        
       



