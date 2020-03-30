<%-- 
    Document   : showNewBook
    Created on : Feb 17, 2020, 8:27:07 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Добавить новый предмет</title>
    </head>
    <body>
        <h1>Добавить новый предмет</h1>
        <p id="info">${info}</p>
        <form action="addSubject" method="POST">
            Название предмета: <input type="text" name="subjectName" value="${subjectName}"><br>
            Часы в предмете: <input type="text" name="subjectHours"  value="${subjectHours}"><br>
            <button type="submit">Добавить</button>
        </form>
    </body>
</html>
