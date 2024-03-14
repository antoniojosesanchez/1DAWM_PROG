/**
 * @author Antonio J.Sánchez 
 * @author José David Quero
 */
public class Ejercicio08 {

    public static void main(String[] args) {

        // PIRÁMIDE DE ESTRELLITAS
        int base ;
        int altura  ;
        int hueco ;

        System.out.print("Introduce la altura: ") ;
        altura = Integer.parseInt(System.console().readLine()) ;

        System.out.print("Introduce la base: ") ;
        base = Integer.parseInt(System.console().readLine()) ;

        System.out.print("¿Pintar hueco? (1 - Si| 0 - No): ") ;
        hueco = Integer.parseInt(System.console().readLine()) ;

        //
        dibujar(altura, base, hueco == 1) ;      
    }

    /**     
     * @param altura
     * @param base
     * @param hueco
     */
    private static void dibujar(int altura, int base, boolean hueco) {

        int fil ;
        int col ;

        for(fil=1; fil <= altura; fil++) {

            // dibujar estrellitas
            for(col=1; col <= base; col++) { 


                if (hueco) {
                    System.out.print(((fil==1) || (fil==altura) || (col==1) || (col==base))?"* ":"  ");
                } else {
                    System.out.print("* ") ;
                }
                //if ((fil==1) || (fil==altura) || (col==1) || (col==base)) { System.out.print("* "); }
                //else { System.out.print("  "); }
            }

            System.out.println() ;
        }
    }
    
}
