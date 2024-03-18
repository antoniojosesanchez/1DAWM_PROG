/**
 * @author Antonio J.Sánchez 
 * @author José David Quero
 */
public class Ejercicio10 {

    private static final int SIZE = 2 ;

    public static void main(String[] args) {

        int escalar ;
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

        System.out.println("PRODUCTO ESCALAR: ") ;
        System.out.println("Valor por el que quieres multiplicar: ") ;
        escalar = Integer.parseInt(System.console().readLine()) ;
        escribirMatriz(productoEscalar(ma, escalar)) ;

        System.out.println("PRODUCTO DE MATRICES: ") ;
        escribirMatriz(producto(ma, mb)) ;
        
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
    private static int[][] productoEscalar(int[][] matriz, int valor) {

        int fil ;
        int col ;
        int[][] resultado = new int[SIZE][SIZE] ;

        for(fil=0; fil < SIZE; fil++) {
            for(col=0; col < SIZE; col++) {
                resultado[fil][col] = matriz[fil][col] * valor ;
            }
        }

        return resultado ;
    }

    /**  
     * Podemos multiplicar dos matrices MA y MB, si el número de columnas de A
     * coincide con el número de filas de B. Como en nuestro ejercicio, ambas
     * matrices son cuadradas, estos valores coinciden, así que no nos preocupa-
     * mos de ello.
     * 
     * El elemento MCij se calcula multiplicando cada elemento de la fila i de 
     * la matriz A por cada elemento de la columna j de la matriz B y sumándolos.     
     * 
     * @param ma
     * @param mb
     * @return
     */
    private static int[][] producto(int[][] ma, int[][] mb) {

        int k ;
        int fil ;
        int col ;
        int mc[][] = new int[SIZE][SIZE] ;

        // mc[0][0] = (ma[0][0] * mb[0][0]) + (ma[0][1] * mb[1][0]) 
        // mc[0][1] = (ma[0][0] * mb[0][1]) + (ma[0][1] * mb[1][1]) 

        // mc[1][0] = (ma[1][0] * mb[0][0]) + (ma[1][1] * mb[1][0] )
        // mc[1][1] = (ma[1][0] * mb[0][1]) +( ma[1][1] * mb[1][1] )

        for(fil=0; fil < SIZE; fil++) {
            for(col=0; col < SIZE; col++) {
                for(k=0; k < SIZE; k++) {
                    mc[fil][col] += ma[fil][k] * mb[k][col] ;
                }
            }
        }

        return mc ;

    } 

}
