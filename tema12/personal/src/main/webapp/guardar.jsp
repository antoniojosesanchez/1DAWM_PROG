<%-- @author Antonio J.Sánchez --%>
<%-- @author José David Quero --%>
<%@page contentType="text/html" pageEncoding="utf-8" %>
<%@page import="clases.DB" %>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.Statement" %>
<%@page import="java.sql.ResultSet" %>
<%@page import="java.sql.SQLException" %>
<%@page import="java.io.FileWriter" %>
<%@page import="java.io.BufferedWriter" %>
<%
    String sql  ;
    ResultSet res ; 
    Statement consulta ;

    // 1. establecemos conexión con el servidor de base de datos
    Connection conexion = DB.getDb() ;
    
    // 2. buscamos información del usuario
    sql = "SELECT * FROM usuario WHERE idUsu = " + request.getParameter("idu") + "; " ;
    consulta  = conexion.createStatement()  ;        
    res = consulta.executeQuery(sql) ;

    res.next() ;

    // 3. creamos el nombre del archivo en base al del usuario
    String nombreArchivo = "recordatorios_"+ res.getString("apellidos") + "_" + res.getString("nombre") + ".txt" ;

    // 4. lanzamos la consulta contra la base de datos            
    sql = "SELECT * FROM recordatorio WHERE idUsu = " + request.getParameter("idu") + "; " ;    
    consulta  = conexion.createStatement()  ;
    res = consulta.executeQuery(sql) ; 

    // 5. creamos archivos para escritura  
    BufferedWriter bw  = new BufferedWriter(new FileWriter(nombreArchivo)) ;

    // 6. volcamos en el archivo de texto las tareas del usuario
    while(res.next()) {

        String titulo      = res.getString("titulo") ;
        String descripcion = res.getString("descripcion") ;
        out.println("Volcando tarea: " + titulo + "<br/>") ;

        bw.write(titulo + ", " + descripcion + "\n") ;
    }

    // 7. cerramos la conexión con la base de datos
    conexion.close () ;

    // 8. cerramos el archivo
    bw.close() ;

    // 9. redirigimos a la pantalla anterior
    response.sendRedirect("main.jsp?idu=" + request.getParameter("idu")) ;

%>