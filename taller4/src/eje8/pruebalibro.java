/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje8;

/**
 *
 * @author El Centurion
 */
public class pruebalibro {
    public static void main(String[] args) {
        Libro m = new Libro(); 
      leerLibro(m);
      mostrarInfoLibro(m); 
    }
    public static void leerLibro(Libro x){
     x.setTitulo("50 sobras de grey");
    x.setPrimernombre("juan");
    x.setSegundonombre("jose ");
    x.setPrimerapellido("payares ");
    x.setISBN("0-13-031997-x");
    x.setPaginas("500");
    x.setEdicion("3a");
    x.setEditorial("Prentice-Hall");
    x.setCiudad("bogota ");
    x.setPais("Colombia");
    x.setFechadeedicion("jueves 13 noviembre 2004");
    } 
     public static void mostrarInfoLibro(Libro l){
        System.out.println("Titulo: " + l.getTitulo());
        System.out.printf(l.getEdicion()+"Edicion\n");
        System.out.println("Autor: " +l.getPrimerapellido()+l.getPrimernombre()+" "+l.getSegundonombre());
        System.out.println("ISBN: "+l.getISBN());
        System.out.println(l.getEditorial()+" "+l.getCiudad()+l.getPais()+" "+l.getFechadeedicion());
        System.out.println(l.getPaginas()+" paginas");
        System.out.println("-----------------------------------");
        
}
}
