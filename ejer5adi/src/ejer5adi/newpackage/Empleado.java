
package ejer5adi.newpackage;

import java.util.Scanner;
public class Empleado {
    private int nrosEmpleados;
    private String[] nombre;
    private int[] edad;
    private int[] salario;

    public Empleado() {
    }

    public void setNrosEmpleados(int nrosEmpleados) {
        this.nrosEmpleados = nrosEmpleados;
    }

    public void setNombre(String[] nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int[] edad) {
        this.edad = edad;
    }

    public void setSalario(int[] salario) {
        this.salario = salario;
    }

    public int getNrosEmpleados() {
        return nrosEmpleados;
    }

    public String[] getNombre() {
        return nombre;
    }

    public int[] getEdad() {
        return edad;
    }

    public int[] getSalario() {
        return salario;
    }
    public void cantidadEmpleados(){
        Scanner input=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de empleados que hay en la empresa");
        nrosEmpleados=input.nextInt();  
        nombre=new String[nrosEmpleados];
        edad= new int[nrosEmpleados];
        salario= new int[nrosEmpleados];
    }
    public void atributos(){
        for (int i=0; i<nrosEmpleados; i++){
            System.out.println("Ingrese el nombre del empleado número: "+(i+1));
            Scanner input2=new Scanner(System.in);
            nombre[i]=input2.nextLine();
            System.out.println("Ahora ingrese la edad de: "+nombre[i]);
            edad[i]=input2.nextInt();
            System.out.println("Y por último ingrese el salario de: "+nombre[i]);
            salario[i]=input2.nextInt();
            input2.nextLine();
        }
    }
    public void calcular_aumento(){
        for (int i=0; i<nrosEmpleados;i++){
        
            double coefAumento;
           if (edad[i]>30){ 
          coefAumento=(salario[i]*0.1);
        }else {
            coefAumento=(salario[i]*0.05);
            
        }
           salario[i] += coefAumento;
            System.out.print("Como "+nombre[i]+" tiene "+edad[i]+" años, le corresponde un aumento");
            System.out.print(" y su nuevo salario es :"+ salario[i]);
            System.out.println();
        }
    }
    public void imprimirTodos(){
        System.out.println("Las fichas de cada empleado, con los sueldos actualizados serían: ");
        for (int i=0; i<nrosEmpleados;i++){
            System.out.println("Empleado número "+(i+1)+" : ");
            System.out.println("Nombre: "+nombre[i]);
            System.out.println("Edad: "+edad[i]);
            System.out.println("Salario: "+salario[i]);
        }
    }
    }

