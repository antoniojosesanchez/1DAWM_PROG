package Clases;

import java.util.Objects;

public class CartaEj12 implements Comparable<CartaEj12> {
    
    private final static String[] FIGURAS = {"as", "dos", "tres", "cuatro", "cinco", "seis", "siete", "sota", "caballo", "rey"};
    private final static String[] PALOS   = {"bastos", "copas", "espadas", "oros"};

    private Integer numero;
    private String palo;

    /**
     */
    public CartaEj12() {
        this.numero = (int)(Math.random()*10);
        this.palo = PALOS[(int)(Math.random()*4)];  
    }

    /**
     * @return
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @return
     */
    public String getFigura() {
        return FIGURAS[numero];
    }

    /**
     * @return
     */
    public String getPalo() {
        return palo;
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        return FIGURAS[numero] + " de " + palo;
    }

    /**
     * @param carta
     * @return
     */
    @Override
    public int compareTo(CartaEj12 carta) {
        int iguales ;
        return palo.equals(carta.getPalo())?numero.compareTo(carta.getNumero()):palo.compareTo(carta.getPalo()) ;
    }

}
