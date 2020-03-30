<%--
    Document   : lidtReaders
    Created on : Feb 12, 2020, 2:48:50 PM
    Author     : user
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Список предметов</title>
    </head>
    <body>
        <h1>Список предметов:</h1>
        <c:forEach var="subject" items="${listSubjects}" varStatus="status">
        <li>${status.index+1}. ${subject.subjectName}. ${subject.subjectHours}.</li>
        </c:forEach>
    </body>
</html>
