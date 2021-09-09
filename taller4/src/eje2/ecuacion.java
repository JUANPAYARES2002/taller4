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
public class ecuacion {
    
     private int a;
    private int b;
    private int c;
    private int x;

    public ecuacion() {
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
   
    
    
    public int mostrarY(){
    int y =0; 
    return y=(a*x)*(a*x) + b*x + c ;
    }
    }

