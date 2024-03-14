/** 
 * @author Antonio J.Sánchez 
 * @author José David Quero
 */
public class Ejercicio03 {
    
    public static void main(String[] args) {
        
        // PIRÁMIDE DE ESTRELLITAS
        int col ;
        int fil ;
        int altura  ;

        System.out.print("Introduce la altura: ") ;
        altura = Integer.parseInt(System.console().readLine()) ;


        for(fil=1; fil <= altura; fil++) {

            // dibujar espacios
            for(col=0; col < (altura - fil); col++) { System.out.print(" "); }

            // dibujar estrellitas
            for(col=0; col < fil; col++) { System.out.print("* "); }

            System.out.println() ;
        }
        



    }
}
