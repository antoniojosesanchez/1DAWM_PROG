<%-- @author Antonio J.Sánchez --%>
<%-- @author José David Quero --%>
<%@page contentType="text/html" pageEncoding="utf-8" %>
<%@page import="clases.DB" %>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.Statement" %>
<%@page import="java.sql.ResultSet" %>
<%@page import="java.sql.SQLException" %>
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

        <h1 class="text-center">Mi Aplicación</h1>
        <a class="btn btn-primary mt-4" href="nuevo.jsp?idu=<%= request.getParameter("idu") %>">Añadir recordatorio</a>
        <a class="btn btn-dark mt-4" href="guardar.jsp?idu=<%= request.getParameter("idu") %>">Guardar</a>
    
        <table class="table mt-4">
            <thead>
                <tr>
                    <th>Título</th>
                    <th></th>
                    <th></th>
                    <th></th>
                </tr>
            </thead>

            <tbody>
            <%
                // 2. establecemos conexión con el servidor de base de datos
                Connection conexion = DB.getDb() ;
                Statement consulta  = conexion.createStatement()  ;            
            
                // 3. lanzamos la consulta contra la base de datos            
                String sql = "SELECT * FROM recordatorio WHERE idUsu = " + request.getParameter("idu") + "; " ;
                
                ResultSet res = consulta.executeQuery(sql) ; 

                while(res.next()) {
            %>
                <tr>
                    <td><%= res.getString("titulo") %></td>
                    <td><a href="info.jsp?idr=<%= res.getString("idRec") %>">info</a></td>
                    <td><a href="editar.jsp?idr=<%= res.getString("idRec") %>">editar</a></td>
                    <td><a href="borrar.jsp?idr=<%= res.getString("idRec") %>">borrar</a></td>
                </tr>
            <%
                }

                conexion.close() ;
            %>
            </tbody>
        
        </table>

   




    </div>

</body>
</html>