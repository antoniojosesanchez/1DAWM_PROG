package clases;
/** 
 * @author Antonio J.Sánchez
 * @author José David Quero
*/

public class Moneda {

    private final String[] posiciones = { "cara", "cruz" } ;
    private final String[] monedas = { "1 céntimo", "2 céntimos", "5 céntimos", "10 céntimos", 
                                       "25 céntimos", "50 céntimos", "1 euro", "2 euros" } ;
    
    private String cantidad ;
    private String posicion ;

    /**     
     */
    public Moneda() {
        this.cantidad = monedas[(int) (Math.random() * 8)] ;
        this.posicion = posiciones[(int) (Math.random() * 2)] ;
    }

    /**     
     * @return
     */
    public String getCantidad() {
        return cantidad;
    }

    /**     
     * @return
     */
    public String getPosicion() {
        return posicion;
    }

    @Override
    public String toString() {        
        return this.cantidad + " - " + this.posicion ;
    }

}
