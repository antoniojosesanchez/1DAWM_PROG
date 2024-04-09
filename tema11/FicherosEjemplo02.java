import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FicherosEjemplo02 {

    public static void main(String[] args) {
        
        try {

            FileWriter archivo = new FileWriter("fruta.txt") ;
            BufferedWriter bw = new BufferedWriter(archivo) ;

            bw.write("Mandarina\n") ;
            bw.write("Fresas\n") ;
            bw.write("Manzana\n") ;
            bw.write("Mango\n") ;
            bw.write("Kiwi\n") ;
            bw.write("Níspero\n") ;
            bw.write("Chirimoya\n") ;
            bw.write("Plátano\n") ;
            bw.write("Piña\n") ;
            bw.write("Melocotón\n") ;

            bw.close() ; 

        } catch (IOException ioe) {
            System.out.println("Se ha producido un error en el acceso al archivo.");
        }


    }
    
}
