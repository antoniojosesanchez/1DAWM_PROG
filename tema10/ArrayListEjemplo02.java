/**
 * @author Antonio J.Sánchez
 * @author José David Quero
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListEjemplo02 {

    private static final int TAMANO = 5 ;
    public static void main(String[] args) {
        
        int i ;
        int edad ;
        String nombre ;
        ArrayList<Gato> mascotas = new ArrayList<Gato>() ;

        mascotas.add(new Gato("Silvestre", 11)) ;
        mascotas.add(new Gato("Garfield", 4)) ;
        mascotas.add(new Gato("Kevin", 8)) ;
        mascotas.add(new Gato("Mochi", 12)) ;
        mascotas.add(new Gato("Simba", 2)) ;


        /*for(i=0; i<TAMANO; i++) {
            System.out.println("GATO " + i) ;
            System.out.print("Introduce el nombre: ") ;
            nombre = System.console().readLine() ;

            System.out.print("Introduce la edad: ") ;
            edad = Integer.parseInt(System.console().readLine()) ;

            mascotas.add(new Gato(nombre, edad)) ; 
        }*/

        Collections.sort(mascotas) ;

        //Gato miGato = new Gato("miGato", 25) ;
        //Gato otroGato = new Gato("otroGato", 15) ;

        //System.out.println("COMPARACION: " + miGato.compareTo(otroGato)) ;
        

        // Mostramos los gatos
        for(Gato item:mascotas) { System.out.println(item); }
    }


    
}
