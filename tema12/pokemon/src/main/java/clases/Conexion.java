/**
 * @author Antonio J. Sánchez
 * @author José David Quero
 */

package clases;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {


    private static final String url     = "jdbc:mysql://localhost:3306/" ;
    private static final String usuario = "root" ;
    private static final String clave   = "" ;

    /**     
     * @param nomBD
     * @return
     */
    public static Connection getConnection(String ddbb) {

        Connection conexion = null ;

        try {
            Class.forName("com.mysql.jdbc.Driver") ;
            conexion = DriverManager.getConnection(url + ddbb, usuario, clave) ;
        } catch(Exception excp) {
            System.out.println("Se ha producido un error al conectar con la base de datos.");
        }

        return conexion ;
    }
    
}
