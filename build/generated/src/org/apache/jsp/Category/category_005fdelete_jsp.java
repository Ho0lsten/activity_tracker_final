package org.apache.jsp.Category;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Arrays;
import java.lang.reflect.Array;
import Category.categoryGetter;
import Hibernate.Category;
import Hibernate.HibernateUtil;
import Category.categoryDelete;
import Category.categorySetter;

public final class category_005fdelete_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");

    String[] checked = request.getParameterValues("checker");
    out.println(Arrays.toString(checked));
    if (checked != null) {
        for (int i = 0; i < checked.length; i++) {
            String id = checked[i];
            out.println(id);
            Integer catid = Integer.parseInt(id);
            categoryDelete.categoryDeleteById(catid);
        }}
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\r\n");
      out.write("    <title>Activity Tracker - delete category</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap -->\r\n");
      out.write("    <link href=\"../css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Font Awesome -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/font-awesome.min.css\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom Style -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/style.css\">\r\n");
      out.write("\r\n");
      out.write("    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<!-- Jumbotron -->\r\n");
      out.write("<div class=\"jumbotron\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <h1>Kategorien löschen.</h1>\r\n");
      out.write("        <p>leeeschen</p> \r\n");
      out.write("    </div>\r\n");
      out.write("</div><!-- /End Jumbotron -->\r\n");
      out.write("\r\n");
      out.write("<form action=\"category_delete.jsp\">\r\n");
      out.write("    <input type=\"text\" name=\"ID\">\r\n");
      out.write("    <input type=\"submit\" value=\"OK\">\r\n");
      out.write("    ");
 String s1 = request.getParameter("ID");
        try {
            if (s1 != null) {
                categoryDelete.categoryDeleteById(Integer.parseInt(s1));
            }
        } catch (Exception e) {
            out.println("Bitte gültige ID eingeben!");
        }
    
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("    function toggle_visibility(id) {\r\n");
      out.write("        var e = document.getElementById(id);\r\n");
      out.write("        if (e.style.display === 'none')\r\n");
      out.write("            e.style.display = 'block';\r\n");
      out.write("        else\r\n");
      out.write("            e.style.display = 'none';\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<br></br>\r\n");
      out.write("\r\n");
      out.write("<a href=\"#\" onclick=\"toggle_visibility('foo');\">Kategorien anzeigen</a>\r\n");
      out.write("<br></br>\r\n");
      out.write("\r\n");
      out.write("<div id=\"foo\" class=\"panel panel-default\">\r\n");
      out.write("    <!-- Default panel contents -->\r\n");
      out.write("    <div class=\"panel-heading\">Kategorien</div>\r\n");
      out.write("\r\n");
      out.write("    <!-- Table -->\r\n");
      out.write("    <table class=\"table\" width=”600px” border=”1″ bgcolor=”#FFF380″> \r\n");
      out.write("        <tr>\r\n");
      out.write("            <th width=”100px”>ID</th>\r\n");
      out.write("            <th width=”100px”>Name</th>\r\n");
      out.write("            <th width=\"100px\">Beschreibung</th>\r\n");
      out.write("            <th width=”100px”>Typ</th>\r\n");
      out.write("            <th width=”100px”>Löschen</th>\r\n");
      out.write("\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr> \r\n");
      out.write("        <form action=\"category_delete.jsp\" method=\"POST\">\r\n");
      out.write("            ");

                Category[] CategoryArr = categoryGetter.getCategorys();
                for (int i = 0; i < CategoryArr.length; i++) {
            
      out.write(" \r\n");
      out.write("            <tr>\r\n");
      out.write("                <td><b>");
      out.print(CategoryArr[i].getCategoryId());
      out.write("</b></td>\r\n");
      out.write("                <td><b>");
      out.print(CategoryArr[i].getCategoryName());
      out.write("</b></td>\r\n");
      out.write("                <td><b>");
      out.print(CategoryArr[i].getCategoryDescription());
      out.write("</b></td>\r\n");
      out.write("                <td><b>");
      out.print(CategoryArr[i].getCategoryType());
      out.write("</b></td>\r\n");
      out.write("                <td><input type=\"checkbox\" name=\"checker\" value=\"");
      out.print(CategoryArr[i].getCategoryId());
      out.write("\"></td>                \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                ");
 }
                    // 
                    //   Integer ID = CategoryArr[i].getCategoryId();
                    // out.println(ID);

                    //}
                    // String checked[] = request.getParameterValues("checker");
                    // if (checked != null) {
                    //    out.println(checked[1]);
                    //  out.println(CategoryArr[0].getCategoryId());
                    // out.println(CategoryArr[0].getCategoryName());
                    HibernateUtil.getSessionFactory().getCurrentSession().disconnect();

                
      out.write("   \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <input type=\"submit\" value=\"Delete\">\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("        </tr>\r\n");
      out.write("\r\n");
      out.write("    </table>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<hr>\r\n");
      out.write("\r\n");
      out.write("<footer>\r\n");
      out.write("    <p>&copy; 2016 MoveoMed, GmbH</p>\r\n");
      out.write("</footer>\r\n");
      out.write("</div> <!-- /container -->  \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\r\n");
      out.write("<!-- Include all compiled plugins (below), or include individual files as needed -->\r\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("</html>\r\n");
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
