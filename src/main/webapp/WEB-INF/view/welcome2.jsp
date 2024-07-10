<%-- 
    Document   : welcome
    Created on : Jul 1, 2024, 10:45:11 AM
    Author     : Clarke S.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Note Tracker</title>
    </head>
    <body>
        <h1>Hello ${name}</h1>
        <form action="submit-form" method = "POST">
            Enter Note: <input type="text" name="title" value="${note.title}">
            <br><br>
            Enter Note: <textarea name="data" rows="4" cols="25">${note.data}</textarea>
            <br><br>
            <input type="submit" value="Send It!!">
        </form>
    </body>
</html>
