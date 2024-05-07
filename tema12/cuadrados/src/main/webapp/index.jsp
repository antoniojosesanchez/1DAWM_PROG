<%-- index.jsp --%>
<%-- @author Antonio J. Sánchez --%>
<%-- @authorJosé David Quero --%>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <title>Cuadrados</title>
    <meta charset="utf-8" />
    <style>
        table { margin: auto; }
        td { border: solid 1px #000; text-align: center; }
    </style>
</head>
<body>

    <%-- Muestra los cuadrados de los 100 primeros números en una tabla HTML --%>


    <table>
        <thead>
        <tr>
            <th></th>
        </tr>
    <%
        int multi ;

        
        for(int i = 1; i <= 100; i++) {

            multi = i*i ;   // cuadrado
            out.println("<tr><td>" + multi + "</td></tr>") ;
        }         
    %>
    </table>

</body>
</html>