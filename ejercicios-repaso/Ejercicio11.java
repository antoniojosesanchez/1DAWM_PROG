/**
 * @author Antonio J.Sánchez 
 * @author José David Quero
 */
public class Ejercicio11 {
    
    private static final int SIZE = 10 ;

    public static void main(String[] args) {
        
        int[] vector = { 5, 28, 32, 112, 300, 1, 7, 0, 22, 24 } ;

        System.out.print("VECTOR: ");
        escribirVector(vector) ;

        desplazar(vector) ;

        System.out.print("VECTOR: ");
        escribirVector(vector) ;

    }

    /**     
     * @param vector
     */
    private static void escribirVector(int[] vector) {

        for(int i=0; i < SIZE; i++) {
            System.out.printf("%d  ", vector[i]);
        }

        System.out.println();
    }

    /**     
     * @param vector
     * @param pos
     */
    private static void desplazarDerecha(int[] vector, int pos) {

        int temp = vector[SIZE-1] ;

        // de final a principio
        for(int i=SIZE-1; i > 0; i--) { vector[i] = vector[i-1] ; }
      
        //
        vector[0] = temp ;
    
    }

}
