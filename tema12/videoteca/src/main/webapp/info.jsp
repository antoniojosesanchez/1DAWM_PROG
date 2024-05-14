<%-- info.jsp --%>
<%-- @author Antonio J.Sánchez --%>
<%-- @author José David Quero  --%>
<%@page contentType="text/html" pageEncoding="utf-8" %>
<%@page import="clases.DB"     %>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.ResultSet"  %>
<!DOCTYPE html>
<html lang="es">
<head>
    <title></title>
    <meta charset="utf-8" />

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous" />

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>

    <style>
        p { text-align: justify ; }
    </style>

</head>
<body>

    <div class="container">

        <h1>Videoteca</h1>

        <%
            // recuperar la clave primaria del registro a mostrar
            String idPel = request.getParameter("id") ;

            Connection conexion = DB.getDB("videoteca") ;

            // lanzamos la consulta
            String sql = "SELECT * FROM pelicula WHERE idPel = " + idPel + " ;" ;
            ResultSet resPelicula = conexion.createStatement().executeQuery(sql) ;

            if (!resPelicula.next()) {
                out.println("<h4>No se ha encontrado la película.</h4>") ;
            } else {

                // buscamos los géneros asociados a la película
                sql = "SELECT * FROM genero G  " +
                  "JOIN pelicula_genero PG " +
                  "ON (G.idGen = PG.idGen) " +
                  "WHERE PG.idPel = " + idPel + ";" ;

                // lanzamos la consulta
                ResultSet resGeneros = conexion.createStatement().executeQuery(sql) ;
        %>
        <div class="row">
            <div class="col-sm-4">
                <img style="width:20rem;" src="<%= resPelicula.getString("poster") %>" />
            </div>
            <div class="col-sm-8">
                <%-- INFO BÁSICA --%>
                <h3><%= resPelicula.getString("titulo") %></h3>
                <p><span class="fw-bold">Director:</span> <%= resPelicula.getString("director") %></p>
                <p><span class="fw-bold">Duración:</span> <%= resPelicula.getString("duracion") %></p>
                <p><span class="fw-bold">Año:</span> <%= resPelicula.getString("anio").substring(0,4) %></p>

                <%-- GÉNEROS --%>
                <p><span class="fw-bold">Género/s:</span>
                <% while(resGeneros.next()) { %>
                   &nbsp;<span><%= resGeneros.getString("genero") %></span>
                <% } %>
                </p> <%-- generos --%>

                <%-- ARGUMENTO --%>
                <p class="fw-bold">Argumento:</p>
                <p><%= resPelicula.getString("argumento") %></p>
            </div>
        </div>
        <%
            }

            // cerramos la conexión
            conexion.close() ;
        %>

        <div class="mt-4 text-end">
            <a href="http://localhost:8080/videoteca">volver atrás</a>
        </div>


    </div>

</body>