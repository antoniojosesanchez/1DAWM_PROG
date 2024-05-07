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
     * @return
     */
    public static Connection getConexion(String bd) {

        Connection conexion = null ;

        try {
            Class.forName("com.mysql.jdbc.Driver") ;
            conexion = DriverManager.getConnection(url + bd, usuario, clave) ;
        } catch(Exception e) {
            System.out.println("Se ha producido un error al conectar con la base de datos.") ;
        }  
        
        return conexion ;
    }
    
}
