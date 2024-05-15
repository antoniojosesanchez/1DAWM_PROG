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
        <h5>Editar película</h5>   

        <%

            String sql ;

            // recuperamos la clave primaria (que nos la pasan desde el index.jsp)
            String idPel = request.getParameter("id") ;

            // conectamos con la base de datos
            Connection conexion = DB.getDB("videoteca") ;

            if (request.getParameterMap().size() == 1) {

                // lanzamos la consulta
                sql = "SELECT * FROM pelicula WHERE idPel = " + idPel + ";" ;
                ResultSet res = conexion.createStatement().executeQuery(sql) ;

                res.next() ;
        
        %>

        <form action="editar.jsp" method="post">

            <input type="hidden" name="id" value="<%= idPel %>" />

            <!-- Título -->
            <div class="row mt-4">
                <div class="col-sm-6">
                    <label class="form-label fw-bold" for="titulo">Título: </label>
                    <input class="form-control" id="titulo" 
                           type="text" name="titulo" value="<%= res.getString("titulo") %>" />
                </div>
            </div>

            <!-- -->
            <div class="row mt-2">

                <!-- Director -->
                <div class="col-sm-4">
                    <label class="form-label fw-bold" for="director">Director: </label>
                    <input class="form-control" id="director" 
                           type="text" name="director" value="<%= res.getString("director") %>" />
                </div>

                <!-- Duración -->
                <div class="col-sm-2">
                    <label class="form-label fw-bold" for="duracion">Duración: </label>
                    <input class="form-control" id="duracion" 
                           type="text" name="duracion" value="<%= res.getString("duracion") %>" />
                </div>

                <!-- Año de Estreno -->
                <div class="col-sm-2">
                    <label class="form-label fw-bold" for="anio">Año de Estreno: </label>
                    <input class="form-control" id="anio" 
                           type="text" name="anio" value="<%= res.getString("anio").substring(0,4) %>" />
                </div>


                <!-- Póster -->
                <div class="col-sm-4">
                    <label class="form-label fw-bold" for="poster">URL imagen: </label>
                    <input class="form-control" id="poster" 
                           type="text" name="poster" value="<%= res.getString("poster") %>" />
                </div>

            </div>


            <!-- Argumento -->
            <div class="row mt-2">
                <div class="col">
                     <label class="form-label fw-bold" for="argumento">Argumento: <span class="fw-normal">(300 caracteres máximo)</span> </label>
                     <textarea class="form-control" id="argumento" name="argumento" rows="8"><%= res.getString("argumento") %></textarea>
                </div>
            </div>

            <!-- Botonera -->
            <div class="row mt-2">
                <div class="col text-end">
                    <button class="btn btn-danger">Guardar película</button> 
                    <a class="btn btn-dark" href="http://localhost:8080/videoteca">Cancelar</a>
                    <!--<button type="button" onclick="javascript: history.back() ;" class="btn btn-dark">Cancelar</button>-->
                </div>
            </div>

        </form>

    </div>
    <% 
    
            // cerramos la conexión
            conexion.close() ;

         } else {

            // construyo la consulta
            sql =  "UPDATE pelicula SET " +
                "titulo='" + request.getParameter("titulo") + "', " +
                "director='" + request.getParameter("director") + "', " +
                "argumento='" + request.getParameter("argumento") + "', " +
                "duracion= " + request.getParameter("duracion") + "," +
                "anio='" + request.getParameter("anio") + "', " +
                "poster='" + request.getParameter("poster") + "' " +
                "WHERE idPel = " + idPel + ";" ; 


            //out.println(sql) ;

            // lanzamos la consulta
            conexion.createStatement().execute(sql) ;
            
            // cerramos la conexión
            conexion.close() ;

            // redirigimos
            response.sendRedirect("http://localhost:8080/videoteca") ;

        } 
    %>



    <script>
        /*var boton = document.getElementById("cancelar") ;
            boton.onclick = function(event) { 
                event.preventDefault() ;
                history.back() ;                 
            }

            boton.addEventLister("click", function(event) {
                event.preventDefault() ;
                history.back() ; 
            }) ;*/
    </script>


</body>
</html>