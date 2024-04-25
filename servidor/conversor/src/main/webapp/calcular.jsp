<%-- Ejercicio 7: calcular.jsp --%>
<%-- 
    @author Antonio J.Sánchez 
    @author José David Quero 
--%>
<%@page contentType="text/html" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Conversor</title>
    <meta charset="utf-8" />
</head>
<body>

    <h2>Conversor</h2>

    <% 
        int tipo ;
        Double cantidad ;
        Double resultado ;

        request.setCharacterEncoding("utf-8") ; 

        tipo     = Integer.parseInt(request.getParameter("tipo")) ;
        cantidad = Double.parseDouble(request.getParameter("cantidad")) ;

        switch(tipo) {

            case 0 :    
                resultado = 166.386 * cantidad ;
                out.println(cantidad + " euros son " ) ;
                out.println(String.format("<strong>%.0f</strong>", resultado) + " pesetas") ;
                break ;

            case 1:
                resultado = cantidad / 166.386 ;
                out.println(String.format("%.0f",cantidad) + " pesetas son ") ;
                out.println(String.format("<strong>%.2f</strong>",resultado) + " euros") ;
                break ;

            default:
                out.println("No se puede realizar el cálculo. El tipo de conversión es incorrecto.") ;
        }
        
    %>


</body>
</html>