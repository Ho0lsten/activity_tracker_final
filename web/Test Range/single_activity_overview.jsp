<%-- 
    Document   : single_activity_overview
    Created on : 08.12.2016, 17:06:33
    Author     : MM-Produktion
--%>

<%@page import="Activity.activityGetter"%>
<%@page import="Hibernate.Activity"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form>
            <%  String s0 = request.getParameter("ID");
                if (s0 != null) {
                    Activity cat = activityGetter.getActivityById(Integer.parseInt(s0));
                    String s1 = cat.getCategoryName();
                    // out.println(s1);
                    String s2 = cat.getCategoryDescription();
                    // out.println(s2);
                    String s3 = cat.getCategoryType();
                    // out.println(s3);
                    // Array s4[] = cat.getActivities();            

                    // request.setAttribute("Type", s3);
                    // request.setAttribute("Activities", s3);

            %> 
        </form>
        <form action="single_category_overview.jsp">
            <input type="submit" name="Update!">
            <input type="hidden" name="ID" value="<%=s0%>">
            Name: <input type="text" name="Name" value="<%=s1%>">
            Beschreibung: <input type="text" name="Description" value="<%=s2%>">
            Typ: <input type="text" name="Type" value="<%=s3%>">
            Aktivitäten: <input type="text" name="Activities" value="<%//=s4%>">
            <input type="submit" name="Update!">

            <%}
                String u0 = request.getParameter("ID");
                String u1 = request.getParameter("Name");
                String u2 = request.getParameter("Description");
                String u3 = request.getParameter("Type");

                if (u0 != null && u1 != null && u2 != null && u3 != null) {
                    categorySetter.updateCategoryById(Integer.parseInt(u0), u1, u2, u3);
                    out.println("Die Kategorie " + u1 + " wurde erfolgreich geändert.");
                }


            %>
        </form>
    </body>
</html>
