<%-- 
    Document   : submitted-note
    Created on : Jul 2, 2024, 1:20:17 PM
    Author     : Clarke S.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> --%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <title>Note Tracker - All Notes</title>
    </head>
    <body> 
        <center>
            <h3>
                ${notes}
          <%--      <c:forEach var="note" items="${notes}" >
                    ${note.title} - ${note.data} 
                    <br><br>
                </c:forEach> --%>
            </h3>            
        </center>
            
        <p></p>
    </body>
</html>
