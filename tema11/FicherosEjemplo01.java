import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Antonio J.Sánchez
 * @author José David Quero
 */
class FicherosEjemplo01 {

    public static void main(String[] args) {
        
        try {

            FileReader archivo = new FileReader("esdla.txt") ;
            BufferedReader bf  = new BufferedReader(archivo) ;

            String linea = "" ;

            do {
                System.out.println(linea) ;
                linea = bf.readLine() ;
            } while(linea != null) ;

            bf.close() ;

        } catch(FileNotFoundException fnfe) {
            System.out.println("El archivo esdla.txt no se ha encontrado.");
        } catch(IOException ioe) {
            System.out.println("No se puede leer el fichero esdla.txt");
        }


    }

    
}