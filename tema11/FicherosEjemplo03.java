import java.io.File;

public class FicherosEjemplo03 {
  
    public static void main(String[] args) {
        
        String ruta ;
        
        System.out.println("Introduzca la ruta: ") ;
        ruta = System.console().readLine() ;

        File f = new File(ruta) ;

        if(f.exists()) {
            String[] listaArchivos = f.list() ;

            for(String item : listaArchivos) {
                System.out.println(item) ;
            }
        } else {
            System.out.println("La ruta indicada no existe.");
        }

    }


}
