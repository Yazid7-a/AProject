<%-- 
    Document   : listadoChapters
    Created on : 01-feb-2023, 12:21:47
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
        <h1>Listado Chapters</h1>
        <ul>
            <c:forEach items="${chapters}" var="chapters">
                <li>${animes.idchapters} ${chapters.title} </li>
            </c:forEach>
        </ul>
    </body>
</html>
