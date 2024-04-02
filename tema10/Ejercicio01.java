import java.util.ArrayList;

/**
 * Crea un ArrayList con los nombres de 6 compañeros de clase. A continuación, muestra esos 
 * nombres por pantalla. Utiliza para ello un bucle for que recorra todo el ArrayList sin usar 
 * ningún índice
 * @author Antonio J.Sánchez
 * @author José David Quero
 */

public class Ejercicio01 {
    
    public static void main(String[] args) {
     
        ArrayList<String> alumnos = new ArrayList<String>() ;

        alumnos.add("Antonio") ;
        alumnos.add("Zarco") ;
        alumnos.add("Ruyi") ;
        alumnos.add("Paco que está loco y orgulloso de ello") ;
        alumnos.add("Sandra") ;
        alumnos.add("Lola Lolito") ;

        for(String item: alumnos) {
            System.out.println(item) ;
        }

    }


}
