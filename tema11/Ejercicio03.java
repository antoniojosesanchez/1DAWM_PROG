
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Escribe un programa que guarde en un fichero el contenido de otros dos 
 * ficheros, de tal forma que en el fichero resultante aparezcan las líneas 
 * de los primeros dos ficheros mezcladas, es decir, la primera línea será 
 * del primer fichero, la segunda será del segundo fichero, la tercera será 
 * la siguiente del primer fichero, etc.
 * 
 * Los nombres de los dos ficheros origen y el nombre del fichero destino se 
 * deben pasar como argumentos en la línea de comandos.
 * 
 * Hay que tener en cuenta que los ficheros de donde se van cogiendo las líneas 
 * pueden tener tamaños diferentes.
 * 
 * @author Antonio J. Sánchez
 * @author José David Quero
 */
public class Ejercicio03 {

    private static final String RUTA = "./ficheros/" ;
    private static final String ENTRADA1 = "primos.dat" ;
    private static final String ENTRADA2 = "fruta.txt" ;
    private static final String SALIDA   = "union.txt" ;

    public static void main(String[] args) {
        
        BufferedReader br1 ;
        BufferedReader br2 ;
        BufferedWriter bw  ;

        String lineaPrimo = "" ;
        String lineaFruta = "" ;

        boolean ok ;

        try {
            
            // abrimos los archivos para lectura
            br1 = new BufferedReader(new FileReader(args[0])) ;
            br2 = new BufferedReader(new FileReader(args[1])) ;

            // abrimos el archivo de salida
            bw  = new BufferedWriter(new FileWriter(args[2])) ;

            do {
                
                lineaPrimo = br1.readLine() ;
                lineaFruta = br2.readLine() ;

                ok = (lineaPrimo!=null) && (lineaFruta!=null) ;

                if (ok) {
                    bw.write(lineaFruta + "\n") ;
                    bw.write(lineaPrimo + "\n") ;               
                }
                
            } while(ok) ;

            // cerramos los manejadores de archivos
            br1.close(); 
            br2.close();
            bw.close() ; 

        } catch(FileNotFoundException fnfe) {
            System.out.println("Alguno de los archivos de entrada no se ha podido abrir.");
        } catch (IOException ioe) {
            System.out.println("Imposible acceder al fichero.");
        } catch (ArrayIndexOutOfBoundsException aiobe) {
            System.out.println("Faltan parámetros.");
            System.out.println("Sintaxis del comando (p.ej.):");
            System.out.println("Ejercicio03 entrada1.txt entrada2.txt salida.txt");
        }
    }
    
}
