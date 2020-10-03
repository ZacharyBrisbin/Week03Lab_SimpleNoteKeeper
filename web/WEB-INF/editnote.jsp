<%-- 
    Document   : editnote
    Created on : Oct 1, 2020, 1:14:47 PM
    Author     : 696019
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Note Keeper: Edit</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>Edit Note</h2>
        <form method="post" action="notes">
            <strong>Title:</strong>
            <input type="text" name="title" value="${notes.title}"><br>
            <strong>Contents:</strong>
            <textarea name="content">${notes.content}</textarea><br>
            <input type="submit" value="Save">
        </form>
    </body>
</html>
