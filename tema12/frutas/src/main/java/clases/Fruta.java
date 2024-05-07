package clases;

/**
 * @author Antonio J. Sánchez
 * @author José David Quero
 */
public class Fruta {

    private final String EXTENSION = ".jpg" ;
    
    private String id ;
    private String nombre ;

    private Double peso ;   // en gramos
    
    /**     
     * @param nombre
     * @param imagen
     */
    public Fruta(String id, String nombre) {

        this.id     = id ;
        this.nombre = nombre ;
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
    @Override
    public String toString() {        
        return "<img src=\"./assets/images/img_" + this.id + ".jpg\" />"  ;
    }

    

}
