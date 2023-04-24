/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer4adi.newpackage;

import java.util.Scanner;
public class Cuenta {
private int saldo;
private String titular;
public Cuenta(){
    this.saldo=100000;
    this.titular="JORGE";    
}
public void retirarDinero(){
    System.out.println("Ingrese el nombre del titular de la cuenta");
    Scanner input=new Scanner(System.in);
  titular=  input.nextLine().toUpperCase();
    if (titular=="JORGE"){
        while (saldo>0){
            System.out.println("Ingrese el dinero que desea reritrar");
            
        }
    }
}
}
