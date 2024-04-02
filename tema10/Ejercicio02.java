import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un ArrayList y que 
 * luego calcule la suma, la media, el máximo y el mínimo de esos números. El tamaño de la lista 
 * también será aleatorio y podrá oscilar entre 10 y 20 elementos ambos inclusive.
 * @author Antonio J.Sánchez
 * @author José David Quero
 */
public class Ejercicio02 {

    public static void main(String[] args) {

        int i ;
        int minimo = 100;
        int maximo = 0;
        int suma = 0 ;
        int capacidad = (int) (Math.random() * 11 + 10) ;
        ArrayList<Integer> numeros = new ArrayList<Integer>() ;

        // Guardamos tantos números aleatorios como indique la capacidad
        for(i=0; i < capacidad; i++) {
            numeros.add((int) (Math.random() * 101)) ;
        }

        for(int item: numeros) {
            suma += item ;

            // comprobamos el mínimo
            if(item < minimo) { minimo = item ; }

            // comprobamos el máximo
            if(item > maximo) { maximo = item ; }

            System.out.println(item) ;
        }
        

        System.out.printf("Suma  : %d\n", suma);
        System.out.printf("Media : %.2f\n", (float) suma/capacidad);
        System.out.printf("Máximo: %d\n", maximo);
        System.out.printf("Mínimo: %d\n", minimo);
        
    }
    
}
