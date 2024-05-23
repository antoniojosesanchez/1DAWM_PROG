package clases;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
    

    private static String URL     = "jdbc:mysql://localhost:3306/" ;
    private static String DBNAME  = "personal" ;
    private static String USUARIO = "root" ;
    private static String CLAVE   = "" ;

    /**     
     * @return
     */
    public static Connection getDb() {

        Connection conexion = null ;

        try {

            Class.forName("com.mysql.jdbc.Driver") ;
            conexion = DriverManager.getConnection(URL + DBNAME, USUARIO, CLAVE) ;

        } catch(Exception exception) {
            System.out.println("Error de conexión con la base de datos.") ;
        }

        return conexion ;
    }

}
