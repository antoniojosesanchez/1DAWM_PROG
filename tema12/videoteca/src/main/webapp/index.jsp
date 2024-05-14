<%-- index.jsp --%>
<%-- @author Antonio J.Sánchez --%>
<%-- @author José David Quero  --%>
<%@page contentType="text/html" pageEncoding="utf-8" %>
<%@page import="clases.DB"     %>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.Statement"  %>
<%@page import="java.sql.ResultSet"  %>
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

        <menu>
            <a href="nueva.jsp">Añadir película</a>
        </menu>

        <main>
           
            <table class="table">
                <thead class="table-dark">
                    <tr>
                        <th>título</th>
                        <th>director</th>
                        <th>año</th>
                        <th></th>
                        <th></th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                <%
                    Connection conexion = DB.getDB("videoteca") ;
                    Statement consulta  = conexion.createStatement() ;

                    // lanzamos la consulta
                    String sql = "SELECT * FROM pelicula ORDER BY anio ;" ;
                    ResultSet res = consulta.executeQuery(sql) ;

                    while(res.next()) {
                %>
                    <tr>
                        <td><%= res.getString("titulo")   %></td>
                        <td><%= res.getString("director") %></td>
                        <td><%= res.getString("anio").substring(0, 4) %></td>
                        <td><a href="info.jsp?id=<%= res.getString("idPel") %>">info</a></td>
                        <td><a href="editar.jsp?id=<%= res.getString("idPel") %>">editar</a></td>
                        <td><a href="borrar.jsp?id=<%= res.getString("idPel") %>">borrar</a></td>
                    </tr>
                <%  
                    }

                    conexion.close() ;
                %>
                </tbody>
            </table>

        </main>

    </div>
</body>
</html>
