/**
 * @author Antonio J.Sánchez 
 * @author José David Quero
 */
public class Ejercicio12 {
    
    // CONSTANTES
    //                                     0    1    2
    private static final char[] FICHAS = {' ', 'X', 'O'} ;
    private static final char[] LETRAS = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'} ;
    private static final int SIZE = 3 ;
    
    public static void main(String[] args) {
        
        boolean fin = false ;
        String coord ;

        int fil ;
        int col ;
        int turno = 1 ;
        int fichas = SIZE * SIZE ;
        int[][] tablero = new int[SIZE][SIZE] ;
        dibujarTablero(tablero) ; 

        do {

            
            System.out.println("\n\nTURNO JUGADOR " + turno) ;
            System.out.print("Introduzca las coordenadas, por ejemplo b2: ") ;
            coord = System.console().readLine() ;

            // extraemos de las coordenadas la fila y la columna
            fil = coord.charAt(0) - 97 ;
            col = coord.charAt(1) - 48 - 1 ;

            // colocamos la ficha siempre y cuando la celda no esté ocupada
            if (tablero[fil][col]==0) {

                // colocamos la ficha
                tablero[fil][col] = turno ;

                // resto ficha
                fichas-- ;

                // comprobamos si hay tres en raya
                if ((comprobarHorizontal(tablero, fil, turno)) ||
                    (comprobarVertical(tablero, col, turno))   ||
                    (comprobaDiagonalDerecha(tablero, turno))  ||
                    (comprobaDiagonalIzquierda(tablero, turno))) 
                {

                    System.out.println("Enhorabuena jugador " + turno + ". ¡Has ganado!");
                    fin = true ;
                } else if(fichas == 0) {
                    System.out.println("El juego termina en empate.");
                    fin = true ;                
                }
                

                // cambiamos el turno
                turno = (turno==1)?2:1 ; 
            } else {
                System.out.println("La celda está ocupada.\n") ;
            }

            dibujarTablero(tablero) ; 
            
        } while(!fin) ;

    }

    /**     
     * @param tablero
     * @param fil
     * @return
     */
    private static boolean comprobarHorizontal(int[][] tablero, int fil, int turno) {

        int i = 0 ;        

        while ((i < SIZE) && (tablero[fil][i]==turno)) { i++ ; }
        return (i >= SIZE) ;
    }

    /**     
     * @param tablero
     * @param col
     * @return
     */
    private static boolean comprobarVertical(int[][] tablero, int col, int turno) {

        int i = 0 ;        

        while ((i < SIZE) && (tablero[i][col]==turno)) { i++ ; }
        return (i >= SIZE) ;
    }

     /**     
     * @param tablero
     * @return
     */
    private static boolean comprobaDiagonalDerecha(int[][] tablero, int turno) {

        int i = 0 ;                

        while ((i < SIZE) && (tablero[i][i]==turno)) { i++ ; }
        return (i >= SIZE) ;
    }

     /**     
     * @param tablero
     * @return
     */
    private static boolean comprobaDiagonalIzquierda(int[][] tablero, int turno) {

        int fil = SIZE - 1 ;
        int col = 0 ;  

        while ((col < SIZE) && (tablero[fil][col]==turno)) { fil-- ; col++ ; }
        return (col >= SIZE) ;
    }


    /**     
     * @param cadena
     */
    private static void dibujarFila(String cadena) {

        int col ;
        System.out.print("  ");
        for(col=0; col < SIZE; col++) { System.out.print(cadena); }
        System.out.println("░");
    }

    /**     
     * @param tablero
     */
    private static void dibujarTablero(int[][] tablero) {

        int col ;
        int fil ;

        for(fil=0; fil < SIZE; fil++) {            

            // dibuja el marco del tablero
            dibujarFila("░░");

            // mostramos la letra
            System.out.printf("%c ", LETRAS[fil]);

            // dibuja el tablero "de verdad"
            for(col=0; col < SIZE; col++) {         
                System.out.printf("░%c", FICHAS[tablero[fil][col]]) ;
            }

            System.out.println("░");
        }

        // dibuja el marco
        dibujarFila("░░") ;

        System.out.print("  ");

        // dibujamos los números
        for(col=1; col <= SIZE; col++) { System.out.printf(" %d", col); }
    }

}
