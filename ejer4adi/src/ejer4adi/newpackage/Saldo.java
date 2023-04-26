
package ejer4adi.newpackage;

import java.util.Scanner;
public class Saldo {
    private double saldo;
    private double retiro;
    private double saldoNegativo;

public Saldo(){
    this.saldo=1000000.54;
    this.retiro=0;
    this.saldoNegativo=0;
}

    public Saldo(double saldo, double retiro, double saldoNegativo) {
        this.saldo = saldo;
        this.retiro = retiro;
        this.saldoNegativo = saldoNegativo;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getRetiro() {
        return retiro;
    }

    public double getSaldoNegativo() {
        return saldoNegativo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setRetiro(double retiro) {
        this.retiro = retiro;
    }

    public void setSaldoNegativo(double saldoNegativo) {
        this.saldoNegativo = saldoNegativo;
    }
public void retirarDinero() {
    Scanner input = new Scanner(System.in);
    double retiroTotal = 0;
    boolean retirando = true;
    
    while (retirando) {
        System.out.println("Ingrese la cantidad de dinero que desea retirar (0 para finalizar): ");
        double cantidadRetiro = input.nextDouble();
        
        if (cantidadRetiro == 0) {
            retirando = false;
        } else if (cantidadRetiro > saldo - retiroTotal) {
            System.out.println("No hay suficiente saldo disponible. El saldo disponible es: " + (saldo - retiroTotal));
        } else {
            retiroTotal += cantidadRetiro;
            System.out.println("Retiro exitoso de $" + cantidadRetiro + ". Saldo restante: $" + (saldo - retiroTotal));
        }
    }
}
}