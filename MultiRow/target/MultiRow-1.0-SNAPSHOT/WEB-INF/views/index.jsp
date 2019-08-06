<%-- 
    Document   : index
    Created on : 5/08/2019, 10:14:13 PM
    Author     : victorpuchacer
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table class="table table-bordered table-striped table-hover">
            <thead class="thead-dark">
                <tr>
                    <th>ID</th>
                    <th>Nombre</th>
                    <th>Cantidad</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${datos}" var="dato">
                    <tr>
                        <td><c:out value="${dato.id}" /></td>
                        <td><input type="text" value="<c:out value="${dato.nombre}" />" id="nombre${dato.id}"></td>
                        <td><input type="text" value="<c:out value="${dato.cantidad}" />" id="cantidad${dato.id}"></td>
                    </tr>
                </c:forEach>
        </table>
    </body>
</html>
