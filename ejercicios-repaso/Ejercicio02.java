/**
 * Escribe un programa que solicite al usuario un nota numérica comprendida entre 0 y 100 y muestre en 
 * pantalla la calificación siguiendo el formato anglosajón (A, B, C, D, F). De manera que:
 * 
 * A 90 - 100
 * B 80 - 89
 * C 70 - 79
 * D 60 - 69
 * F 0  - 59
 * 
 * @author Antonio J.Sánchez
 * @author José David Quero
 */

public class Ejercicio02 {

    public static void main(String[] args) {

        int nota ;
        
        System.out.println("Introduce un nota numérica entre 0 y 100: ") ;
        nota = Integer.parseInt(System.console().readLine()) ;

        /*if ((nota >= 90) && (nota <= 100)) {
            System.out.println("Tu nota es A") ;
        } else if ((nota >= 80) && (nota <= 89)) {
            System.out.println("Tu nota es B") ;
        } else if ((nota >= 70) && (nota <= 79)) {
            System.out.println("Tu nota es C") ;
        } else if ((nota >= 60) && (nota <= 69)) {
            System.out.println("Tu nota es D") ;
        } else if ((nota >= 0) && (nota <= 59)) {
            System.out.println("Tu nota es F") ;
        } else {
            System.out.println("Valor introducido incorrecto.");
        }*/

        if ((nota >= 0) && (nota <= 100)) {

            if (nota >= 90) {
                System.out.println("Tu nota es A") ;
            } else if (nota >= 80) {
                System.out.println("Tu nota es B");
            } else if (nota >= 70) {
                System.out.println("Tu nota es C");
            } else if (nota >= 60) {
                System.out.println("Tu nota es D");
            } else {
                System.out.println("Tu nota es F");
            }


        } else {
            System.out.println("Valor introducido incorrecto.");
        }
    }
    
}
