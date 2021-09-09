/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje6;


/**
 *
 * @author El Centurion
 */
public class pruebabicicleta {
    public static void main(String[] args) {
          bicicleta f = new bicicleta();
        f.setVelocidadactual(10);
        f.setPiñonactual(2);
        f.setPlatoactual (3);
        imprimirbicicleta(f);
    }
    public static void imprimirbicicleta(bicicleta r){
        System.out.println("Velocidadactual: " +r.getVelocidadactual());
        System.out.println("Piñonactual: "+r.getPiñonactual());
        System.out.println("Platoactual: " +r.getPlatoactual());
        System.out.println("frenar: " +r.frenar());
        System.out.println("acelelar: "+r.acelerar());
        System.out.println("cambiarpiñonactual: "+r.cambiarPinon(5));
        System.out.println("cambiarplatoactual: "+r.cambiarPlato(4));
        System.out.println("-----------------------------------");
    }
}
