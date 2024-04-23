<%-- holamundo.jsp  --%>
<%-- @author: Antonio José Sánchez --%>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <title>Hola Mundo</title>    
    <meta charset="UTF-8" />
</head>
<body>

    <!-- Un comentario -->
    
    <%= "<h1>¡Hola Mundo!</h1>" %>
    <%
       
        for(int i=1; i <= 6; i++) {
            out.println("<h" + i + ">Hola, ke ase</h" + i + ">") ;            
        }


        // 
        out.println("<strong>Número aleatorio:</strong> " + Math.random()) ;
    %>

</body>
</html>
