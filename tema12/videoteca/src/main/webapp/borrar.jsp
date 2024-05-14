<%-- borrar.jsp --%>
<%-- @author Antonio J.Sánchez --%>
<%-- @author José David Quero  --%>
<%@page contentType="text/html" pageEncoding="utf-8" %>
<%@page import="clases.DB"     %>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.Statement"  %>
<%@page import="java.sql.ResultSet"  %>
<%

    String idPel = request.getParameter("id") ;

    if(idPel==null) {
%>
<!DOCTYPE html>
<html lang="es">
<head>
    <title></title>
    <meta charset="utf-8" />

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous" />

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>

</head>
<body>
    <div class="container">

        <h1>Videoteca</h1>
        <h4>Imposible eliminar el registro indicado.</h4>
        <a href="http://localhost:8080/videoteca">volver atrás</a>

<%
    } else {

        Connection conexion = DB.getDB("videoteca") ;
        Statement consulta  = conexion.createStatement() ;
        String sql = "DELETE FROM pelicula WHERE idPel = " + idPel + " ;" ;

        consulta.execute(sql) ;

        // cerramos la conexión
        conexion.close() ;

        // redirigimos a la página principal
        response.sendRedirect("http://localhost:8080/videoteca") ;
    }
%>