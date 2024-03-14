/** 
 * @author Antonio J.Sánchez 
 * @author José David Quero
 */
public class Ejercicio06 {
    
    public static void main(String[] args) {
        
        int fil ;
        int col ;
        int altura  ;

        System.out.print("Introduce la altura: ") ;
        altura = Integer.parseInt(System.console().readLine()) ;

        // parte superior de la pirámide
        for(fil=1; fil <= (altura/2)+1; fil++) {

            // dibujar espacios
            for(col=0; col < (altura - fil); col++) { System.out.print(" "); }

            // dibujar estrellitas
            for(col=0; col < fil; col++) { System.out.print("* "); }

            System.out.println();

        }

        // Parte inferior de la pirámide
        for( ; fil <= altura; fil++) {
            
            // dibujar espacios
            for(col=0; col < (fil - (altura/2) + 2); col++) { System.out.print(" "); }

            // dibujar estrellitas
            for(col=0; col < (altura - fil + 1); col++ ) { System.out.print("* "); }

            System.out.println();
        }

    }

}
