/**
 * Realiza un programa que pida una hora por teclado y que muestre luego buenos días, buenas tardes o buenas noches
 * según la hora. Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en
 * cuenta las horas, los minutos no se deben introducir por teclado
 * 
 * @author Antonio J. Sánchez
 * @author José David Quero
 */
public class Ejercicio01 {


    public static void main(String[] args) {
        
        // ALGORITMO PRINCIPAL
        int hora = 0 ;

        System.out.print("Introduce la hora del día (0 - 23): ") ;        
        hora = Integer.parseInt(System.console().readLine()) ;

        if ((hora >= 0) && (hora <= 23)) {

            if ((hora >= 6)  && (hora <= 12)) {
                System.out.println("Buenos días.") ;
            }

            if ((hora >= 13) && (hora <= 20)) {
                System.out.println("Buenas tardes.") ;
            }

            if ((hora >= 21) || (hora <= 5)) {
                System.out.println("Buenas noches.") ;
            } 

        } else {
            System.out.println("Los valores deben estar comprendidos entre 0 y 23.");
        }
        
    }


}