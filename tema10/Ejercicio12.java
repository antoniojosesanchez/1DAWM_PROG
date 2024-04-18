import java.util.ArrayList;
import java.util.HashMap;

import Clases.CartaEj12;

/**
 * Escribe un programa que genere una secuencia de 5 cartas de la baraja española y que sume los puntos según 
 * el juego de la brisca. El valor de las cartas se debe guardar en una estructura HashMap que debe contener 
 * parejas (figura, valor), por ejemplo (“caballo”, 3). La secuencia de cartas debe ser una estructura de la 
 * clase ArrayList que contiene objetos de la clase Carta. El valor de las cartas es el siguiente: as → 11, 
 * tres → 10, sota → 2, caballo → 3, rey → 4; el resto de cartas no vale nada.
 * 
 * @author Antonio J.Sánchez
 * @author José David Quero
 */
class Ejercicio12 {

    private static final int TOTAL = 5 ;

    private static HashMap<String, Integer> valorCartas ;
    private static ArrayList<CartaEj12> cartas ;

    public static void main(String[] args) {
        
        int puntuacion = 0 ;

        iniciarValorCartas() ;  // inicializamos las puntuaciones
        elegirCartas() ;        // elegimos cinco cartas al azar

        // calculamos las puntuaciones de las cartas 
        for(CartaEj12 item: cartas) {
            System.out.println(item) ;
            puntuacion += valorCartas.get(item.getFigura()) ;
        }

        System.out.println("Tienes " +  puntuacion + " puntos.");

    }

    /**
     * Inicializa la estructura y asigna las puntuaciones a las cartas
     */
    private static void iniciarValorCartas() {

        valorCartas = new HashMap<String, Integer>() ;

        valorCartas.put("as", 11) ;
        valorCartas.put("dos", 0) ;
        valorCartas.put("tres", 10) ;
        valorCartas.put("cuatro", 0) ;
        valorCartas.put("cinco", 0) ;
        valorCartas.put("seis", 0) ;
        valorCartas.put("siete", 0) ;
        valorCartas.put("sota", 2) ;
        valorCartas.put("caballo", 3) ;
        valorCartas.put("rey", 4) ;
    }

    /**
     * Elegimos cartas al azar y las guardamos en un arraylist
     */
    private static void elegirCartas() {

        int i ;
        CartaEj12 aux ;

        cartas = new ArrayList<CartaEj12>() ;

        // elegimos al primera carta y la añadimos
        aux = new CartaEj12() ;
        cartas.add(aux) ;

        for(i=1; i <= TOTAL; i++) {
            // generamos cartas hasta dar con una que no se haya elegido antes
            do { aux = new CartaEj12() ; } while(cartas.contains(aux)) ;

            // añadimos la carta elegida
            cartas.add(aux) ;
        }
    }

}