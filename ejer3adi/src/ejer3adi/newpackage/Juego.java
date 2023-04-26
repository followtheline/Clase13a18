package ejer3adi.newpackage;
import java.util.Random;
import java.util.Scanner;

public class Juego {
    private int intMaximos;
    private int jugador1;
    private int jugador2;
    private int Adivinar;
    private int intentosRestantes;
    private int intentosRealizados;

    public Juego() {
        Random rand = new Random();
        this.Adivinar = rand.nextInt(100) + 1;
        this.jugador1 = 0;
        this.jugador2 = 0;
    }

    public void iniciarJuego() {
     Scanner input = new Scanner(System.in);
    System.out.println("Jugador 1, inserte el número a adivinar:");
    int Adivinar = input.nextInt();
    System.out.println("Jugador 1, inserte el número de intentos:");
    intMaximos = input.nextInt();
    int intentos = 0;
    boolean adivinado = false;
    
    while (intentos < intMaximos && !adivinado){ 
        System.out.println("Jugador 2, intenta adivinar el número:");
        int numeroIntento = input.nextInt();
        intentos++;
        if (numeroIntento == Adivinar){
            System.out.println("Correcto");
            adivinado = true;
            jugador2++;
        } else if (numeroIntento < Adivinar){
            System.out.println("El número es más alto");
        } else {
            System.out.println("El número es más bajo");
        }
    }          
    if (!adivinado){
        System.out.println("Se acabaron los intentos");
        jugador1++;
    }
    
    System.out.println("Resultados: ");
    System.out.println("Jugador 1: " + jugador1);
    System.out.println("Jugador 2: " + jugador2);
}
}