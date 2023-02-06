<%-- 
    Document   : listadoAnimes
    Created on : 01-feb-2023, 12:18:50
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
        <h1>Listado de Animes</h1>
        <ul>
            <c:forEach items="${animes}" var="animes">
                <li>${animes.idanime} ${animes.name} </li>
            </c:forEach>
        </ul>
    </body>
</html>
