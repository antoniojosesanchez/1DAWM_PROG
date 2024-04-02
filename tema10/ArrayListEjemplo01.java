/**
 * @author Antonio J.Sánchez
 * @author José David Quero
 */

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEjemplo01 {

    public static void main(String[] args) {

        //
        ArrayList<String> colores = new ArrayList<String>() ;

        // mostramos el tamaño de la lista
        System.out.println("Número de elementos: " + colores.size());
        
        // añadir elementos
        colores.add("Rojo") ;
        colores.add("Morado") ;
        colores.add("Naranja") ;
        colores.add("Azul") ;
        colores.add("Verde") ;
        colores.add("Amarillo") ;

        // mostramos el tamaño de la lista
        System.out.println("Número de elementos: " + colores.size());
        System.out.println("El elemento que está en la posición 2 es: " + colores.get(2));

        colores.add(0, "Marrón") ;
        System.out.println("El elemento que está en la posición 0 es: " + colores.get(0));
        System.out.println("El elemento que está en la posición 2 es: " + colores.get(2));
        //System.out.println("El elemento que está en la posición 2 es: " + colores.get(12));
        
        //colores.remove(6) ;

        // Ordenamos la colección
        Collections.sort(colores) ;

         //
         System.out.println("Después de ORDENACIÓN\n====================="); 
        
        // Como la clase ArrayList es ITERABLE podemos mostrar todos los colores
        // de la siguiente manera
        for(String item: colores) {
            System.out.println(item);
        }

        //
        colores.removeIf( (String color) ->  color.length() > 6 ) ;

        //
        System.out.println("Después de REMOVEIF\n====================="); 

        // Como la clase ArrayList es ITERABLE podemos mostrar todos los colores
        // de la siguiente manera
        for(String item: colores) {
            System.out.println(item);
        }
    }
    
}
