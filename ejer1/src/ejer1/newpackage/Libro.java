
package ejer1.newpackage;

import java.util.Scanner;
public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private int paginas;

    public Libro(String isbn, String titulo, String autor, int paginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public Libro() {
    }
    public void cargarlibro(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el ISBN del libro: ");
        isbn = scanner.nextLine();
        System.out.print("Ingrese el título del libro: ");
        titulo = scanner.nextLine();
        System.out.print("Ingrese el autor del libro: ");
        autor = scanner.nextLine();
        System.out.print("Ingrese el número de páginas del libro: ");
        paginas = scanner.nextInt();
    }
     public void informarLibro() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + paginas);
    }
}
