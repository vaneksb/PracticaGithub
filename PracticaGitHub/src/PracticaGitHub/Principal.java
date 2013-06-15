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

    static public int leerOpcion() {
        int op = 0;
        String lectura;
        try {
            InputStreamReader entrada = new InputStreamReader(System.in);
            BufferedReader teclado = new BufferedReader(entrada);
            lectura = teclado.readLine();
            op = Integer.parseInt(lectura);
        } 
        catch (IOException ex) {
            System.out.println("ERROR !!!!!");
        }
        return op;
    }
    
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

            opcion = leerOpcion();

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
        }while(opcion!=5);
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

            opcionCrear = leerOpcion();

            switch (opcionCrear) {
                case 1:
                    //crearArtista();
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

            opcionBuscar = leerOpcion();

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

            opcionConsultar = leerOpcion();

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

            opcionListado = leerOpcion();

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

    public static void main(String[] args) {
        menuPrincipal();
    }
}
