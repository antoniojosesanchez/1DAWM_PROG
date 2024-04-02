import java.util.HashSet;
import java.util.Set;

/**
 * @author Antonio J.Sánchez
 * @author José David Quero
 */

public class HashSetEjemplo01 {

    public static void main(String[] args) {
        
        HashSet<String> frutas = new HashSet<String>() ;

        frutas.add("Sandia") ;
        frutas.add("Mandarina") ;
        frutas.add("Melón") ;
        frutas.add("Arándanos") ;
        frutas.add("Kiwi") ;
        frutas.add("Mango") ;
        frutas.add("Fresa") ;
        frutas.add("Morango") ;
        frutas.add("Plátano") ;

        // ¿Contiene elementos?
        System.out.println("¿Contiene 'Manzana'? " + frutas.contains("Manzana"));
        System.out.println("¿Contiene 'Kiwi'? " + frutas.contains("Kiwi"));

        // Eliminamos una fruta
        frutas.remove("Kiwi") ;

        // Tamaño del conjunto
        System.out.println("Tamaño del conjunto tras eliminar el 'Kiwi': " + frutas.size());

        // Está vacío
        System.out.println("¿El conjunto está vacío? " + (frutas.isEmpty()?"Está vacío":"No está vacío"));

        // Mostramos los elementos
        System.out.println("Elementos del conjunto:");
        for(String item :frutas) { System.out.println(item) ; }

        //
        frutas.clear() ;

         // Está vacío
         System.out.println("¿El conjunto está vacío? " + (frutas.isEmpty()?"Está vacío":"No está vacío"));

    }
}
