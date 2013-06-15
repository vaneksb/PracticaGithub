/*
 * ----PRACTICA GITHUB----
 * -------Autores-------
 * Angarita, Lakhsmi
 * Ramírez, Gerson
 * Suárez, Vanessa
 */
package PracticaGitHub;

public class Artista {

    private String nombre;
    private int anhoNacimiento;

    //Constructor por defecto
    Artista() {
    }

    //Constructor sobrecargado
    Artista(String nom, int anho) {
        this.nombre = nom;
        this.anhoNacimiento = anho;
    }

    //Método para obtener el año de nacimiento del artista
    int getAnhoNacimiento() {
        return anhoNacimiento;
    }

    //Metodo para establecer el año de nacimiento del artista
    void setAnhoNacimiento(int anho) {
        this.anhoNacimiento = anho;
    }

    //Metodo para obtener el nombre del artista
    String getNombre() {
        return nombre;
    }

    //Metodo para establecer el nombre del artista
    void setNombre(String nom) {
        this.nombre = nom;
    }    
}
