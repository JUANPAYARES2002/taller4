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
public class bicicleta {
      private int velocidadactual;
    private int platoactual;
    private int piñonactual;

    public bicicleta() {
    }

    public int getVelocidadactual() {
        return velocidadactual;
    }

    public void setVelocidadactual(int velocidadactual) {
        this.velocidadactual = velocidadactual;
    }

    public int getPlatoactual() {
        return platoactual;
    }

    public void setPlatoactual(int platoactual) {
        this.platoactual = platoactual;
    }

    public int getPiñonactual() {
        return piñonactual;
    }

    public void setPiñonactual(int piñonactual) {
        this.piñonactual = piñonactual;
    }
     public int acelerar(){
    
    return 2*this.velocidadactual;
    }
    
    
    public int frenar(){
    
    return this.velocidadactual/2;
    }
    
    
    
    public int cambiarPlato(int plato){
    this.platoactual=plato;
     
    return plato;
    }
    
    
  public int cambiarPinon(int pinon){
    this.piñonactual=pinon;
     
    return pinon;
    }      
}
