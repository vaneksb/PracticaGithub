/*
 * ----PRACTICA GITHUB----
 * -------Autores-------
 * Angarita, Lakhsmi
 * Ramírez, Gerson
 * Suárez, Vanessa
 */
package PracticaGitHub;

public class Libro extends Obra {

    private String editorial;
    private int nPaginas;

    //Constructor por defecto
    public Libro() {
    }

    //Constructor sobrecargado
    public Libro(String title, Artista autor, int anhoEdicion, String edit, int nPag) {
        super.setTitulo(title);
        super.setAutor(autor);
        super.setAnhoEdicion(anhoEdicion);
        this.editorial = edit;
        this.nPaginas = nPag;
    }

    //Método para obtener la editorial del libro
    String getEditorial() {
        return editorial;
    }

    //Método para establecer la editorial del libro
    void setEditorial(String edit) {
        this.editorial = edit;
    }

    //Método para obtener el núm de páginas del libro
    int getNPaginas() {
        return nPaginas;
    }

    //Método para establecer el núm de páginas del libro
    void setNPaginas(int nPag) {
        this.nPaginas = nPag;
    }

    //Método para imprimir reportes
    void imprimir() {
    }
}
