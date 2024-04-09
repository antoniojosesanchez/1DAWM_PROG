import java.util.HashMap;

/**
 * Implementa el control de acceso al área restringida de un programa. Se debe pedir un nombre 
 * de usuario y una contraseña. Si el usuario introduce los datos correctamente, el programa 
 * dirá “Ha accedido al área restringida”. El usuario tendrá un máximo de 3 oportunidades. Si se 
 * agotan las oportunidades el programa dirá “Lo siento, no tiene acceso al área restringida”. 
 * Los nombres de usuario con sus correspondientes contraseñas deben estar almacenados en una 
 * estructura de la clase HashMap.
 * 
 * @author Antonio J.Sánchez
 * @author José David Quero
 */
public class Ejercicio06 {

    public static void main(String[] args) {
        
        String clave ;
        String usuario ;        
        int intentos = 3 ;
        boolean encontrado = false ;
        HashMap<String, String> mapa = new HashMap<String, String>() ;

        mapa.put("antonio", "12345678") ;
        mapa.put("sandra", "23456789") ;
        mapa.put("pablo", "34567890") ;

        System.out.println(mapa);

        do {
            System.out.println("Dame tu usuario: ") ;
            usuario = System.console().readLine() ;

            System.out.println("Dame tu contraseña: ") ;
            clave = System.console().readLine() ;

            intentos--;

            // buscamos el usuario
            if (mapa.containsKey(usuario)) {

                // si encuentras el usuario, comprobamos las clave
                if ( mapa.get(usuario).equals(clave) ) {
                    System.out.println("Ha accedido al área restringida");
                    encontrado = true ;
                } else {
                    System.out.printf("Lo siento, no tiene acceso al área restringida.\nTe quedan %d intentos\n", intentos);                    
                }
                

            } else {
                System.out.printf("Lo siento, no tiene acceso al área restringida.\nTe quedan %d intentos\n", intentos); 
            }

       

        } while ((intentos > 0) && (!encontrado)) ;



    }
    
}
