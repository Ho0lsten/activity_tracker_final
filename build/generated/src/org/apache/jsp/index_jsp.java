package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\r\n");
      out.write("    <title>Activity Tracker</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap -->\r\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Font Awesome -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom Style -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("\r\n");
      out.write("    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Jumbotron -->\r\n");
      out.write("<div class=\"jumbotron\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <h1>Activity Tracker</h1>\r\n");
      out.write("        <p>Wir haben doch keine Zeit !</p> \r\n");
      out.write("    </div>\r\n");
      out.write("</div><!-- /End Jumbotron -->\r\n");
      out.write("\r\n");
      out.write("<!-- Header Navigation -->\r\n");
      out.write("\r\n");
      out.write("   <!-- Single button -->\r\n");
      out.write("   <div class=\"container\">\r\n");
      out.write("        <div class=\"col-md-4\">\r\n");
      out.write("            <button type=\"button\" class=\"btn btn-default dropdown-toggle\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                Kategorie<span class=\"caret\"></span>\r\n");
      out.write("            </button>\r\n");
      out.write("            <ul class=\"dropdown-menu\">\r\n");
      out.write("                <li><a href=\"Category/category_create.jsp\">anlegen</a></li>\r\n");
      out.write("                <li><a href=\"Category/category_delete.jsp\">löschen</a></li>\r\n");
      out.write("                <li><a href=\"Category/category_update.jsp\">bearbeiten</a></li>\r\n");
      out.write("                <li role=\"separator\" class=\"divider\"></li>\r\n");
      out.write("                <li><a href=\"#\">Übersicht</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("   <!-- Single button -->\r\n");
      out.write("        <div class=\"col-md-4\" >\r\n");
      out.write("            <button type=\"button\" class=\"btn btn-default dropdown-toggle\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                Aktivität <span class=\"caret\"></span>\r\n");
      out.write("            </button>\r\n");
      out.write("            <ul class=\"dropdown-menu\">\r\n");
      out.write("                <li><a href=\"Activity/activity_create.jsp\">anlegen</a></li>\r\n");
      out.write("                <li><a href=\"Activity/activity_delete.jsp\">löschen</a></li>\r\n");
      out.write("                <li><a href=\"Activity/activity_update.jsp\">bearbeiten</a></li>\r\n");
      out.write("                <li role=\"separator\" class=\"divider\"></li>\r\n");
      out.write("                <li><a href=\"#\">Übersicht</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("         <!-- Single button -->\r\n");
      out.write("        <div class=\"col-md-4\">\r\n");
      out.write("            <button type=\"button\" class=\"btn btn-default dropdown-toggle\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                Auswertung <span class=\"caret\"></span>\r\n");
      out.write("            </button>\r\n");
      out.write("            <ul class=\"dropdown-menu\">\r\n");
      out.write("                <li><a href=\"Statistics/analysis.jsp\">los !</a></li>\r\n");
      out.write("                <li role=\"separator\" class=\"divider\"></li>\r\n");
      out.write("                <li><a href=\"#\">Übersicht</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- End Header Navigation -->\r\n");
      out.write("        \r\n");
      out.write(" <div class=\"container\">\r\n");
      out.write("      <!-- Example row of columns -->\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <div class=\"col-md-4\">\r\n");
      out.write("          <h2>Kategorien verwalten</h2>\r\n");
      out.write("          <p>Erstellen Sie Kategorien für die Einordnung ihrer Aktivitäten. </p>\r\n");
      out.write("         \r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-4\">\r\n");
      out.write("          <h2>Aktivitäten verwalten</h2>\r\n");
      out.write("          <p>Dokumentieren Sie ihre Aktivitäten.</p>\r\n");
      out.write("         \r\n");
      out.write("       </div>\r\n");
      out.write("        <div class=\"col-md-4\">\r\n");
      out.write("          <h2>Auswertung</h2>\r\n");
      out.write("          <p>Verschaffen Sie sich einen Überblick.</p>\r\n");
      out.write("         \r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <hr>\r\n");
      out.write("\r\n");
      out.write("      <footer>\r\n");
      out.write("        <p>&copy; 2016 MoveoMed, GmbH</p>\r\n");
      out.write("      </footer>\r\n");
      out.write("    </div> <!-- /container -->  \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\r\n");
      out.write("<!-- Include all compiled plugins (below), or include individual files as needed -->\r\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
