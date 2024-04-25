<%-- Ejercicio 7: index.jsp --%>
<%-- 
    @author Antonio J.Sánchez 
    @author José David Quero 
--%>
<%-- GET: solicitar información al servidor --%>
<%-- POST: envian datos al servidor para su procesamiento --%>
<%@page contentType="text/html" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Conversor</title>
    <meta charset="utf-8" />

    <link href="./assets/css/conversor.css" rel="stylesheet" />
</head>
<body>

    <h2>Conversor</h2>
    <form action="calcular.jsp" method="post">
        <label for="tipo">Selecciona tipo de conversión: </label>
        <select id="tipo" name="tipo">
            <option value="0">Euros a Pesetas</option>
            <option value="1">Pesetas a Euros</option>
        </select>

        <br/>

        <label for="cantidad">Cantidad a convertir: </label>
        <input id="cantidad" type="text" name="cantidad" />

        <br/>

        <button>Calcular</button>
    </form>

</body>
</html>
