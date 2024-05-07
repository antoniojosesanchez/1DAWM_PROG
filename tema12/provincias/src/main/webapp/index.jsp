<%-- index.jsp --%>
<%-- @author Antonio J. Sánchez --%>
<%-- @authorJosé David Quero --%>
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

    <h1>Comunidades Autónomas</h1>

    <%
        Connection conexion = Conexion.getConexion("ccaa") ;
        Statement consulta  = conexion.createStatement() ;
        ResultSet resultado = consulta.executeQuery("SELECT * FROM ccaa ; ") ;
    %>

    <form action="provincias.jsp" method="post">

        <label for="ccaa">Selecciona Comunidad Autónoma:</label>
        <select id="ccaa" name="ccaa">
    <%
        while(resultado.next()) {
            out.println("<option value=\"" + resultado.getString("codCCAA") + "\">") ;
            out.println(resultado.getString("nomCCAA")) ;
            out.println("</option>") ;
        }
    %>
        </select>

        <br/>

        <button>Seleccionar</button>

    </form>

    <%
        conexion.close()  ;        
    %>

</body>
</html>
 