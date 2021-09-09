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
public class pruebahabitacion {
    public static void main(String[] args) {
        habitacion f = new habitacion();
        f.setLargo(10);
        f.setAncho(18);
        f.setAltura(2.30);
        imprimirinfohabitacion(f);
        
        }
        
        public static void imprimirinfohabitacion(habitacion r){
        System.out.println("Largo: " + r.getLargo());
        System.out.println("Ancho: " + r.getAncho());
        System.out.println("Altura: "+ r.getAltura());
      
        System.out.println("metros cuadrados que s habitacion son: " + r.calcularMetros());
        System.out.println("metros cuadrados papel habitacion: "+r.calcularPapel());
        System.out.println("-----------------------------------");
    }
        
        
        
    }
 
    

