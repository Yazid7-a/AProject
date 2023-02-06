<%-- 
    Document   : listadoReview
    Created on : 01-feb-2023, 12:32:07
    Author     : Alumno Mañana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Listado Review</h1>
        <ul>
            <c:forEach items="${review}" var="review">
                <li>${review.idreview} ${review.contain} </li>
            </c:forEach>
        </ul>
    </body>
</html>
