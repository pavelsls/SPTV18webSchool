<%-- 
    Document   : addBooks
    Created on : Feb 17, 2020, 8:44:48 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Добавление предмета</title>
    </head>
    <body>
        <h1>Добавить предмет</h1>
        <p>${info}</p>
        <form method="POST" action="addSubjects">
            Название предмета: <input type="text" name="subjectName"><br>
            Часы в предмете: <input type="text" name="subjectHours"><br>
            <input type="submit" value="Создать">
        </form>
    </body>
</html>
