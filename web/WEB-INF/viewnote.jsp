<%-- 
    Document   : viewnote
    Created on : Oct 1, 2020, 1:14:26 PM
    Author     : 696019
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Note Keeper</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>View Note</h2>
        <strong>Title:</strong><p>${notes.title}</p>
        <strong>Contents:</strong><p>${notes.content}</p>
        <a href="notes?edit">Edit</a>
    </body>
</html>
