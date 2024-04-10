import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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

        try {

            // abrimos el archivo
            BufferedReader br = new BufferedReader(new FileReader(args[0])) ;

            // recuperamos la palabra a buscar
            palabra = args[1] ;

            while((linea = br.readLine())!=null) {
            
                // comprobamos si en la línea aparece la palabra
                while((i = linea.indexOf(palabra))!=-1) {
                    linea = linea.substring(i + palabra.length()) ;                
                    ocurrencias++ ;
                }

            }

            br.close() ;
 
            System.out.println("TOTAL OCURRENCIAS = " + ocurrencias) ;

        } catch(FileNotFoundException fnfe) {
            System.out.println("El archivo de entrada no se ha podido abrir.");
        } catch (IOException ioe) {
            System.out.println("Imposible acceder al fichero.");
        }


    }

}
