import java.util.ArrayList;

import clases.Carta;
import clases.Moneda;

/**
 * Realiza un programa que escoja al azar 10 cartas de la baraja española (10 objetos de la 
 * clase Carta). Emplea un objeto de la clase ArrayList para almacenarlas y asegúrate de que no 
 * se repite ninguna
 */
public class Ejercicio09 {
    

    public static void main(String[] args) {
        
        int i ;
        Carta carta ;
        ArrayList<Carta> lista = new ArrayList<Carta>() ;

        carta = new Carta() ;
        lista.add(carta) ;

        for(i = 0; i < 9; i++) {
            carta = new Carta() ;
        }

    }
}
