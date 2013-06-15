/*
 * ----PRACTICA GITHUB----
 * -------Autores-------
 * Angarita, Lakhsmi
 * Ramírez, Gerson
 * Suárez, Vanessa
 */
package PracticaGitHub;

public class Pelicula extends Obra {

    private String productora;
    private Artista[] interpretes;

    //Constructor por defecto
    public Pelicula() {
    }

    //Constructor sobrecargado
    public Pelicula(String title, Artista autor, int anhoEdicion, String produc, Artista[] interp) {
        super.setTitulo(title);
        super.setAutor(autor);
        super.setAnhoEdicion(anhoEdicion);
        this.productora = produc;
        this.interpretes = interp;
    }

    //Método para obtener los interpretes de la pelicula
    Artista[] getInterpretes() {
        
        return interpretes;
    }

    //Método para establecer la editorial del libro
    void setInterpretes(Artista[] vectorArtistas) {
    }

    //Método para obtener la productora de la pelicula
    String getProductora() {
        return productora;
    }

    //Método para establecer el núm de páginas del libro
    void setProductora(String prod) {
        this.productora = prod;
    }

    //Método para imprimir reportes
    void imprimir() {
    }
}
