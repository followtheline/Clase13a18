
package ejer4adi;

import ejer4adi.newpackage.Cuenta;
import ejer4adi.newpackage.Saldo;


public class Ejer4adi {

   
    public static void main(String[] args) {
      Cuenta account=new Cuenta();
      account.login();
      account.pswlogin();
      Saldo sald=new Saldo();
      sald.retirarDinero();
    }
    
}
