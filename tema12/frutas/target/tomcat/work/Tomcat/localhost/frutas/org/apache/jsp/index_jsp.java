/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2024-05-02 12:10:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import clases.Fruta;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("<head>\n");
      out.write("    <title>Frutas</title>\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("\n");
      out.write("    <style>\n");
      out.write("        img { width: 40%; }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <h1>Frutas</h1>\n");
      out.write("\n");
      out.write("    ");
 

        // Establecemos la conexión con la Base de Datos
        Class.forName("com.mysql.jdbc.Driver") ;
        Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/frutas", "root", "") ;
        Statement consulta  = conexion.createStatement() ;


        if (request.getParameterMap().isEmpty()) { 

            String id ;
            String nombre ;
           
            ResultSet resultado = consulta.executeQuery("SELECT * FROM fruta ;") ;
    
      out.write("\n");
      out.write("\n");
      out.write("        <form action=\"index.jsp\" method=\"get\">\n");
      out.write("            <label for=\"fruta\">Selecciona una fruta (obligatoriamente): </label>\n");
      out.write("            <select id=\"fruta\" name=\"fruta\">\n");
      out.write("    ");

            while(resultado.next()) {

                id = resultado.getString("id") ;
                nombre = resultado.getString("nombre") ;

                out.println(" <option value=\"" + id + "\">" + nombre + "</option>  ") ;
            }                
    
      out.write("\n");
      out.write("            </select>        \n");
      out.write("\n");
      out.write("            <button>Enviar</button>\n");
      out.write("        </form>\n");
      out.write("    ");

        } else {     
            
             // establecemos el tipo de codificación
            request.setCharacterEncoding("UTF-8") ;

            ResultSet resultado = consulta.executeQuery("SELECT * FROM fruta WHERE id = " + request.getParameter("fruta")) ;
            resultado.next() ;
            
            // creamos el objeto
            Fruta fruta = new Fruta(resultado.getString("id"), 
                                    resultado.getString("nombre")) ; 

            out.println("<h4>Me gusta comer " + fruta.getNombre() + "</h4>") ;
            out.println(fruta) ;             
        }

         conexion.close() ;

    
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
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
