/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje1;

/**
 *
 * @author El Centurion
 */
public class Pruebarentangulo {
    public static void main(String[] args) {
        
        Rentangulo a = new Rentangulo();
        a.setAltura(30);
        a.setBase(10);
        imprimirInfoRentangulo(a);
        
        Rentangulo b = new Rentangulo();
        imprimirInfoRentangulo(b);
        
    }
    
    public static void imprimirInfoRentangulo(Rentangulo r){
        System.out.println("Base: " + r.getBase());
        System.out.println("Altura: "+ r.getAltura());
        System.out.println("Area: " + r.calcularArea());
        System.out.println("Perimetro"+r.calcularPerimetro());
        System.out.println("-----------------------------------");
 }
}

