<%-- 
    Document   : welcome
    Created on : Jul 1, 2024, 10:45:11 AM
    Author     : Clarke S.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" language="java"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
    <head>
       <link href="webjars/bootstrap/3.3.7-1/css/bootstrap.min.css" rel="stylesheet" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Note Tracker</title>
    </head>
    <body>
        <h1>Hello ${name}</h1>
        <form:form action="note-submit" modelAttribute="note">
            <div class="mb-3">
                <label class="form-label" for="forTitleFeild">Enter Title: </label>
                <form:input class="form-control" type="text" path="title"/>
                <form:errors path="title" class="text-danger"/>
            </div>
            
            <div class="mb-3">
                <label class="form-label" for="forNoteFeild">Enter Note: </label>
                <form:textarea class="form-control" name="data" rows="4" cols="25" path="data"/>
            </div>
            <input type="submit" value="Send It!!"/>
        </form:form>
           <br><br>
        <a href="/find-all-notes">See All Notes.</a>
 
    </body>
</html>

