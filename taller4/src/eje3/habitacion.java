/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje3;

/**
 *
 * @author El Centurion
 */
public class habitacion {
     private double largo;
    private double ancho;
    private double altura;

    public habitacion() {
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    double  calcularMetros(){
    
        double m=0;
    return  m= largo*ancho;
    }
    
    double  calcularPapel(){
    
    double p = 0; double habi=0; 
    double p1 = 0;
    p = ancho * altura;
    p1 = largo * ancho;
    habi = p/p1;
    return habi;
    }
}
