<%-- index.jsp --%>
<%@page contentType="text/html" pageEncoding="utf-8" %>
<%@page import="clases.Conexion" %>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.Statement" %>
<%@page import="java.sql.ResultSet" %>
<!DOCTYPE html>
<head>
    <title>Provincias</title>
    <meta charset="utf-8" />
</head>

<body>

    <h1>Provincias</h1>

    <%
        request.setCharacterEncoding("utf-8") ; 
        String codCCAA = request.getParameter("ccaa") ;

        Connection conexion = Conexion.getConexion("ccaa") ;
        Statement consulta  = conexion.createStatement() ;
        ResultSet resultado = consulta.executeQuery("SELECT * FROM provincia WHERE codCCAA = " + codCCAA + " ; ") ;
    %>

    <table>
        <thead>
            <tr>
                <th>Nombre</th>
                <th></th>
                <th></th>
                <th></th>
            </tr>
        </thead>

        <tbody>
    <%
        while(resultado.next()) {
           out.println("<tr>") ;
           out.println("<td>" + resultado.getString("nomProv") +  "</td>") ;
           out.println("<td></td>") ;
           out.println("<td>editar</td>") ;
           out.println("<td><a href=\"borrarProvincia.jsp?cod=" + resultado.getString("codProv") + "\">borrar</a></td>") ;           
           out.println("</tr>");
        }
    %>
        </tbody>

    </table>
   

    <%
        conexion.close()  ;        
    %>

    <br/>
    <!--<a href="insertarProvincia.jsp">Insertar nueva provincia</a>-->
    <form action="insertarProvincia.jsp" method="post">
        <input type="hidden" name="ccaa" value="<%= codCCAA  %>" />
        <button>Insertar nueva provincia</button>
    </form>

</body>
</html>
 