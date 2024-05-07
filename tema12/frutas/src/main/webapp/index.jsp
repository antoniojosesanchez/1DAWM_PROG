<%-- index.jsp --%>
<%-- @author Antonio J. Sánchez --%>
<%-- @authorJosé David Quero --%>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.DriverManager" %>
<%@page import="java.sql.Statement" %>
<%@page import="java.sql.ResultSet" %>
<%@page import="clases.Fruta" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <title>Frutas</title>
    <meta charset="utf-8" />

    <style>
        img { width: 40%; }
    </style>
</head>
<body>

    <h1>Frutas</h1>

    <% 

        // Establecemos la conexión con la Base de Datos
        Class.forName("com.mysql.jdbc.Driver") ;
        Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/frutas", "root", "") ;       
        Statement consulta  = conexion.createStatement() ;


        if (request.getParameterMap().isEmpty()) { 

            String id ;
            String nombre ;
           
            ResultSet resultado = consulta.executeQuery("SELECT * FROM fruta ;") ;
    %>

        <form action="index.jsp" method="get">
            <label for="fruta">Selecciona una fruta (obligatoriamente): </label>
            <select id="fruta" name="fruta">
    <%
            while(resultado.next()) {

                id = resultado.getString("id") ;
                nombre = resultado.getString("nombre") ;

                out.println(" <option value=\"" + id + "\">" + nombre + "</option>  ") ;
            }                
    %>
            </select>        

            <button>Enviar</button>
        </form>
    <%
        } else {     
            
             // establecemos el tipo de codificación
            request.setCharacterEncoding("UTF-8") ;

            ResultSet resultado = consulta.executeQuery("SELECT * FROM fruta WHERE id = " + request.getParameter("fruta")) ;
            resultado.next() ;
            
            // creamos el objeto
            Fruta fruta = new Fruta(resultado.getString("id"), 
                                    resultado.getString("nombre")) ; 

            out.println("<h4>Me gusta comer " + fruta.getNombre() + "</h4>") ;
            out.println(fruta) ;             
        }

         conexion.close() ;

    %>

</body>
</html>