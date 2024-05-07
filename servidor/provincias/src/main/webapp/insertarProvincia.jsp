<%-- insertarProvincia.jsp --%>
<%@page contentType="text/html" pageEncoding="utf-8" %>
<%@page import="clases.Conexion" %>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.Statement" %>
<!DOCTYPE html>
<head>
    <title>Provincias</title>
    <meta charset="utf-8" />
</head>

<body>

    <% if(request.getParameterMap().size() == 1) { %>

    <form action="insertarProvincia.jsp" method="post">

        <input type="hidden" name="ccaa" value="<%= request.getParameter("ccaa") %>" />

        <label for="prov">Introduce provincia:</label>
        <input id="prov" name="prov" type="text" autofocus required />

        <button>Guardar</button>

    </form>

    <% 
    } else { 

        request.setCharacterEncoding("UTF-8") ;

        String nombreProvincia = request.getParameter("prov") ;  
        String codCCAA = request.getParameter("ccaa")  ;
        String sql = "INSERT INTO provincia(codCCAA, nomProv) " +
                     "VALUES (" + codCCAA + " , '" + nombreProvincia + "') ;" ; 

        //out.println(sql) ;

        //
        Connection conexion = Conexion.getConexion("ccaa") ;
        Statement consulta  = conexion.createStatement() ;

        consulta.execute(sql) ;

        conexion.close() ;

        response.sendRedirect("http://localhost:8080/provincias") ;
    } %>


</body>
</html>