/**
 * @author Antonio J.Sánchez
 * @author José David Quero
 */
package clases;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    private static String URL     = "jdbc:mysql://localhost:3306/" ;
    private static String DBNAME  = "personal" ;
    private static String USUARIO = "root" ;
    private static String CLAVE   = "" ;

    private static Connection conexion = null ;

    /**     
     * @return
     * @throws SQLException
     */
    public static Statement getDB() throws SQLException  {

        if (conexion == null) {
            // Si la conexión no se ha hecho previamente, la hacemos.
            try {
                Class.forName("com.mysql.jdbc.Driver") ;
                conexion = DriverManager.getConnection(URL + DBNAME, USUARIO, CLAVE) ;
            } catch (Exception exception) {
                System.out.println("Error en la conexión con el servidor de base de datos.");
            }   
        }

        // Hecha la conexión (o recuperada la que se hizo previamente), creamos
        // la sentencia y la devolvemos
        return conexion.createStatement() ;
    }

    /**     
     * @throws SQLException
     */
    public static void close() throws SQLException {        
        if (conexion!=null) { conexion.close() ; }
    }

    
}
