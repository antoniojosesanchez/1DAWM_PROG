/**
 * @author Antonio J.Sánchez
 * @author José David Quero
 */

package clases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

import java.util.Map.Entry ;

public class Diccionario {
    
    private HashMap<String, String> palabras ;

    /**
     */
    public Diccionario() {
        palabras = new HashMap<String,String>() ;
    }

    /**     
     * @param palabra
     * @param significado
     */
    public void aniadir(String palabra, String significado) {
        this.palabras.put(palabra, significado) ;
    }

    /**     
     * @param palabra
     * @return
     */
    public String significado(String palabra) {
        return this.palabras.get(palabra) ;
    }

    /**
     * Busca la palabra en español y devuelve el significado.     
     * @param palabra
     * @return
     */
    public boolean buscar(String palabra) {
        return this.palabras.containsKey(palabra) ;
    }

    /**
     * Lee información del archivo y la guarda en el diccionario     
     * @param fichero
     */
    public void cargar(String fichero) {

        String[] pareja ;
        String linea ;

        try {
            BufferedReader br = new BufferedReader(new FileReader(fichero)) ;     
            
            while ( ( (linea = br.readLine()) != null)) {                 
                pareja = linea.split(" ") ;
                palabras.put(pareja[0], pareja[1]) ; 
            }

            br.close() ;

       } catch(FileNotFoundException fnfe) {
           System.out.println("El fichero no exister.");
       } catch(IOException ioe) {
           System.out.println("Se ha producido un fallo accediendo al fichero.");
       }
    }

    /**   
     * Volcamos el contenido del hashmap al archivo  
     * @param fichero
     */
    public void guardar(String fichero) {

        try {

            BufferedWriter bw = new BufferedWriter(new FileWriter(fichero)) ;

            for(Entry item: this.palabras.entrySet()) {
                bw.write( item.getKey() + " " + item.getValue() + "\n") ;
            }

            bw.close() ; 

        } catch(IOException ioe) {
            System.out.println("Se ha producido un fallo accediendo al fichero.");
        }

    }
}
