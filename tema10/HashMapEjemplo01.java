import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;



public class HashMapEjemplo01 {
    
    public static void main(String[] args) {
        
        int codigo ;
        HashMap<Integer, String> mapa = new HashMap<Integer, String>() ;

        // guardamos valores en el mapa
        mapa.put(924, "Amalia Núñez") ;
        mapa.put(921, "Cindy Nero") ;
        mapa.put(700, "César Vázquez") ;
        mapa.put(219, "Víctor Tilla") ;
        mapa.put(537, "Alan Brito") ;
        mapa.put(605, "Esteban Quito") ;

        // mostramos info de un empleado
        System.out.println(mapa.get(537)); 

        //
        ///System.out.println("Los elementos del mapa son:\n" + mapa);

        //
        System.out.println("Todas las entradas del diccionario:") ;
        //System.out.println(mapa.entrySet());

        // mostramos sólo los nombres
        System.out.println("Nombres de los empleados/as");
        for(String item : mapa.values()) {
            System.out.println(item); 
        }

        // mostramos solo los códigos de empleado/a
        System.out.println("Códigos de empleados/as");
        for(Integer item : mapa.keySet()) {
            System.out.println(item);
        }

        System.out.println("Datos de los empleados/as:") ;
        for(Map.Entry item : mapa.entrySet()) {
            System.out.println("Código de empleado/a: " + item.getKey()) ;
            System.out.println(item.getValue()) ;
        }

        System.out.print("Introduce un código de empleado: ") ;
        codigo = Integer.parseInt(System.console().readLine()) ;

        if (mapa.containsKey(codigo)) {
            System.out.println("El empleado/a se ha encontrado.");
        } else {
            System.out.println("El código dado no corresponde a ningún empleado/a.");
        }

    }

}
