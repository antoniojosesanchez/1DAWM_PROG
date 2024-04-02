import java.util.HashSet;
import java.util.Set;

/**
 * @author Antonio J.Sánchez
 * @author José David Quero
 */

public class HashSetEjemplo02 {
   
    public static void main(String[] args) {

        Set<Integer> a = new HashSet<Integer>() ;
        Set<Integer> b = new HashSet<Integer>() ;

        a.add(1) ;
        a.add(2) ;
        a.add(4) ;
        a.add(8) ;

        b.add(1) ;
        b.add(3) ;
        b.add(5) ;


        System.out.print("\nConjunto A: ");
        mostrar(a) ;

        System.out.print("\nConjunto B: ");
        mostrar(b) ;

        a.removeAll(b) ;
        System.out.print("\nConjunto A: ");
        mostrar(a) ;

        a.retainAll(b) ;
        System.out.print("\nConjunto A: ");
        mostrar(a) ;

        a.addAll(b) ;
        System.out.print("\nConjunto A: ");
        mostrar(a) ;


        

    }

    private static void mostrar(Set<Integer> conjunto) {
        for(int item: conjunto) { System.out.printf("%d  ", item); }
    }


}
