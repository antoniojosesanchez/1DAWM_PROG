<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <title>Frutas</title>
    <meta charset="utf-8" />
</head>
<body>

    <h1>Frutas</h1>

    <form action="fruta.jsp" method="get">
        <label for="fruta">Selecciona una fruta (obligatoriamente): </label>
        <select id="fruta" name="fruta">
            <option value="kiwi">Kiwi</option>
            <option value="mango">Mango</option>
            <option value="melon">Melón</option>
            <option value="platano">Plátano</option>
            <option value="sandia">Sandía</option>
        </select>        

        <button>Enviar</button>
    </form>

</body>
</html>