<%-- editar.jsp --%>
<%-- @author Antonio J.Sánchez --%>
<%-- @author José David Quero  --%>
<%@page contentType="text/html" pageEncoding="utf-8" %>
<%@page import="clases.DB"     %>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.ResultSet"  %>
<!DOCTYPE html>
<html lang="es">
<head>
    <title></title>
    <meta charset="utf-8" />

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous" />

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>

    <style>
        p { text-align: justify ; }
    </style>

</head>
<body>

     <div class="container">

        <h1>Videoteca</h1>


        <form action="" method="post">

            <input type="hidden" name="id" value="1" />

            <label for="">Título: </label>
            <input type="text" name="titulo" />

            <label for="">Director: </label>
            <input type="text" name="director" />

            <label for="">Año: </label>
            <input type="number" name="anio" />

            <label for="">Título: </label>
            <textarea name="argumento"></textarea>

        </form>

    </div>


</body>
</html>