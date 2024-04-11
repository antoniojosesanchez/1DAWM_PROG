import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Escribe un programa que ordene 10 números enteros introducidos por teclado y almacenados en 
 * un objeto de la clase ArrayList.
 * 
 * @author Antonio J.Sánchez
 * @author José David Quero
 */

public class Ejercicio03 {

    private static final int TAMANO = 10 ;
   
    public static void main(String[] args) {
        
        int i ;
        int num ;
        ArrayList<Integer> numeros = new ArrayList<Integer>() ;

        for(i=0; i<TAMANO; i++) {
            System.out.print("Introduce un número: ") ;
            num = Integer.parseInt(System.console().readLine()) ;

            numeros.add(num) ; 
        }

        // ordenamos la colección de números
        Collections.sort(numeros) ;

        // mostramos
        for(int item: numeros) {
            System.out.println(item) ;
        }
    }
}
