/*
 * ----PRACTICA GITHUB----
 * -------Autores-------
 * Angarita, Lakhsmi
 * Ramírez, Gerson
 * Suárez, Vanessa
 */
package PracticaGitHub;

public class Disco extends Obra {

    private String discografica;
    private int nCanciones;

    //Constructor por defecto
    public Disco() {
    }

    //Constructor sobrecargado
    public Disco(String title, Artista autor, int anhoEdicion, String discograf, int nCanc) {
        super.setTitulo(title);
        super.setAutor(autor);
        super.setAnhoEdicion(anhoEdicion);
        this.discografica = discograf;
        this.nCanciones = nCanc;
    }

    //Método para obtener la discográfica del disco
    String getDiscografica() {
        return discografica;
    }

    //Método para establecer la discográfica del disco
    void setDiscografica(String discogra) {
        this.discografica = discogra;
    }

    //Método para obtener el Nro. de canciones del disco
    int getNCanciones() {
        return nCanciones;
    }

    //Método para establecer el Nro. de canciones del disco
    void setNCanciones(int nCanc) {
        nCanciones = nCanc;
    }

    //Método para imprimir datos del disco
    void imprimir() {
    }
}
