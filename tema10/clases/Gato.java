package clases;
public class Gato implements Comparable<Gato> {

    private String nombre ;
    private String raza ;
    private String sexo ;
    private int edad ;
    private double peso ;

    /**     
     * @param nombre
     * @param edad
     */
    Gato(String nombre, int edad) {
        this.nombre = nombre ;
        this.edad   = edad ;
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
    public int getEdad() {
        return edad;
    }

    /**     
     * @param o
     * @return
     */
    @Override
    public int compareTo(Gato gato) {
        return this.nombre.compareTo(gato.getNombre()) ;
    }


    /**
     * @return
     */
    @Override
    public String toString() {        
        return this.nombre ;
    }
    
}
