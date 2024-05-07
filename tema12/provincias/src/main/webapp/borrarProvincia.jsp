<%-- borrarProvincia.jsp --%>
<%-- @author Antonio J. Sánchez --%>
<%-- @authorJosé David Quero --%>
<%@page import="clases.Conexion" %>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.Statement" %>
<%
    Connection conexion = Conexion.getConexion("ccaa") ;
    Statement consulta  = conexion.createStatement() ;

    // El método execute devuelve TRUE|FALSE únicamente, por lo que preferentemente lo utilizaremos
    // tan sólo para INSERT, DELETE y UPDATE.
    //
    // El método executeQuery devuelve un objeto de clase ResultSet, por lo que se utilizará únicamente
    // para consultas de tipo SELECT.
    consulta.execute("DELETE FROM provincia WHERE codProv = " + request.getParameter("cod") + " ;") ;
    
    // Cerramos la conexión
    conexion.close () ;

    //response.setStatus(response.SC_FOUND) ;
    //response.setHeader("Location", "http://localhost:8080/provincias") ;    
    response.sendRedirect("http://localhost:8080/provincias") ;
%>

<!-- NO RECOMENDABLE -->
<!--<script> document.location="http://localhost:8080/provincias" </script>-->
