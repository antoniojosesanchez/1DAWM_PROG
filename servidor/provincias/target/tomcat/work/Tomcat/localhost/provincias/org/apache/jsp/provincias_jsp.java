/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2024-05-07 07:22:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import clases.Conexion;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public final class provincias_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Provincias</title>\r\n");
      out.write("    <meta charset=\"utf-8\" />\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    <h1>Provincias</h1>\r\n");
      out.write("\r\n");
      out.write("    ");

        request.setCharacterEncoding("utf-8") ; 
        String codCCAA = request.getParameter("ccaa") ;

        Connection conexion = Conexion.getConexion("ccaa") ;
        Statement consulta  = conexion.createStatement() ;
        ResultSet resultado = consulta.executeQuery("SELECT * FROM provincia WHERE codCCAA = " + codCCAA + " ; ") ;
    
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <table>\r\n");
      out.write("        <thead>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th>Nombre</th>\r\n");
      out.write("                <th></th>\r\n");
      out.write("                <th></th>\r\n");
      out.write("                <th></th>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </thead>\r\n");
      out.write("\r\n");
      out.write("        <tbody>\r\n");
      out.write("    ");

        while(resultado.next()) {
           out.println("<tr>") ;
           out.println("<td>" + resultado.getString("nomProv") +  "</td>") ;
           out.println("<td></td>") ;
           out.println("<td>editar</td>") ;
           out.println("<td><a href=\"borrarProvincia.jsp?cod=" + resultado.getString("codProv") + "\">borrar</a></td>") ;           
           out.println("</tr>");
        }
    
      out.write("\r\n");
      out.write("        </tbody>\r\n");
      out.write("\r\n");
      out.write("    </table>\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("    ");

        conexion.close()  ;        
    
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <br/>\r\n");
      out.write("    <!--<a href=\"insertarProvincia.jsp\">Insertar nueva provincia</a>-->\r\n");
      out.write("    <form action=\"insertarProvincia.jsp\" method=\"post\">\r\n");
      out.write("        <input type=\"hidden\" name=\"ccaa\" value=\"");
      out.print( codCCAA  );
      out.write("\" />\r\n");
      out.write("        <button>Insertar nueva provincia</button>\r\n");
      out.write("    </form>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write(" ");
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
