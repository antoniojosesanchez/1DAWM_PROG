import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Realiza un programa que lea el fichero creado en el ejercicio anterior y 
 * que muestre los números por pantalla.
 */
public class Ejercicio02 {
    

    public static void main(String[] args) {

        String linea = "" ;

        try {

            FileReader archivo = new FileReader("primos.dat") ;
            BufferedReader br  = new BufferedReader(archivo) ;

            linea = br.readLine() ;

            /* while(linea!=null) {
                System.out.println(linea);
                linea = br.readLine() ;
            } */

            do {                
                System.out.println(linea);
                linea = br.readLine() ;
            } while(linea!=null) ;

            br.close();

        } catch(FileNotFoundException fnfe) {
            System.out.println("El archivo no se puede abrir.");
        } catch (IOException ioe) {
            System.out.println("Imposible acceder al fichero.");
        }
        
    }
}
