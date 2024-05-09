<%-- detalles.jsp --%>
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

        // Recuperamos el valor de la clave primaria del pokemón que se
        // nos envía desde el archivo index.jsp en forma de parámetro
        //
        // IMPORTANTE: debemos recordar que el valor de todos los pará-
        // metros se reciben SIEMPRE en formato STRING.
        String codEsp = request.getParameter("codEsp") ;

        // conectamos con el servidor de bases de datos
         Connection conexion = Conexion.getConnection("pokemon") ;

        // creamos una sentencia y la lanzamos
        Statement consulta  = conexion.createStatement() ;
        ResultSet resultado = consulta.executeQuery("SELECT * FROM especie WHERE codEsp = " + codEsp + " ;") ;

        // colocamos el cursor en el primer registro del conjunto de resultados
        // que, en este caso, sólo debe haber devuelto una única fila (registro).
        if (!resultado.next()) {
             out.println("No existe esa especie.") ;
        } else {
    %>


    <h2><%= resultado.getString("nombre") %></h2>
    <ul type="square">
        <li>Altura: <%= resultado.getString("altura") %> cms.</li>
        <li>Peso: <%= resultado.getString("peso") %> kgs.</li>
    </ul>

    <% 

            // buscamos los movimientos asociados al pokemón
            String sql = "SELECT * FROM movimiento M " +
                        "JOIN especie_movimiento EM " +
                        "ON (M.codMov = EM.codMov)  " + 
                        "WHERE EM.codEsp = " + codEsp + " ;" ;

            resultado = consulta.executeQuery(sql) ;

            // mostramos los movimientos
    %>

        <h3>Movimientos del Pokemón</h3>
            <table>
                <thead>
                    <tr>
                        <th>Descripción</th>
                        <th></th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
    <%
            while(resultado.next()) {
                out.println("<tr>") ;
                out.println("<td>" + resultado.getString("descripcion") + "</td>") ;
                out.println("<td><a href=\"editar.jsp?codMov=" +  resultado.getString("codMov") + "\">editar</a></td>") ;
                out.println("<td><a href=\"borrar.jsp?codMov=" +  resultado.getString("codMov") + "\">borrar</a></td>") ;
                out.println("</tr>") ;
            }
    %>
                </tbody>
            </table>

    <%
        } // if línea 41          
    %>

</body>
</html>
