import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Escribe un programa que guarde en un fichero con nombre primos.dat los 
 * números primos que hay entre 1 y 500.
 */
public class Ejercicio01 {

    public static void main(String[] args) {
        
        int i ;

        try {
            FileWriter archivo = new FileWriter("primos.dat") ;
            BufferedWriter bw  = new BufferedWriter(archivo) ;

            for(i=1; i<=500; i++) {

                if (esPrimo(i)) {
                    bw.write(Integer.valueOf(i) + "\n") ;
                }
            }

            bw.close() ;

        } catch(IOException ioe) {
            System.out.println("Se ha producido un fallo de acceso al archivo.") ;
        }
    }


    /**
     * Comprueba si un número es o no primo     
     * @param num
     * @return
     */
    private static boolean esPrimo(int num) {

        int i = 2 ;

        while ((i < num) && (num%i!=0)) { i++ ; }
        return (i == num) ;
    }
}
