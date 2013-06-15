/*
 * ----PRACTICA GITHUB----
 * -------Autores-------
 * Angarita, Lakhsmi
 * Ramírez, Gerson
 * Suárez, Vanessa
 */
package PracticaGitHub;

public class Obra {

    private String titulo;
    private Artista autor;
    private int anhoEdicion;

    //Método para obtener el título de la obra
    String getTitulo() {
        return titulo;
    }

    //Metodo para establecer el titulo de la obra
    void setTitulo(String title) {
        this.titulo = title;
    }

    //Metodo para obtener el autor de la obra
    Artista getAutor() {
        return autor;
    }

    //Metodo para establecer el autor de la obra
    void setAutor(Artista objArtista) {
        this.autor = objArtista;
    }

    //Metodo para obtener el año de edición de la obra
    int getAnhoEdicion() {
        return anhoEdicion;
    }

    //Metodo para establecer el año de edición de la obra
    void setAnhoEdicion(int anho) {
        this.anhoEdicion = anho;
    }
}
