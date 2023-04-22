//c
package ejer3;

import ejer3.newpackage.Operacion;


public class Ejer3 {

  
    public static void main(String[] args) {
      Operacion op= new Operacion();
      op.crearOperacion();
        System.out.println("El valor de la suma es: "+op.sumar());
        System.out.println("El valor de la resta es: "+op.restar());
        System.out.println("El valor de multiplicar es: "+op.multiplicar());
        System.out.println("El valor de dividir es: "+op.dividir());
    }
    
}
