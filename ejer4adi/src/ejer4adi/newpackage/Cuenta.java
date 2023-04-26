
package ejer4adi.newpackage;

import java.util.Scanner;
public class Cuenta {
    private String titular;
    private String contra;
 

    public Cuenta() {
        this.titular = "JORGE";
        this.contra = "12345";
    }
   public Cuenta(String titular, String contra) {
        this.titular = titular;
        this.contra = contra;
    }

    public String getTitular() {
        return titular;
    }

    public String getContra() {
        return contra;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

public void login() {
    System.out.println("Bienvenido, por favor ingrese su usuario: ");
    Scanner input = new Scanner(System.in);
    titular = input.nextLine().toUpperCase();
}

public void pswlogin(){
    String pasw = "";
    int count = 0;
    Scanner input2=new Scanner(System.in);

    if (titular.equals("JORGE")) {
        do {
            System.out.println("Ingrese su contraseña");
            pasw = input2.nextLine();
            count++;
        } while (!pasw.equals(contra) && count < 3);
        if (pasw.equals(contra)) {
            System.out.println("Contraseña correcta, bienvenido " + titular);
        } else {
            System.out.println("Ha ingresado la contraseña incorrecta tres veces");
            System.exit(0); 
        }
    } else {
        System.out.println("Ha ingresado un usuario incorrecto");
        System.exit(0); 
    }
}
}