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
    static Libro[] libros = new Libro[100];
    static int contLibros = 0;
    static Disco[] discos = new Disco[100];
    static int contDiscos = 0;
    static Pelicula[] peliculas = new Pelicula[100];
    static int contPeliculas = 0;

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
            System.out.println("4.- Reportes");
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
            System.out.println("6.- Salir de la aplicacion");
            System.out.println("Opción: ");

            opcionCrear = leerEntero();

            switch (opcionCrear) {
                case 1:
                    crearArtista();
                    break;
                case 2:
                    crearLibro();
                    break;
                case 3:
                     crearDisco();
                     break;
                case 4:
                     crearPelicula();
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
                    buscarLibro();
                    break;
                case 2:
                   buscarDisco();
                    break;
                 case 3:
                   buscarPelicula();
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
                    consultarLibro();
                    break;
                case 2:
                    consultarDisco();
                    break;
                case 3:
                    consultarPelicula();
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
            System.out.println("3.- Buscar todas las obras de un autor");
            System.out.println("4.- Buscar todas las peliculas de un autor");            
            System.out.println("5.- Volver al menú principal");
            System.out.println("6.- Salir de la aplicación");
            System.out.println("Opción: ");

            opcionListado = leerEntero();

            switch (opcionListado) {
                case 1:
                    listadoObras();
                    break;
                case 2:
                   listadoPeliculas();
                    break;   
                case 3:
                   obrasAutor();
                    break;
                case 4:
                   peliculasAutor();
                    break;                                                    
                case 5:
                    menuPrincipal();
                    break;
                case 6:
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
    
    static void crearLibro(){
        if(contArtistas==0){
            System.out.println("No puede crear un libro ya que no hay artistas registrados.");
        }else{
            String resp = "";            
            do
            {                            
                String nombreLibro;
                int anhoEdicion;
                int indiceArtista;
                String editorial;
                int numeroPaginas;
                System.out.println("\nIntroduzca titulo del Libro: "); 
                nombreLibro = leerString();
                System.out.println("Introduzca el año de edición: "); 
                anhoEdicion = leerEntero();
                System.out.println("Indique el Número Asociado al artista autor del libro: "); 
                for(int a=0;a<contArtistas;a++){
                    System.out.println((a+1)+".- "+artistas[a].getNombre());
                }
                indiceArtista = leerEntero();
                System.out.println("Introduzca la editorial del libro: "); 
                editorial = leerString();       
                System.out.println("Introduzca el número de páginas del libro: ");
                numeroPaginas = leerEntero();                                     
                libros[(contLibros)]= new Libro(nombreLibro,artistas[(indiceArtista-1)], anhoEdicion, editorial, numeroPaginas);            
                System.out.println("Libro Creado Satisfactoriamente con los siguientes datos: ");
                System.out.println("Titulo: "+libros[contLibros].getTitulo()+" Autor: "+libros[contLibros].getAutor().getNombre()+" Año de Edicion: "+libros[contLibros].getAnhoEdicion()+" Editorial: "+libros[contLibros].getEditorial()+" Paginas: "+libros[contLibros].getNPaginas());
                contLibros++;
                System.out.println("Desea seguir creando Libros? (Si/No)");
                resp = leerString();                
                }while(resp.compareToIgnoreCase("si") == 0);
            
        }
    }
    
    static void crearDisco(){
        if(contArtistas==0){
            System.out.println("No puede crear un Disco ya que no hay artistas registrados.");
        }else{
            String resp = "";            
            do
            {                            
                String tituloDisco;
                int anhoEdicion;
                int indiceArtista;
                String discografica;
                int numeroCanciones;
                System.out.println("\nIntroduzca titulo del Disco: "); 
                tituloDisco = leerString();
                System.out.println("Introduzca el año de edición: "); 
                anhoEdicion = leerEntero();
                System.out.println("Indique el Número Asociado al artista creador del Disco: "); 
                for(int a=0;a<contArtistas;a++){
                    System.out.println((a+1)+".- "+artistas[a].getNombre());
                }
                indiceArtista = leerEntero();
                System.out.println("Introduzca el nombre de la discografica del Disco: "); 
                discografica = leerString();       
                System.out.println("Introduzca el número de canciones del Disco: ");
                numeroCanciones = leerEntero();                                     
                discos[(contDiscos)]= new Disco(tituloDisco,artistas[(indiceArtista-1)], anhoEdicion, discografica, numeroCanciones);            
                System.out.println("Disco Creado Satisfactoriamente con los siguientes datos: ");
                System.out.println("Titulo: "+discos[contLibros].getTitulo()+" Autor: "+discos[contLibros].getAutor().getNombre()+" Año de Edicion: "+discos[contLibros].getAnhoEdicion()+" Discografica: "+discos[contLibros].getDiscografica()+" Numero de Canciones: "+discos[contLibros].getNCanciones());
                contDiscos++;
                System.out.println("Desea seguir creando Discos? (Si/No)");
                resp = leerString();                
                }while(resp.compareToIgnoreCase("si") == 0);            
        }
    }   
    
    
    static void crearPelicula(){
        if(contArtistas==0){
            System.out.println("No puede crear una Pelicula ya que no hay artistas registrados.");
        }else{
            String resp = "";            
            do
            {                            
                String tituloPelicula;
                int anhoEdicion;
                int indiceArtista;
                String productora;
                String indiceElenco;
                                                
                System.out.println("\nIntroduzca titulo de la Pelicula: "); 
                tituloPelicula = leerString();
                System.out.println("Introduzca el año de edición: "); 
                anhoEdicion = leerEntero();
                System.out.println("Indique el Número Asociado al artista autor de la pelicula: "); 
                for(int a=0;a<contArtistas;a++){
                    System.out.println((a+1)+".- "+artistas[a].getNombre());
                }
                indiceArtista = leerEntero();
                System.out.println("Introduzca el nombre de la productora de la Pelicula: "); 
                productora = leerString();
                System.out.println("Indique los numeros separados por comas de los artitas que conformaron el elenco de la pelicula: ");                
                for(int a=0;a<contArtistas;a++){
                    System.out.println((a+1)+".- "+artistas[a].getNombre());
                }
                indiceElenco = leerString();
                
                String[] arrayElenco = indiceElenco.split(",");
                Artista[] elenco = new Artista[arrayElenco.length];
                
                for(int e=0;e<arrayElenco.length;e++){
                    elenco[e]=artistas[(Integer.parseInt(arrayElenco[e])-1)];  
                }
                                                
                peliculas[(contPeliculas)] = new Pelicula(tituloPelicula,artistas[(indiceArtista-1)], anhoEdicion, productora, elenco);            
                System.out.println("Pelicula Creada Satisfactoriamente con los siguientes datos: ");
                System.out.println("Titulo: "+peliculas[contPeliculas].getTitulo()+" Autor: "+peliculas[contPeliculas].getAutor().getNombre()+" Año de Edicion: "+peliculas[contPeliculas].getAnhoEdicion()+" Productora: "+peliculas[contPeliculas].getProductora());
                System.out.println("Elenco: ");
                for(int e=0; e < peliculas[contPeliculas].getInterpretes().length; e++){
                    System.out.println("--> "+peliculas[contPeliculas].getInterpretes()[e].getNombre());
                }                
                contPeliculas++;
                System.out.println("Desea seguir creando Peliculas? (Si/No)");
                resp = leerString();                
                }while(resp.compareToIgnoreCase("si") == 0);            
        }
    }        
    
    /* --------------------- ----- -------------------- */
    /* --------------------- ----- -------------------- */
    /* ------------ Opciones de Busqueda -------------- */
    /* --------------------- ----- -------------------- */
    /* --------------------- ----- -------------------- */    
    
    static void consultarLibro(){
        if(contLibros>0){
            String tituloAux;
            System.out.println("\nIngrese el titulo del libro que desea consultar");
            tituloAux=leerString();
            int bandBusqueda=0;
            
            for(int i=0;i<contLibros;i++){            
                if(libros[i].getTitulo().compareToIgnoreCase(tituloAux)==0){
                    System.out.println("Para el libro: "+libros[i].getTitulo()+" La Editorial es: "+libros[i].getEditorial()+" Y el numero de paginas son: "+libros[i].getNPaginas());
                    bandBusqueda=1;
                }        
            }
            
            if(bandBusqueda==0){
                System.out.println("No se encontarron libros con el titulo "+tituloAux);
            }
        }else{
            System.out.println("No hay libros registrados para consultar.");             
        }        
    }
    
    static void consultarDisco(){
        if(contDiscos>0){                    
            String tituloAux;
            System.out.println("\nIngrese el titulo del disco que desea consultar");
            tituloAux=leerString();
            int bandBusqueda=0;
        
            for(int i=0;i<contDiscos;i++){            
                if(discos[i].getTitulo().compareToIgnoreCase(tituloAux)==0){
                    System.out.println("Para el disco: "+discos[i].getTitulo()+" La Discografica es: "+discos[i].getDiscografica()+" Y el numero de canciones es: "+discos[i].getNCanciones());
                    bandBusqueda=1;
                }        
            }
        
            if(bandBusqueda==0){
                System.out.println("No se encontraron discos con el titulo "+tituloAux);
            }        
            }else{
                System.out.println("No hay Discos registrados para consultar."); 
            }
    }
        
    
    static void consultarPelicula(){
        if(contPeliculas>0){
            String tituloAux;
            System.out.println("\nIngrese el titulo de la pelicula que desea consultar");
            tituloAux=leerString();
            int bandBusqueda=0;
            
            for(int i=0;i<contPeliculas;i++){            
                if(peliculas[i].getTitulo().compareToIgnoreCase(tituloAux)==0){
                    System.out.println("Para la pelicula: "+peliculas[i].getTitulo()+" La productora es: "+peliculas[i].getProductora());
                    bandBusqueda=1;
                }        
            }
            
            if(bandBusqueda==0){
                System.out.println("No se encontraron peliculas con el titulo "+tituloAux);
            } 
            }else{
                 System.out.println("No hay Peliculas registradas para consultar."); 
            }
    } 
    
static void buscarLibro(){
    
       if (contLibros > 0) {
            String tituloBus;
            System.out.println("\nIngrese el titulo del libro que desea Buscar");
            tituloBus = leerString();
            int bandBusqueda = 0;

            for (int i = 0; i < contLibros; i++) {
                if (libros[i].getTitulo().compareToIgnoreCase(tituloBus.trim()) == 0) {

                    System.out.println("----------------------------------------------");
                    System.out.println("Informacion del Libro " + libros[i].getTitulo());
                    System.out.println("----------------------------------------------");
                    System.out.println("");
                    System.out.println("Editorial: " + libros[i].getEditorial());
                    System.out.println("Autor: " + libros[i].getAutor().getNombre());
                    System.out.println("Anho Edicion: " + libros[i].getAnhoEdicion());
                    System.out.println("Numero Paginas: " + libros[i].getNPaginas());
                    bandBusqueda = 1;
                }
            }

            if (bandBusqueda == 0) {
                System.out.println("No se encontarron libros con el titulo " + tituloBus);
            }
        } else {
            System.out.println("No hay libros registrados para buscar.");
        }
    
    
    
}
  static void buscarDisco(){
    
       if (contDiscos > 0) {
            String nombreBus;
            System.out.println("\nIngrese el titulo del Disco que desea Buscar");
            nombreBus = leerString();
            int bandBusqueda = 0;

            for (int i = 0; i < contDiscos; i++) {
                if (discos[i].getTitulo().compareToIgnoreCase(nombreBus.trim()) == 0) {

                    System.out.println("----------------------------------------------");
                    System.out.println("Informacion del Disco " + discos[i].getTitulo());
                    System.out.println("----------------------------------------------");
                    System.out.println("");
                    System.out.println("Autor: " + discos[i].getAutor().getNombre());
                    System.out.println("Discografica: " + discos[i].getDiscografica());
                    System.out.println("Anho Edicion: " + discos[i].getAnhoEdicion());
                    System.out.println("Numero Canciones: " + discos[i].getNCanciones());
                    bandBusqueda = 1;
                }
            }

            if (bandBusqueda == 0) {
                System.out.println("No se encontarron discos con el titulo " + nombreBus);
            }
        } else {
            System.out.println("No hay Discos registrados para buscar.");
        }
    
    
    
}  
   static void buscarPelicula(){
        if(contPeliculas>0){
            String tituloBus;
            System.out.println("\nIngrese el titulo de la pelicula que desea consultar");
            tituloBus=leerString();
            int bandBusqueda=0;
            
            for(int i=0;i<contPeliculas;i++){            
                  if (peliculas[i].getTitulo().compareToIgnoreCase(tituloBus.trim()) == 0) {

                    System.out.println("----------------------------------------------");
                    System.out.println("Informacion de la Pelicula " + peliculas[i].getTitulo());
                    System.out.println("----------------------------------------------");
                    System.out.println("");
                    System.out.println("Autor: " + peliculas[i].getAutor().getNombre());
                    System.out.println("Productora: " + peliculas[i].getProductora());
                     System.out.println("Anho Edicion: " + peliculas[i].getAnhoEdicion());
                    System.out.println("Artistas: ");
               
                    Artista[] auxListaInterpretes=peliculas[i].getInterpretes();
                    
                     for (int j = 0; j < auxListaInterpretes.length; j++) {
                         
                          Artista artista = auxListaInterpretes[j];
                         System.out.println("Nombre: "+artista.getNombre());
                         System.out.println("Anho Nacimiento: "+artista.getAnhoNacimiento());
                         System.out.println("");
                          
                      }
                    
                    bandBusqueda = 1;
                }      
            }
            
            if(bandBusqueda==0){
                System.out.println("No se encontraron peliculas con el titulo "+tituloBus);
            } 
            }else{
                 System.out.println("No hay Peliculas registradas para buscar."); 
            }
    } 
    public static void inicializarVectorArtistas(Artista[] vec) {
        for (int i = 0; i < vec.length; i++) {
            vec[i] = new Artista();
            vec[i].setNombre("");
            vec[i].setAnhoNacimiento(-1);
        }
    }
    /* --------------------- ----- -------------------- */
    /* --------------------- ----- -------------------- */
    /* ------------ Opciones de Listado -------------- */
    /* --------------------- ----- -------------------- */
    /* --------------------- ----- -------------------- */  
     static void listadoObras(){
         
          if (contDiscos > 0) {
            System.out.println("----------------------------------------------");
             System.out.println("Listado de Discos");
             System.out.println("----------------------------------------------");
          
            for (int i = 0; i < contDiscos; i++) {
               
                    System.out.println("----------------------------------------------");
                    System.out.println("Informacion del Disco " + discos[i].getTitulo());
                    System.out.println("----------------------------------------------");
                    System.out.println("");
                    System.out.println("Autor: " + discos[i].getAutor().getNombre());
                    System.out.println("Discografica: " + discos[i].getDiscografica());
                    System.out.println("Anho Edicion: " + discos[i].getAnhoEdicion());
                    System.out.println("Numero Canciones: " + discos[i].getNCanciones());
                
            }

            
        } else {
            System.out.println("No hay Discos registrados.");
        }
         if (contLibros > 0) {
           System.out.println("----------------------------------------------");
             System.out.println("Listado de Libros");
             System.out.println("----------------------------------------------");
          
         
            for (int i = 0; i < contLibros; i++) {
             
                    System.out.println("----------------------------------------------");
                    System.out.println("Informacion del Libro " + libros[i].getTitulo());
                    System.out.println("----------------------------------------------");
                    System.out.println("");
                    System.out.println("Editorial: " + libros[i].getEditorial());
                    System.out.println("Autor: " + libros[i].getAutor().getNombre());
                    System.out.println("Anho Edicion: " + libros[i].getAnhoEdicion());
                    System.out.println("Numero Paginas: " + libros[i].getNPaginas());
               
            }

           
        } else {
            System.out.println("No hay libros registrados.");
        } 
         
         
     
     }
      static void listadoPeliculas(){
         
         if(contPeliculas>0){
             System.out.println("----------------------------------------------");
             System.out.println("Listado de Peliculas");
             System.out.println("----------------------------------------------");
                  
             for(int i=0;i<contPeliculas;i++){            
                 
                    System.out.println("----------------------------------------------");
                    System.out.println("Nombre: " + peliculas[i].getTitulo());
                    System.out.println("----------------------------------------------");
                    System.out.println("");
                    System.out.println("Autor: " + peliculas[i].getAutor().getNombre());
                    System.out.println("Productora: " + peliculas[i].getProductora());
                     System.out.println("Anho Edicion: " + peliculas[i].getAnhoEdicion());
                    System.out.println("Artistas: ");
               
                    Artista[] auxListaInterpretes=peliculas[i].getInterpretes();
                    
                     for (int j = 0; j < auxListaInterpretes.length; j++) {
                         
                          Artista artista = auxListaInterpretes[j];
                         System.out.println("Nombre: "+artista.getNombre());
                         System.out.println("Anho Nacimiento: "+artista.getAnhoNacimiento());
                         System.out.println("");
                          
                      }
                    
                  
                }      
            
            
            
            }else{
                 System.out.println("No hay Peliculas registradas."); 
            }
         
         
         
     
     }
    
    static void obrasAutor()
    {
       
        String autorBus;
        System.out.println("\nIngrese el nombre  del Autor que desea Consultar");
        autorBus = leerString();
        int bandBusqueda = 0;
        
        if (contLibros > 0) {

            System.out.println("----------------------------------------------");
            System.out.println("Libros " );
            System.out.println("----------------------------------------------");
                 
            for (int i = 0; i < contLibros; i++) {
                if (libros[i].getAutor().getNombre().compareToIgnoreCase(autorBus.trim()) == 0) {

                    System.out.println("----------------------------------------------");
                    System.out.println("Informacion del Libro " + libros[i].getTitulo());
                    System.out.println("----------------------------------------------");
                    System.out.println("");
                    System.out.println("Editorial: " + libros[i].getEditorial());
                    System.out.println("Anho Edicion: " + libros[i].getAnhoEdicion());
                    System.out.println("Numero Paginas: " + libros[i].getNPaginas());
                    bandBusqueda = 1;
                }
            }

            if (bandBusqueda == 0) {
                System.out.println("No se encontarron libros del autor " + autorBus);
            }
        } 
    
         if (contDiscos > 0) {
            System.out.println("----------------------------------------------");
            System.out.println("Discos " );
            System.out.println("----------------------------------------------");
          

            for (int i = 0; i < contDiscos; i++) {
                if (discos[i].getAutor().getNombre().compareToIgnoreCase(autorBus.trim()) == 0) {

                    System.out.println("----------------------------------------------");
                    System.out.println("Informacion del Disco " + discos[i].getTitulo());
                    System.out.println("----------------------------------------------");
                    System.out.println("");
                    System.out.println("Discografica: " + discos[i].getDiscografica());
                    System.out.println("Anho Edicion: " + discos[i].getAnhoEdicion());
                    System.out.println("Numero Canciones: " + discos[i].getNCanciones());
                    bandBusqueda = 1;
                }
            }

            if (bandBusqueda == 0) {
                System.out.println("No se encontarron discos del autor" + autorBus);
            }
        } 
        
        
    }
      static void peliculasAutor()
    {
       
        String autorBus;
        System.out.println("\nIngrese el nombre  del Autor que desea Consultar");
        autorBus = leerString();
        int bandBusqueda = 0;
        
       if(contPeliculas>0){
           
            
            for(int i=0;i<contPeliculas;i++){            
                  if (peliculas[i].getAutor().getNombre().compareToIgnoreCase(autorBus.trim()) == 0) {

                    System.out.println("----------------------------------------------");
                    System.out.println("Pelicula " + peliculas[i].getTitulo());
                    System.out.println("----------------------------------------------");
                    System.out.println("");
                    System.out.println("Productora: " + peliculas[i].getProductora());
                    System.out.println("Anho Edicion: " + peliculas[i].getAnhoEdicion());
                    System.out.println("Artistas: ");
               
                    Artista[] auxListaInterpretes=peliculas[i].getInterpretes();
                    
                     for (int j = 0; j < auxListaInterpretes.length; j++) {
                         
                          Artista artista = auxListaInterpretes[j];
                         System.out.println("Nombre: "+artista.getNombre());
                         System.out.println("Anho Nacimiento: "+artista.getAnhoNacimiento());
                         System.out.println("");
                          
                      }
                   bandBusqueda = 1; 
                  
                }      
            }
            
                if(bandBusqueda==0){
                    System.out.println("No se encontraron peliculas del autor "+autorBus);
                } 
            }
        
    } 
    
    public static void main(String[] args) {

        //Variables para creación de artistas
        artistas = new Artista[3];
        inicializarVectorArtistas(artistas);
        contArtistas = 0;
        
        menuPrincipal();
    }
}
