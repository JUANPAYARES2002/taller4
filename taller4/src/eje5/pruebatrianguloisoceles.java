
package eje5;

/**
 *
 * @author El Centurion
 */
public class pruebatrianguloisoceles {
    public static void main(String[] args) {
         trianguloisoceles f = new trianguloisoceles();
        f.setBase(10);
        f.setAltura(2);
        imprimirtrianguloisoceles(f);
    }
     public static void imprimirtrianguloisoceles(trianguloisoceles r){
        System.out.println("Base: " + r.getBase());
        System.out.println("Altura: "+ r.getAltura());
        System.out.println("Area: " +r.CalcularArea());
        System.out.println("lado: " +r.CalcularLado());
        System.out.println("Perimetro"+r.CalcularPerimetro());
        System.out.println("-----------------------------------");
    }
}
