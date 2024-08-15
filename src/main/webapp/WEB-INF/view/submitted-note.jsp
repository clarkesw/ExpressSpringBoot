<%-- 
    Document   : submitted-note
    Created on : Jul 2, 2024, 1:20:17 PM
    Author     : Clarke S.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <link rel="icon" type="image/x-icon" href="/images/favicon.ico">
        <title>Note Tracker ${count}</title>
    </head>
    <body>
        <center>
            <h3>
                My Note: ${note.title}
                <br><br><br><!-- comment -->
                ${note.details}
            </h3>            
        </center>
            
        <p></p>
    </body>
</html>

