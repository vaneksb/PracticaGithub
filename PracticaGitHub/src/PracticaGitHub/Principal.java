/*
 * ----PRACTICA GITHUB----
 * -------Autores-------
 * Angarita, Lakhsmi
 * Ramírez, Gerson
 * Suárez, Vanessa
 */
package PracticaGitHub;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal {

    static Artista[] artistas;
    static int contArtistas;

    //Metodo para leer la opción ingresada por teclado, para poder reutilizar
    //el código pues aplica en varios casos
    public static int leerEntero() {
        int op = 0;
        String lectura;
        try {
            InputStreamReader entrada = new InputStreamReader(System.in);
            BufferedReader teclado = new BufferedReader(entrada);
            lectura = teclado.readLine();
            op = Integer.parseInt(lectura);
        } catch (IOException ex) {
            System.out.println("ERROR !!!!!");
        }
        return op;
    }

    //Metodo para leer una palabra (String) por teclado, para poder reutilizar
    //el código pues aplica en varios casos
    public static String leerString() {
        String palabra = "";
        try {
            InputStreamReader entrada = new InputStreamReader(System.in);
            BufferedReader teclado = new BufferedReader(entrada);
            palabra = teclado.readLine();
        } catch (IOException ex) {
            System.out.println("ERROR !!!!!");
        }
        return palabra;
    }

    /* --------------------- ----- -------------------- */
    /* --------------------- ----- -------------------- */
    /* --------------------- MENUS -------------------- */
    /* --------------------- ----- -------------------- */
    /* --------------------- ----- -------------------- */
    static public void menuPrincipal() {
        int opcion = -1;
        do {
            System.out.println("\n-------MENÚ PRINCIPAL-------");
            System.out.println("1.- Crear nuevo artista/libro/disco/pelicula");
            System.out.println("2.- Buscar libro/disco/pelicula");
            System.out.println("3.- Consultar libro/disco/pelicula");
            System.out.println("4.- Listados");
            System.out.println("5.- Salir de la aplicación...");
            System.out.println("Opción: ");

            opcion = leerEntero();

            switch (opcion) {
                case 1:
                    menuCrear();
                    break;
                case 2:
                    menuBuscar();
                    break;
                case 3:
                    menuConsultar();
                    break;
                case 4:
                    menuListado();
                    break;
                case 5:
                    System.out.println("BYEEEEEEE...");
                    break;
                default:
                    System.out.println("Introduzca opción válida");
                    break;
            }
        } while (opcion != 5);
    }

    static public void menuCrear() {
        int opcionCrear = 0;
        do {
            System.out.println("\n-------MENÚ DE CREACIÓN-------");
            System.out.println("1.- Crear artista");
            System.out.println("2.- Crear libro");
            System.out.println("3.- Crear disco");
            System.out.println("4.- Crear película");
            System.out.println("5.- Volver al menú principal");
            System.out.println("6.- Salir de la aplicación");
            System.out.println("Opción: ");

            opcionCrear = leerEntero();

            switch (opcionCrear) {
                case 1:
                    crearArtista();
                    break;
                case 5:
                    menuPrincipal();
                    break;
                case 6:
                    System.out.println("BYEEEEE...");
                    break;
                default:
                    System.out.println("Introduzca una opción válida");
                    break;
            }
        } while (opcionCrear != 6);
    }

    static void menuBuscar() {
        int opcionBuscar = 0;
        do {
            System.out.println("\n-------MENÚ DE BÚSQUEDA-------");
            System.out.println("1.- Buscar libro");
            System.out.println("2.- Buscar disco");
            System.out.println("3.- Buscar película");
            System.out.println("4.- Buscar todas las obras de un autor");
            System.out.println("5.- Buscar todas las películas de un autor");
            System.out.println("6.- Volver al menú principal");
            System.out.println("7.- Salir de la aplicación");
            System.out.println("Opción: ");

            opcionBuscar = leerEntero();

            switch (opcionBuscar) {
                case 1:
                    System.out.println("Aqui todo para buscar libro");
                    break;
                case 2:
                    System.out.println("Aqui todo para buscar disco");
                    break;
                case 6:
                    menuPrincipal();
                    break;
                case 7:
                    System.out.println("BYEEEEEE...");
                    break;
                default:
                    System.out.println("Introduzca una opción válida");
                    break;
            }
        } while (opcionBuscar != 7);
    }

    static public void menuConsultar() {
        int opcionConsultar = 0;
        do {
            System.out.println("\n-------MENÚ DE CONSULTA-------");
            System.out.println("1.- Consultar editorial y número de páginas de un libro");
            System.out.println("2.- Consultar discográfica y canciones de un disco");
            System.out.println("3.- Consultar productora de una película");
            System.out.println("4.- Volver al menú principal");
            System.out.println("5.- Salir de la aplicación");
            System.out.println("Opción: ");

            opcionConsultar = leerEntero();

            switch (opcionConsultar) {
                case 1:
                    System.out.println("Opcion 1");
                    break;
                case 2:
                    System.out.println("Opcion 2");
                    break;
                case 3:
                    System.out.println("Opcion 3");
                    break;
                case 4:
                    menuPrincipal();
                    break;
                case 5:
                    System.out.println("BYEEEEE...");
                    break;
                default:
                    System.out.println("Introduzca una opción válida. (1 al 5)");
                    break;
            }
        } while (opcionConsultar != 5);
    }

    static public void menuListado() {
        int opcionListado = 0;
        do {
            System.out.println("\n-------MENÚ DE LISTADOS-------");
            System.out.println("1.- Listado de Obras");
            System.out.println("2.- Listado de Películas");
            System.out.println("3.- Volver al menú principal");
            System.out.println("4.- Salir de la aplicación");
            System.out.println("Opción: ");

            opcionListado = leerEntero();

            switch (opcionListado) {
                case 1:
                    System.out.println("Opcion 1");
                    break;
                case 2:
                    System.out.println("Opcion 2");
                    break;
                case 3:
                    menuPrincipal();
                    break;
                case 4:
                    System.out.println("BYEEEEE...");
                    break;
                default:
                    System.out.println("Introduzca una opción válida. (1 al 4)");
                    break;
            }
        } while (opcionListado != 5);
    }

    public static Artista[] aumentarVector(Artista[] vector) {
        Artista[] nuevoVector = new Artista[vector.length + 1];
        for (int i = 0; i < vector.length; i++) {
            //Se guardan en el vector nuevo, los artistas que ya estaban guardados
            if (vector[i] != null) {
                nuevoVector[i] = vector[i];
            }
        }
        //nuevoVector[i].setNombre("");
        //nuevoVector[i].setAnhoNacimiento(-1);
        
        //Se devuelve el nuevo vector con la posición adicional
        return nuevoVector;
    }

    /* --------------------- ----- -------------------- */
    /* --------------------- ----- -------------------- */
    /* ------------ Opciones de CREACION -------------- */
    /* --------------------- ----- -------------------- */
    /* --------------------- ----- -------------------- */
    static void crearArtista() {
        String resp = "";
        String nombreArtista = "";
        int anho = 0;
        //boolean posVacia = false;

        //Primero se busca la primera posición vacía del vector
        /*for (int i = 0; i < artistas.length && posVacia == false; i++) {
            //Se revisa cada pos del vector
            if (artistas[i].getAnhoNacimiento() == -1) {
                posVacia = true;
                contArtistas = i;
                //System.out.println("Cantidad de artistas hasta ahora: " + i+1);
            }
        }*/

        //Luego se empiezan a registrar los artistas
        do {
            //Si el vector de artistas ya está lleno
            if (contArtistas >= artistas.length) {
                //Se debe agregar una posición más al vector para poder guardar el nuevo
                artistas = aumentarVector(artistas);
            }

            System.out.println("\nIntroduzca nombre del artista: ");
            nombreArtista = leerString();
            System.out.println("Año de Nacimiento: ");
            anho = leerEntero();
            artistas[contArtistas] = new Artista(nombreArtista, anho);
            System.out.println("Nombre: " + artistas[contArtistas].getNombre() + " - Año: " + artistas[contArtistas].getAnhoNacimiento());
            contArtistas++;

            System.out.println("Desea seguir creando artistas? (Si/No)");
            resp = leerString();
        } while (resp.compareToIgnoreCase("si") == 0);
        
        System.out.println("\n-------Verificando correcta creacion de artistas-------");
                
        for (int i = 0; i < artistas.length; i++) {
            //Se guardan en el vector nuevo, los artistas que ya estaban guardados
            if (artistas[i] != null) {
                System.out.println("Artista Nro. " +i+" es "+artistas[i].getNombre()+" y nacio en "+artistas[i].getAnhoNacimiento());
            }
        }
    }

    public static void inicializarVectorArtistas(Artista[] vec) {
        for (int i = 0; i < vec.length; i++) {
            vec[i] = new Artista();
            vec[i].setNombre("");
            vec[i].setAnhoNacimiento(-1);
            //System.out.println("\nVec[" + i + "].nombre=" + vec[i].getNombre() + " / Vec[" + i + "].Anho=" + vec[i].getAnhoNacimiento());
        }
    }

    public static void main(String[] args) {

        artistas = new Artista[3];
        inicializarVectorArtistas(artistas);
        contArtistas = 0;
        menuPrincipal();
    }
}
