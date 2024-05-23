package clases;


/**
 * @author Antonio J. Sánchez
 * @author José David Quero
 */
public class Fruta implements Comparable<Fruta> {

    private final String EXTENSION = ".jpg" ;
    
    private String id ;
    private String nombre ;

    private Integer stock ;  
    
    /**     
     * @param id
     * @param nombre
     * @param stock
     */
    public Fruta(String id, String nombre, Integer stock) {

        this.id     = id ;
        this.nombre = nombre ;
        this.stock  = stock ;
    }

    /**
     * @return
     */
    public String getId() {
        return id;
    }

    /**     
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return
     */
    public Integer getStock() {
        return stock;
    }

    /**     
     * @param f
     * @return
     */
    @Override
    public int compareTo(Fruta f) {        

        return this.stock - f.stock ;        
    }

    /**
     * @return
     */
    @Override
    public String toString() {        
        return "<img src=\"./assets/images/img_" + this.id + ".jpg\" /><br/>"  ;
    }

    

}
