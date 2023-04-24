
package ejer1adi;

import ejer1adi.newpackage.Cancion;


public class Ejer1adi {

   
    public static void main(String[] args) {
      Cancion song=new Cancion();
      song.setTítulo("Ninguno");
      song.setAutor("Sin autor");
        System.out.println("Título "+song.getTítulo());
        System.out.println("Autor "+song.getAutor());
        Cancion song2=new Cancion("Enter Sandman", "Metallica");
        System.out.println("Título: "+song2.getTítulo());
        System.out.println("Autor: "+song2.getAutor());
    }
    
}
