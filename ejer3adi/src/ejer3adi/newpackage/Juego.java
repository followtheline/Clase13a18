/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer3adi.newpackage;

import java.util.Scanner;
public class Juego {
private int intMaximos;
private int jugador1;
private int jugador2;

    public Juego(int intMaximos) {
        this.intMaximos = intMaximos;
        this.jugador1 = 0;
        this.jugador2 = 0;
    }

  
    
public void iniciarJuego(){
   Scanner input=new Scanner(System.in);
    System.out.println("Jugador 1 elija un número entre 1 y 100");
    int Adivinar=input.nextInt();
    int intentos=0;
    boolean adivinado= false;
    
 while (!adivinado && intentos<intMaximos){ 
     System.out.println("Jugador 2, intenta adivinar el número");
     int numeroIntento=input.nextInt();
     intentos++;
     if (numeroIntento==Adivinar){
         System.out.println("Correcto");
         adivinado= true;
         jugador2++;
     }else if (numeroIntento<Adivinar){
         System.out.println("El número es más alto");
     }else {
         System.out.println("El número es más bajo");
     }
 }          
 if (!adivinado){
     System.out.println("Se acabaron los intentos");
     jugador1++;
 }
    System.out.println("Resultados: ");
    System.out.println("jugador 1: "+jugador1);
    System.out.println("jugador 2: "+jugador2);
}
}
