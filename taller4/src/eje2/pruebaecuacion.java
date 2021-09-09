/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje2;

/**
 *
 * @author El Centurion
 */
public class pruebaecuacion {
    public static void main(String[] args) {
        ecuacion y = new ecuacion();
        y.setA(5);
        y.setB(6);
        y.setC(4);
        y.setX(3);
        
        
        y.getA();
        y.getB();
        y.getC();
        y.getX();
        
        System.out.println("El resultado de Y es: " + y.mostrarY());
    }
    
}
