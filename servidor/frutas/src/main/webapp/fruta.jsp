<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@page import="clases.Fruta" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <title>Frutas</title>
    <!--<meta charset="UTF-8" />-->
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

    <style>
        img { width: 40%; }
    </style>
</head>
<body>

    <% 
        Fruta fruta ;

        // establecemos el tipo de codificación
        request.setCharacterEncoding("UTF-8") ;

        // creamos el objeto
        fruta = new Fruta(request.getParameter("fruta")) ;        
    %>

    <h4>Me gusta comer <%= fruta.getNombre() %></h4>

    <%= fruta  %>

</body>
</html>