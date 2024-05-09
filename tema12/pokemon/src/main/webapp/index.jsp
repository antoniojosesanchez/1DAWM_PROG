<%-- index.jsp --%>
<%-- @author Antonio J. Sánchez --%>
<%-- @author José David Quero --%>
<%@page contentType="text/html" pageEncoding="utf-8" %>
<%@page import="clases.Conexion" %>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.Statement" %>
<%@page import="java.sql.ResultSet" %>
<!DOCTYPE hmtl>
<html>
<head>
    <title>Pokemón</title>
    <meta charset="utf-8" />

    <style>
        td { border: solid 1px #000; }
    </style>
</head>
<body>

    <h1>Pokemón</h1>

    <%
        // conectamos con el servidor de Bases de Datos
        Connection conexion = Conexion.getConnection("pokemon") ;

        // creamos una sentencia y la lanzamos
        // podemos hacerlo en dos pasos...
        //Statement consulta  = conexion.createStatement() ;
        //ResultSet resultado = consulta.executeQuery("SELECT * FROM especie ;") ;

        // o enlazando métodos...
        ResultSet resultado = conexion.createStatement()
                                      .executeQuery("SELECT * FROM especie ORDER BY nombre ASC ;") ;

    %>
    <table>
        <thead>
            <tr>
                <th>Nombre del pokemón</th>
                <th></th>
            </tr>
        </thead>
        <tbody>

    <% while (resultado.next()) { %>
            <tr>
                <td><%= resultado.getString("nombre") %></td>
                <td>
                    <form action="detalles.jsp" method="post">
                        <input type="hidden" name="codEsp" value="<%= resultado.getString("codEsp") %>" />
                        <button>detalles</button>
                    </form>
                </td>
            </tr> 
    
    <% } %>
        </tbody>
    </table>
    <% 

        // ceramos la conexión
        // IMPORTANTE: NO SE NOS DEBE OLVIDAR
        conexion.close() ; 
    %>

</body>
</html>
