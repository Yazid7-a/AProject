<%-- 
    Document   : listadoMylist.jsp
    Created on : 06-feb-2023, 11:11:59
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
        <h1>Listado de Listas Favoritas!</h1>
        <ul>
            <c:forEach items="${mylist}" var="review">
                <li>${mylist.idmylist} ${mylist.iduser} </li>
            </c:forEach>
        </ul>
    </body>
</html>
