import java.util.ArrayList;
import clases.Moneda;

/**
 * La máquina Eurocoin genera una moneda de curso legal cada vez que se pulsa un botón siguiendo 
 * la siguiente pauta: o bien coincide el valor con la moneda anteriormente generada - 1 
 * céntimo, 2 céntimos, 5 céntimos, 10 céntimos, 25 céntimos, 50 céntimos, 1 euro o 2 euros - o 
 * bien coincide la posición – cara o cruz. Simula, mediante un programa, la generación de 6 
 * monedas aleatorias siguiendo la pauta correcta. Cada moneda generada debe ser una instancia 
 * de la clase Moneda y la secuencia se debe ir almacenando en una lista.
 * 2 céntimos  - cara
 * 2 céntimos  - cruz
 * 50 céntimos - cruz
 * 
 * @author Antonio J.Sánchez
 * @author José David Quero
 */
public class Ejercicio07 {

    public static void main(String[] args) {
        
        int i ;
        Moneda moneda ;
        String posicion ;
        String cantidad ;        
        ArrayList<Moneda> lista = new ArrayList<Moneda>() ;

        // generamos la primera moneda al azar
        moneda = new Moneda() ;
        lista.add(moneda) ;

        posicion = moneda.getPosicion() ;
        cantidad = moneda.getCantidad() ;

        // generamos las otras monedas
        for(i=0; i<5; i++) {

            do {
                moneda = new Moneda() ;
            } while ((moneda.getPosicion() != posicion) && (moneda.getCantidad() != cantidad)) ;


            lista.add(moneda) ;

            posicion = moneda.getPosicion() ;
            cantidad = moneda.getCantidad() ;
        }

        
        // mostrar todas las monedas contenidas en la lista
        for(Moneda item: lista) {
            System.out.println(item) ;
        }
    }

}