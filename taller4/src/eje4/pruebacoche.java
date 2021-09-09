
package eje4;


public class pruebacoche {
  public static void main(String[] args) {
        
     coche c = new coche();
     c.setColor("azul");
     c.setMarca("Mazda");
     c.setModelo(2020);
     c.setNcaballo(2);
     c.setNdepuertas(4);
     c.setMatricula("FLK");
     Mostrarcoche(c);
     
     coche a = new coche();
     Mostrarcoche(a);
     
    
     
     coche b = new coche();
     b.setColor("Amarillo");
     b.setMarca("Mazda");
     b.setModelo(2018);
     b.setNcaballo(2);
     b.setNdepuertas(2);
     b.setMatricula("WKF");
    
System.out.println("Color: " +b.getColor());
     System.out.println("Marca: "+b.getMarca());
     System.out.println("Modelo: " +b.getModelo());
     System.out.println("N Caballo: " +b.getNcaballo());
     System.out.println("N Puertas: "+b.getNdepuertas());
     System.out.println("Matricula: "+b.getMatricula());
     System.out.println("-----------------------------------");
     
  }
  
public static void Mostrarcoche(coche a){
        
        System.out.println("Color: " +a.getColor());
        System.out.println("Marca: "+a.getMarca());
        System.out.println("Modelo: " +a.getModelo());
        System.out.println("N Caballo: " +a.getNcaballo());
        System.out.println("N Puertas: "+a.getNdepuertas());
        System.out.println("Matricula: "+a.getMatricula());
        System.out.println("-----------------------------------");
 
 
 
 
 
 
 }  
}