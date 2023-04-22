
package ejer2;

import ejer2.newpackage.Circunferencia;


public class Ejer2 {

   
    public static void main(String[] args) {
        Circunferencia circ1 = new Circunferencia(5.0);
    System.out.println("Radio de circ1: " + circ1.getRadio());
    System.out.println("Área de circ1: " + circ1.area());
    System.out.println("Perímetro de circ1: " + circ1.perimetro());

    Circunferencia circ2 = new Circunferencia(0.0);
    circ2.crearCircunferencia();
    System.out.println("Radio de circ2: " + circ2.getRadio());
    System.out.println("Área de circ2: " + circ2.area());
    System.out.println("Perímetro de circ2: " + circ2.perimetro());
}
}