package ejer4;

import ejer4.newpackage.Rectángulo;


 /**
  * Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
 * base y un atributo privado altura. La clase incluirá un método para crear el rectángulo 
 * con los datos del Rectángulo dados por el usuario. También incluirá un método para 
 * calcular la superficie del rectángulo y un método para calcular el perímetro del 
 * rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante 
 * asteriscos usando la base y la altura. Se deberán además definir los métodos getters, 
 * setters y constructores correspondientes.c
*/
 
public class Ejer4 {

  
    public static void main(String[] args) {
        Rectángulo square= new Rectángulo();
        square.leer();
        System.out.println("La superficie del rectángulo es: "+square.superficie());
        System.out.println("El perímetro del rectángulo es: "+square.perimetro());
        square.dibujar();
    }
    
}
