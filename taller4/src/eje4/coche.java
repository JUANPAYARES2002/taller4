/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje4;

/**
 *
 * @author El Centurion
 */
public class coche {
     private String color;
     private String marca;
     private int modelo;
     private  int ncaballo;
     private int ndepuertas;
     private  String matricula;

    public coche() {
        this.color = "verde";
        this.marca = "BMW";
        this.modelo = 2021;
        this.ncaballo = 5;
        this.ndepuertas = 2;
        this.matricula = "jdk70d";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getNcaballo() {
        return ncaballo;
    }

    public void setNcaballo(int ncaballo) {
        this.ncaballo = ncaballo;
    }

    public int getNdepuertas() {
        return ndepuertas;
    }

    public void setNdepuertas(int ndepuertas) {
        this.ndepuertas = ndepuertas;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    
    }
     
     
    

