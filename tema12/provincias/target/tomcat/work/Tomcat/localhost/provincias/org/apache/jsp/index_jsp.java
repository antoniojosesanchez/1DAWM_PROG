/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2024-05-06 07:48:18 UTC
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
      response.setContentType("text/html;charset=utf-8");
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
      out.write("<head>\n");
      out.write("    <title>Provincias</title>\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <h1>Comunidades Autónomas</h1>\n");
      out.write("\n");
      out.write("    ");

        Connection conexion = Conexion.getConexion("ccaa") ;
        Statement consulta  = conexion.createStatement() ;
        ResultSet resultado = consulta.executeQuery("SELECT * FROM ccaa ; ") ;
    
      out.write("\n");
      out.write("\n");
      out.write("    <form action=\"provincias.jsp\" method=\"post\">\n");
      out.write("\n");
      out.write("        <label for=\"ccaa\">Selecciona Comunidad Autónoma:</label>\n");
      out.write("        <select id=\"ccaa\" name=\"ccaa\">\n");
      out.write("    ");

        while(resultado.next()) {
            out.println("<option value=\"" + resultado.getString("codCCAA") + "\">") ;
            out.println(resultado.getString("nomCCAA")) ;
            out.println("</option>") ;
        }
    
      out.write("\n");
      out.write("        </select>\n");
      out.write("\n");
      out.write("        <br/>\n");
      out.write("\n");
      out.write("        <button>Seleccionar</button>\n");
      out.write("\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("    ");

        conexion.close()  ;        
    
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
