/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2024-05-15 11:44:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import clases.DB;
import java.sql.Connection;
import java.sql.ResultSet;

public final class nuevo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"es\">\r\n");
      out.write("<head>\r\n");
      out.write("    <title></title>\r\n");
      out.write("    <meta charset=\"utf-8\" />\r\n");
      out.write("\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\" />\r\n");
      out.write("\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("    <style>\r\n");
      out.write("        p { text-align: justify ; }\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("     <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("        <h1>Videoteca</h1>\r\n");
      out.write("        <h5>Añadir película</h5>   \r\n");
      out.write("\r\n");
      out.write("        ");

            // conectamos con la base de datos
            Connection conexion = DB.getDB("videoteca") ;

            if (request.getParameterMap().isEmpty()) {
    
        
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <form action=\"nuevo.jsp\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("            <!-- Título -->\r\n");
      out.write("            <div class=\"row mt-4\">\r\n");
      out.write("                <div class=\"col-sm-6\">\r\n");
      out.write("                    <label class=\"form-label fw-bold\" for=\"titulo\">Título: </label>\r\n");
      out.write("                    <input class=\"form-control\" id=\"titulo\" \r\n");
      out.write("                           type=\"text\" name=\"titulo\" />\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- -->\r\n");
      out.write("            <div class=\"row mt-2\">\r\n");
      out.write("\r\n");
      out.write("                <!-- Director -->\r\n");
      out.write("                <div class=\"col-sm-4\">\r\n");
      out.write("                    <label class=\"form-label fw-bold\" for=\"director\">Director: </label>\r\n");
      out.write("                    <input class=\"form-control\" id=\"director\" \r\n");
      out.write("                           type=\"text\" name=\"director\" />\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- Duración -->\r\n");
      out.write("                <div class=\"col-sm-2\">\r\n");
      out.write("                    <label class=\"form-label fw-bold\" for=\"duracion\">Duración: </label>\r\n");
      out.write("                    <input class=\"form-control\" id=\"duracion\" \r\n");
      out.write("                           type=\"text\" name=\"duracion\" />\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- Año de Estreno -->\r\n");
      out.write("                <div class=\"col-sm-2\">\r\n");
      out.write("                    <label class=\"form-label fw-bold\" for=\"anio\">Año de Estreno: </label>\r\n");
      out.write("                    <input class=\"form-control\" id=\"anio\" \r\n");
      out.write("                           type=\"text\" name=\"anio\"  />\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <!-- Póster -->\r\n");
      out.write("                <div class=\"col-sm-4\">\r\n");
      out.write("                    <label class=\"form-label fw-bold\" for=\"poster\">URL imagen: </label>\r\n");
      out.write("                    <input class=\"form-control\" id=\"poster\" \r\n");
      out.write("                           type=\"text\" name=\"poster\"  />\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <!-- Argumento -->\r\n");
      out.write("            <div class=\"row mt-2\">\r\n");
      out.write("                <div class=\"col\">\r\n");
      out.write("                     <label class=\"form-label fw-bold\" for=\"argumento\">Argumento: <span class=\"fw-normal\">(300 caracteres máximo)</span> </label>\r\n");
      out.write("                     <textarea class=\"form-control\" id=\"argumento\" name=\"argumento\" rows=\"8\"></textarea>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Botonera -->\r\n");
      out.write("            <div class=\"row mt-2\">\r\n");
      out.write("                <div class=\"col text-end\">\r\n");
      out.write("                    <button class=\"btn btn-danger\">Guardar película</button> \r\n");
      out.write("                    <a class=\"btn btn-dark\" href=\"http://localhost:8080/videoteca\">Cancelar</a>\r\n");
      out.write("                    <!--<button type=\"button\" onclick=\"javascript: history.back() ;\" class=\"btn btn-dark\">Cancelar</button>-->\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    ");
 
         } else {

            // construyo la consulta
            String sql = "INSERT INTO pelicula(titulo, director, argumento, duracion, anio, poster) VALUES (" +
                         "'" + request.getParameter("titulo")    + "', " +
                         "'" + request.getParameter("director")  + "', " +
                         "'" + request.getParameter("argumento") + "', " +
                         ""  + request.getParameter("duracion")  + ", "  +
                         "'" + request.getParameter("anio")      + "', " +
                         "'" + request.getParameter("poster")    + "'" +
                         ") ;" ;


            //out.println(sql) ;

            // lanzamos la consulta
            conexion.createStatement().execute(sql) ;
            
            // cerramos la conexión
            conexion.close() ;

            // redirigimos
            response.sendRedirect("http://localhost:8080/videoteca") ;

        } 
    
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
