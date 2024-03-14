/** 
 * @author Antonio J.Sánchez 
 * @author José David Quero
 */
public class Ejercicio04 {
    
    public static void main(String[] args) {

        int fil ;
        int col ;
        int altura  ;

        System.out.print("Introduce la altura: ") ;
        altura = Integer.parseInt(System.console().readLine()) ;

        for(fil=1; fil <= altura; fil++) {

            // dibujamos los espacios
            for(col=0; col < (altura - fil); col++) { System.out.print(" "); }

            // dibujamos tantos números como indique la fila
            for(col=1; col <= fil; col++) { System.out.printf("%d ", col) ; }

            System.out.println() ;
        }

        
    }

}
