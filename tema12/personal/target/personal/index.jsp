<%-- @author Antonio J.Sánchez --%>
<%-- @author José David Quero --%>
<%@page contentType="text/html" pageEncoding="utf-8" %>
<%@page import="clases.DB" %>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.Statement" %>
<%@page import="java.sql.ResultSet" %>
<%@page import="java.sql.SQLException" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <title></title>
    <meta charset="utf-8" />

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous" />

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>

</head>
<body>

    <% 
        String mensaje = "" ;

        if (!request.getParameterMap().isEmpty()) { 

            // recibo información en la petición HTTP
            // 1. recuperamos los parámetros (email, clave)
            String email = request.getParameter("email") ;
            String clave = request.getParameter("clave") ;

            // 2. establecemos conexión con el servidor de base de datos
            Connection conexion = DB.getDb() ;
            Statement consulta  = conexion.createStatement() ;            
        
            // 3. lanzamos la consulta contra la base de datos            
            String sql = "SELECT * FROM usuario WHERE email = '" + email + "' AND clave = '" + clave + "'; " ;
            
            ResultSet res = consulta.executeQuery(sql) ; 
            
            // 4. si hemos obtenido resultado, redirigimos, y si no, establecemos
            // un mensaje de error.
            if (!res.next()) { 
                mensaje = "Email o contraseña incorrecta." ; 
            } else {

                // redirigimos
                response.sendRedirect("main.jsp?id=" + res.getString("idUsu")) ;
            }

           conexion.close() ;
        }
        
    %>

    <div class="container">

        <form action="index.jsp" method="post">

            <div class="row mt-5">
                <div class="col-sm-6 mx-auto text-center">
                   <h1>Mi Aplicación</h1>
                </div>
            </div>

            <div class="row mt-5">
                <div class="col-sm-4 mx-auto">
                    <label class="form-label" for="email">Email:</label>
                    <input class="form-control" id="email" name="email" type="email" autofocus required />
                </div>
            </div>

            <div class="row">
                <div class="col-sm-4 mx-auto">
                    <label class="form-label"  for="clave">Contraseña:</label>
                    <input class="form-control" id="clave" name="clave" type="password" required />
                </div>
            </div>

            <%-- En caso de error muestra mensaje --%>
            <% if (!mensaje.isEmpty()) { %>
            <div class="row">
                <div class="col-sm-4 mx-auto">
                    <%= mensaje %>
                </div>
            </div>                
            <% } %>

            <div class="row mt-2">
                <div class="col-sm-4 mx-auto">
                <button class="btn btn-dark w-100">Enviar</button>
                </div>
            </div>
        </form>
    </div>


</body>
</html>
