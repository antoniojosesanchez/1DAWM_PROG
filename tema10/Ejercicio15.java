import java.util.HashMap;

import java.util.Map.Entry;

/**
 * Un supermercado de productos ecológicos nos ha pedido hacer un programa para vender su mercancía. En esta 
 * primera versión del programa se tendrán en cuenta los productos que se indican en la tabla junto con su 
 * precio. Los productos se venden en bote, brick, etc. Cuando se realiza la compra, hay que indicar el 
 * producto y el número de unidades que se compran, por ejemplo “guisantes” si se quiere comprar un bote de 
 * guisantes y la cantidad, por ejemplo “3” si se quieren comprar 3 botes. La compra se termina con la palabra 
 * “fin”. Suponemos que el usuario no va a intentar comprar un producto que no existe. Utiliza un diccionario 
 * para almacenar los nombres y precios de los productos y una o varias listas para almacenar la compra que 
 * realiza el usuario.
 *  A continuación se muestra una tabla con los productos disponibles y sus respectivos precios
 * @author Antonio J.Sánchez
 * @author José David Quero
 */
public class Ejercicio15 {

    private static final String FINAL = "fin" ;
    private static final String CODIGO = "ECODTO" ;
    private static final Integer descuento = 10 ;

    private static HashMap<String, Double> productos ;

    public static void main(String[] args) {
        
        int cantidad ;
        String producto ;
        Double subtotal = 0.0 ;

        // definimos y creamos la lista de la compra
        HashMap<String, Integer> lista = new HashMap<String, Integer>() ;

        // iniciamos el listado de productos
        inicializarProductos() ;   

        do {

            System.out.print("Producto: ") ;
            producto = System.console().readLine() ;

            if (!producto.equals(FINAL)) {

                System.out.print("Cantidad: ") ;
                cantidad = Integer.parseInt(System.console().readLine()) ;

                // si el producto ya se había elegido, se actualiza la cantidad; en otro caso, se añade
                // a la lista de la compra.
                if (lista.containsKey(producto)) { 
                    lista.replace(producto, lista.get(producto) + cantidad) ; 
                }
                else { 
                    lista.put(producto, cantidad) ; 
                }
            }

        } while (!producto.equals(FINAL)) ;

        // preguntamos código de descuento
        System.out.print("Introduzca el código de descuento (INTRO si no tiene ninguno): ");
        producto = System.console().readLine() ;

        // mostramos el resumen de la compra
        mostrarResumenCompra(lista, producto.equals(CODIGO)) ;
    }

    /**
     * Inicializamos los productos del supermercado con sus precios
     */
    private static void inicializarProductos() {

        productos = new HashMap<String, Double>() ;

        productos.put("avena", 2.21) ;
        productos.put("garbanzos", 2.39) ;
        productos.put("tomate", 1.59) ;
        productos.put("jengibre", 3.13) ;
        productos.put("quinoa", 4.50) ;
        productos.put("guisantes", 1.60) ;
    }

    /**
     * Muestra el tiket resumen de la compra
     * @param lista
     * @param promo
     */
    private static void mostrarResumenCompra(HashMap<String, Integer> lista, boolean promo) {

        
        Double precio ;
        Double subtotal ;
        Double desc = 0.0 ;
        Double total = 0.0 ;

        // mostramos la primera línea
        System.out.println("Producto Precio Cantidad Subtotal\n---------------------------------");

        for(Entry item: lista.entrySet()) {

            precio = productos.get(item.getKey()) ;
            subtotal = ((Integer) item.getValue()) * precio ;
            total += subtotal ;

            // mostramos detalle del producto
            System.out.printf("%s\t%2.2f\t%5d\t%8.2f\n", item.getKey(), precio, item.getValue(), subtotal);
        }

        // mostramos descuento
        if (promo) {
            desc = total * descuento / 100 ;
            System.out.printf("---------------------------------\nDescuento: %.2f\n", desc);
        }

        // mostramos total
        System.out.printf("---------------------------------\nTOTAL: %.2f\n", total - desc);

    }
    
}
