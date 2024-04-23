<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <title>Frutas</title>
    <!--<meta charset="UTF-8" />-->
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>

    <% request.setCharacterEncoding("UTF-8") ; %>
    <h4>Me gusta comer <%= request.getParameter("fruta") %></h4>


</body>
</html>