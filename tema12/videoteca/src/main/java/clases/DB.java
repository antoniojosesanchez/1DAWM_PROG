/**
 * @author Antonio J.Sánchez
 * @author José David Quero
 */
package clases;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {

    private static final String url     = "jdbc:mysql://localhost:3306/" ;
    private static final String usuario = "root" ;
    private static final String clave   = "" ;

    /**     
     * @param dbName
     * @return
     */
    public static Connection getDB(String dbName) {

        Connection conexion = null ;
        
        try {
            Class.forName("com.mysql.jdbc.Driver") ;
            conexion = DriverManager.getConnection(url + dbName, usuario, clave) ;
        } catch(Exception exp) {
            System.out.println("Se ha producido un error en la conexión con la base de datos.");
        }

        return conexion ;
    }
}
