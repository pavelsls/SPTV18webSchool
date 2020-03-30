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
        <title>Добавление Ученика/Учителя</title>
    </head>
    <body>
        <h1>Добавить Ученика/Учителя</h1>
        <p>${info}</p>
        <form method="POST" action="addPersons">
            Имя: <input type="text" name="name" value="${name}"><br>
            Фамилия: <input type="text" name="lastName" value="${lastName}"><br>
            Исикукод: <input type="text" name="isikukood" value="${isikukood}"><br>
            Ученик/Учитель: <input type="text" name="person" value="${person}"><br>
            <button type="submit">Добавить</button>
        </form>
    </body>
</html>
