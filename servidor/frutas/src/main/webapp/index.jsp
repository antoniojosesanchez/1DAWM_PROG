<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <title>Frutas</title>
    <meta charset="utf-8" />
</head>
<body>

    <h1>Frutas</h1>

    <form action="fruta.jsp" method="post">
        <label for="fruta">Introduce una fruta (obligatoriamente): </label>
        <input id="fruta" type="text" name="fruta" required />

        <button>Enviar</button>
    </form>

</body>
</html>