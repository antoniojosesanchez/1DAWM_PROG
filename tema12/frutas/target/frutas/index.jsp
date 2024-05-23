<%-- index.jsp --%>
<%-- @author Antonio J. Sánchez --%>
<%-- @authorJosé David Quero --%>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.DriverManager" %>
<%@page import="java.sql.Statement" %>
<%@page import="java.sql.ResultSet" %>
<%@page import="java.util.ArrayList" %>
<%@page import="java.util.Collections" %>
<%@page import="clases.Fruta" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <title>Frutas</title>
    <meta charset="utf-8" />

    <style>
        img { width: 40%; }
    </style>
</head>
<body>

    <h1>Frutas</h1>

    <% 

        // Establecemos la conexión con la Base de Datos
        Class.forName("com.mysql.jdbc.Driver") ;
        Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/frutas", "root", "") ;       
        Statement consulta  = conexion.createStatement() ;


        if (request.getParameterMap().isEmpty()) { 

            String id ;
            String nombre ;
            Integer stock ;

            // 1. creamos un arraylist
            ArrayList<Fruta> datos = new ArrayList<Fruta>() ;
            
            // 2. recuperamos las frutas de la base de datos
            ResultSet res = consulta.executeQuery("SELECT * FROM fruta ;") ;

            // 3. guardamos en el arraylist todos los registros de la base de datos
            while(res.next()) {

                // recuperamos datos de cada registro (fruta)
                id = res.getString("id") ;
                nombre = res.getString("nombre") ;
                stock = Integer.parseInt(res.getString("stock")) ;

                // creamos el objeto fruta con los datos anteriores y lo guardamos en el arraylist
                datos.add(new Fruta(id, nombre, stock)) ;
            }

            // 4. ordenamos el arraylist
            Collections.sort(datos) ;


    %>

        <form action="index.jsp" method="get">
            <label for="fruta">Selecciona una fruta (obligatoriamente): </label>
            <select id="fruta" name="fruta">
    <%
            for(Fruta item: datos) {              

                out.println(" <option value=\"" + item.getId() + "\">" + item.getNombre() + "</option>  ") ;
            }                
    %>
            </select>        

            <button>Enviar</button>
        </form>
    <%
        } else {     
            
             // establecemos el tipo de codificación
            request.setCharacterEncoding("UTF-8") ;

            ResultSet resultado = consulta.executeQuery("SELECT * FROM fruta WHERE id = " + request.getParameter("fruta")) ;
            resultado.next() ;
            
            // creamos el objeto
            Fruta fruta = new Fruta(resultado.getString("id"), 
                                    resultado.getString("nombre"),
                                    Integer.parseInt(resultado.getString("stock"))) ; 

            out.println("<h4>Me gusta comer " + fruta.getNombre() + "</h4>") ;
            out.println(fruta) ;   
            out.println("<strong>Stock</strong>:" + fruta.getStock() + "<br/>") ;          
        }

         conexion.close() ;

    %>

</body>
</html>