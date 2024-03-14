/**
 * @author Antonio J.Sánchez 
 * @author José David Quero
 */
public class Ejercicio10 {

    private static final int SIZE = 2 ;

    public static void main(String[] args) {

        int[][] ma = new int[SIZE][SIZE] ;  
        int[][] mb = new int[SIZE][SIZE] ;

        leerMatriz(ma) ;
        leerMatriz(mb) ;
       
        System.out.println("MATRIZ MA:") ;
        escribirMatriz(ma) ;

        System.out.println("MATRIZ MB:") ;
        escribirMatriz(mb) ;

        System.out.println("SUMA A + B: ");
        escribirMatriz(sumar(ma, mb));
        
    }

    /**     
     * @param matriz
     */
    private static void leerMatriz(int[][] matriz) {

        for(int fil=0; fil < SIZE; fil++ ) {
            for(int col=0; col < SIZE; col++) {
                System.out.print("? ");
                matriz[fil][col] = Integer.parseInt(System.console().readLine()) ;
            }
        }
    }

    /**     
     * @param matriz
     */
    private static void escribirMatriz(int[][] matriz) {

        for(int fil=0; fil < SIZE; fil++) {
            for(int col=0; col < SIZE; col++) {
                System.out.printf("%d ", matriz[fil][col]);
            }

            System.out.println();
        }
    }

    /**     
     * @param matriz1
     * @param matriz2
     * @return
     */
    private static int[][] sumar(int[][] matriz1, int[][] matriz2) {

        int[][] resultado = new int[SIZE][SIZE] ;

        for(int fil=0; fil < SIZE; fil++) {
            for(int col=0; col < SIZE; col++) {
                resultado[fil][col] = matriz1[fil][col] + matriz2[fil][col] ;
            }
        }

        return resultado ;
    }


    /**     
     * @param matriz
     * @param valor
     * @return
     */
    private static int[][] productoEscalar(int[][] matriz, int valor) {}

}
