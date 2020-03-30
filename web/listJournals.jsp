<%-- 
    Document   : listJournals
    Created on : Mar 10, 2020, 12:13:36 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Журнал</h1>
        <c:forEach var="journal" items="${listJournals}">
            <li>${journal.person}. ${journal.subject}}. ${journal.grade}</li>
        </c:forEach>
    </body>
</html>
