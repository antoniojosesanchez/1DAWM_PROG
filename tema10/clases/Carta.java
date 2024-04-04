package clases;

public class Carta {

    String[] valores = { "As", "2", "3", "4", "5", "6", "7", "Sota", "Caballo", "Rey" } ;
    String[] palos = { "Oros", "Bastos", "Copas", "Espadas" } ;

    private String valor ;
    private String palo ;

    /**     
     */
    public Carta() {
        this.valor = valores[(int) (Math.random() * 10)] ;
        this.palo  = palos[(int) (Math.random() * 4)] ;
    }
    
}
