/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer2adi.newpackage;

import java.util.Scanner;
public class Puntos {
       private int x1;
       private int y1;
       private int x2;
       private int y2;
       public Puntos(){
           this.x1=0;
           this.y1=0;
           this.x2=0;
           this.y2=0;
       }
       public void CrearPuntos(){
           Scanner input=new Scanner(System.in);
           System.out.println("Ingrese el valor de x1: ");
        this.x1 = input.nextInt();

        System.out.println("Ingrese el valor de y1: ");
        this.y1 = input.nextInt();

        System.out.println("Ingrese el valor de x2: ");
        this.x2 = input.nextInt();

        System.out.println("Ingrese el valor de y2: ");
        this.y2 = input.nextInt();

        input.close();
       }
       public double CalcularDistancia(){
           double distancia= Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
           return distancia;
       }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }
       
}

