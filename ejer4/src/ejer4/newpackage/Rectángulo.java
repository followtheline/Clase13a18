
package ejer4.newpackage;
import java.util.Scanner;
public class Rectángulo {
    private int base;  
    private int altura;
    public Rectángulo(){
        this.base=0;
        this.altura=0;
    }
    public void leer(){
        Scanner input=new Scanner(System.in);
        System.out.println("Ingrese la Base del Rectángulo");                
        int base=input.nextInt();
        System.out.println("Ingrese la Altura del Rectángulo");
        int altura=input.nextInt();
        this.base=base;
        this.altura=altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Rectángulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
   public double superficie(){
       return base*altura;
   }
   public double perimetro(){
       return (base+altura)*2;
   }
   public void dibujar(){
       for (int i=0;i<altura;i++){
           for (int j=0; j<base;j++){
               System.out.print("*"); 
           }
           System.out.println();
       }
   }
}
