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
        <form action="" method="post">
        <strong>Title:</strong>
        <input type="text" name="title" value="${title}">
        <strong>Contents:</strong>
        <textarea height="20" width="30" name="content" value="${content}">
        </form>
    </body>
</html>
