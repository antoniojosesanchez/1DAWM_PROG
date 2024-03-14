/** 
 * @author Antonio J.Sánchez 
 * @author José David Quero
 */
public class Ejercicio07 {
     

    public static void main(String[] args) {

        int fil ;  
        int col ;      
        int altura  ;        
        int estrellitas = 1 ;

        System.out.print("Introduce la altura: ") ;
        altura = Integer.parseInt(System.console().readLine()) ;        

        // parte superior de la pirámide
        for(fil=1; fil <= altura; fil++) {

            // dibujar espacios        
            dibujar((altura/2) - estrellitas + 1, " ") ;              
            
            // dibujar estrellitas
            dibujar(estrellitas, "* ") ;
            
            System.out.println();

            

            estrellitas += (fil < (altura/2) + 1)?1:-1 ;
        }
    }

    /**     
     * @param total
     * @param cadena
     */
    private static void dibujar(int total, String cadena) {
        
        for(int col=0; col < total; col++) { System.out.print(cadena); }  
    }

}
