<%-- 
    Document   : listadoUser
    Created on : 01-feb-2023, 12:23:08
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
        <h1>Listado User</h1>
        <ul>
            <c:forEach items="${user}" var="animes">
                <li>${user.iduser} ${user.email} </li>
            </c:forEach>
        </ul>
    </body>
</html>
