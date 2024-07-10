<%-- 
    Document   : welcome
    Created on : Jul 1, 2024, 10:45:11 AM
    Author     : Clarke S.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Note Tracker</title>
    </head>
    <body>
        <h1>Hello ${name}</h1>
        <form:form action="note-submit" modelAttribute="note">
            Enter Note: <form:input type="text" path="title"/>
            <br><br>
            Enter Note: <form:textarea name="data" rows="4" cols="25" path="data"/>
            <br><br>
            <input type="submit" value="Send It!!"/>
        </form:form>
           
        <a href="/note-get-all">See Notes!!</a>
 
    </body>
</html>

