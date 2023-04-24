/*
 Desarrollar una clase Cancion con los siguientes atributos: título y autor. Se 
deberá definir además dos constructores: uno vacío que inicializa el título y el 
autor a cadenas vacías y otro que reciba como parámetros el título y el autor de
la canción. Se decberán además definir los métodos getters y setters correspondientes.

 */
package ejer1adi.newpackage;


public class Cancion {
    private String título;
    private String autor;
    public Cancion(){
        this.título=" ";
        this.autor=" ";
    }

    public Cancion(String título, String autor) {
        this.título = título;
        this.autor = autor;
    }

    public String getTítulo() {
        return título;
    }

    public String getAutor() {
        return autor;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
}
