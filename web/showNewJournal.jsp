<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Выставить оценку</title>
    </head>
    <body>
        <p id="info">${info}</p>
        <form action="addJournal" method="POST">
            Список учеников: 
            <select name="personId">
                <c:forEach var="person" items="${listPersons}">
                    <option value="${person.id}">${person.name} ${person.lastName} ${person.personi}</option>
                </c:forEach>
            </select>
            <br>
            Список предметов: 
            <select name="subjectId">
                <c:forEach var="subject" items="${listSubjects}">
                    <option value="${subject.id}">${subject.subjectName} ${subject.subjectHours}</option>
                </c:forEach>
            </select>
            <br>
            Оценка: <input type="text" name="mark" value="${grade}"><br>
            <button type="submit">Выставить оценку</button>
        </form>
    </body>
</html>