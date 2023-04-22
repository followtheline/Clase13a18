
package ejer3.newpackage;
import java.util.Scanner;

public class Operacion {
private int numero1;
private int numero2;

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }
public void crearOperacion(){
    Scanner input=new Scanner(System.in);
    System.out.println("Ingrese el valor del primer numero");
    numero1=input.nextInt();
    System.out.println("Ingrese el valor del segundo numero");
    numero2=input.nextInt();
}
public int sumar (){
    return numero1+numero2;
}
public int restar (){
    return numero1-numero2;
}
public int multiplicar(){
    if (numero2==0 || numero1==0){
        System.out.println("En este programa no se puede multiplicar por cero");
        return 0;
    }else {
        return numero1*numero2;
    }
}
public double dividir(){
    if (numero2==0){
        System.out.println("Nunca se pudo, ni se podrá dividir por 0");
        return 0;
    }else {
        return numero1/numero2;
    }
}
}
