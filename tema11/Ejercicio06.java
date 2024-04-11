import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Realiza un programa que diga cuántas ocurrencias de una palabra hay en un fichero. 
 * Tanto el nombre del fichero como la palabra se deben pasar como argumentos en la 
 * línea de comandos.
 * 
 * java Ejercicio06.java fichero.txt palabra
 * 
 * @author Antonio J. Sánchez
 * @author José David Quero
 */

public class Ejercicio06 {
    
    public static void main(String[] args) {

        int i ;
        int ocurrencias = 0 ;

        String linea ;
        String palabra ;

        List<String> lista ;
        String[] palabras ;

        try {

            // abrimos el archivo
            BufferedReader br = new BufferedReader(new FileReader(args[0])) ;

            // recuperamos la palabra a buscar
            palabra = args[1] ;

            while((linea = br.readLine())!=null) {

                lista = Arrays.asList(linea.split("(\\s+|\\t|\\.|,|;)")) ;
                ocurrencias += Collections.frequency(lista, palabra) ;

                //palabras = linea.split("(\\s+|\\t|\\.|,|;)") ;
                //ocurrencias += contarPalabra(palabras, palabra) ;

                // comprobamos si en la línea aparece la palabra
                /*while((i = linea.indexOf(palabra))!=-1) {                    
                    linea = linea.substring(i + palabra.length()) ;                
                    ocurrencias++ ;
                }*/
            }

            br.close() ;
 
            System.out.println("TOTAL OCURRENCIAS = " + ocurrencias) ;

        } catch(FileNotFoundException fnfe) {
            System.out.println("El archivo de entrada no se ha podido abrir.");
        } catch (IOException ioe) {
            System.out.println("Imposible acceder al fichero.");
        }


    }

    /**     
     * @param pajar
     * @param aguja
     * @return
     */
    private static int contarPalabra(String[] pajar, String aguja) {

        int contador = 0 ;
        for(String item: pajar) {
            if (item.equals(aguja)) { contador++ ; }
        }

        return contador ;
    }

}
