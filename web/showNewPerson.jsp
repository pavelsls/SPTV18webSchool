<%-- 
    Document   : showNewReader
    Created on : Feb 17, 2020, 9:45:59 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Добавить ученика/учителя</title>
    </head>
    <body>
        <h1>Добавить ученика/учителя</h1>
        <p id="info">${info}</p>
        <form action="addPerson" method="POST">
            Имя: <input type="text" name="name" value="${name}"><br>
            Фамилия: <input type="text" name="lastName" value="${lastName}"><br>
            Исикукод: <input type="text" name="isikukood" value="${isikukood}"><br>
            Ученик/Учитель: <input type="text" name="person" value="${person}"><br>
            <button type="submit">Добавить</button>
        </form>
    </body>
</html>
