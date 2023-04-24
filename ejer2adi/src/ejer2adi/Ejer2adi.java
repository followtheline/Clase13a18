/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto
puntos usando un método crearPuntos() que le pide al usuario los dos números y 
los ingresa en los atributos del objeto. Después, a través de otro método calcular
y devolver la distancia que existe entre los dos puntos que existen en la clase Puntos
 */
package ejer2adi;

import ejer2adi.newpackage.Puntos;


public class Ejer2adi {
    public static void main(String[] args) {
    Puntos points=new Puntos();
    points.CrearPuntos();
    double distancia= points.CalcularDistancia();
        System.out.println("La distancia entre los puntos es: "+distancia);
    }
    
}
