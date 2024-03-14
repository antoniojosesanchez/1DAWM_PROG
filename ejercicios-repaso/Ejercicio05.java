/** 
 * @author Antonio J.Sánchez 
 * @author José David Quero
 */
public class Ejercicio05 {
    
    public static void main(String[] args) {

        int fil ;
        int col ;
        int altura  ;

        System.out.print("Introduce la altura: ") ;
        altura = Integer.parseInt(System.console().readLine()) ;

        for(fil=1; fil <= altura; fil++) {

            // dibujamos los espacios
            for(col=0; col < (altura - fil); col++) { System.out.print(" "); }

            // dibujamos el lateral izquierdo de la pirámide
            for(col=1; col <= fil; col++) { System.out.printf("%d", col) ; }

            // dibujamos el lateral derecho de la pirámide
            for (col=fil; col > 0; col--) { System.out.printf("%d", col) ; }

            System.out.println() ;
        }

        
    }

}
