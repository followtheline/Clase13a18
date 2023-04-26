/*
 Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un método 
"calcular_area" que calcule y devuelva el área del rectángulo. Luego crea un objeto
"rectangulo1" de la clase "Rectángulo" con lados de 4 y 6 y imprime el área del rectángulo.

 */
package ejer6adi;
import java.util.Scanner;
import ejer6adi.newpackage.Rectangulo;


public class Ejer6adi {

  
    public static void main(String[] args) {
      Rectangulo square=new Rectangulo(4,6);
      square.calcular_area();
      Rectangulo square2=new Rectangulo();
        System.out.println("Ingrese el tamaño del lado 1");
        Scanner input=new Scanner(System.in);
        square2.setLado1(input.nextInt());
        System.out.println("Ingrese el tamaño del lado 2");
        square2.setLado2(input.nextInt());
        square2.calcular_area();
    }
    
}
