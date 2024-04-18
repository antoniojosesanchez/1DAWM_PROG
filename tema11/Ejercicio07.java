import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.imageio.stream.ImageOutputStreamImpl;

import clases.Diccionario;

/**
 * Crea un programa que recupere la información de un diccionario español-inglés a partir de un 
 * fichero cuyo nombre se proporciona por línea de comando y lo almacene en un objeto de la 
 * clase HashMap.
 * 
 * - Si el fichero no existe, el programa mostrará un mensaje indicando que dicho fichero no 
 * existe.
 * - El programa pedirá una palabra en español y dará la correspondiente traducción en inglés. Si 
 * no está en el diccionario, responderá con un mensaje indicando que dicha palabra no existe en 
 * el diccionario.
 * 
 * - El programa permitirá añadir nuevas palabras al diccionario, almacenándolas tanto en el 
 * objeto HashMap como en el fichero.
 * 
 * - De forma adicional, si por línea de comando, además del nombre del fichero, se indica una 
 * palabra en español y su correspondiente en inglés, directamente se añadirán al fichero sin 
 * realizar ninguna otra acción.
 * 
 * @author Antonio J.Sánchez
 * @author José David Quero
 */

public class Ejercicio07 {

    public static void main(String[] args) {
        
        int opcion ;
        Diccionario diccionario ;

        if (args.length == 0) {
            System.out.println("No se ha proporcionado nombre de archivo.");
        } else {

            diccionario = new Diccionario() ;
            diccionario.cargar(args[0]) ;

            do {

                menu() ;
                opcion = Integer.parseInt(System.console().readLine()) ;

                switch(opcion) {

                    case 0: 
                        diccionario.guardar(args[0]) ;
                    break ; 

                    // BUSCAR SIGNIFICADO
                    case 1: 
                        buscarSignificado(diccionario) ;
                    break ;

                    // AÑADIR PALABRA
                    case 2: 
                        aniadirPalabra(diccionario) ;
                    break ;
                    default:
                        System.out.println("La opción es incorrecta.") ;
                }

            } while (opcion != 0 ) ;           
        }
    }

    /**     
     */
    private static void menu() {

        System.out.println("\n") ;
        System.out.println("0. Salir") ;
        System.out.println("1. Buscar significado") ;
        System.out.println("2. Añadir palabra") ;
        System.out.print("\nOpción? ") ;

    }

    /**     
     * @param diccionario
     */
    private static void buscarSignificado(Diccionario diccionario) {

        String palabra ;

         // buscamos una palabra
         System.out.print("Introduce una palabra en español: ");
         palabra = System.console().readLine() ;
         if (diccionario.buscar(palabra)) {
             System.out.println("El significado es: " + diccionario.significado(palabra));
         } else {
             System.out.println("La palabra " + palabra + " no se encuentra en el diccionario.");
         }
    }

    /**     
     * @param diccionario
     */
    private static void aniadirPalabra(Diccionario diccionario) {

        String palabra  ;
        String significado ;

        System.out.print("Introduce una palabra en español: ");
        palabra = System.console().readLine() ;

        System.out.print("Introduce una palabra en inglés: ");
        significado = System.console().readLine() ;

        meterPalabraYSignificado(diccionario, palabra, significado, false);

    }

    private static void meterPalabraYSignificado(Diccionario diccionario, 
                                                 String palabra, String significado,
                                                 boolean guardar) {

        if(diccionario.buscar(palabra)) {
            System.out.println("La palabra " + palabra + " ya existe en el diccionario.");
        } else {
            diccionario.aniadir(palabra, significado) ;

            //if (guardar) diccionario.guardar(significado);
        }
        
    }
    
}
