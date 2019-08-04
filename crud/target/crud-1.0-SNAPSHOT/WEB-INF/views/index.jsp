<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <title>LIST</title>
        <spring:url value="/resources/pdf1.js" var="pdfJs" />
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" />
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jspdf/1.5.3/jspdf.debug.js" integrity="sha384-NaWTHo/8YCBYJ59830LTz/P4aQZK1sS0SneOgAvhsIl3zBu8r9RevNg5lHCHAuQ/" crossorigin="anonymous"></script>
        <link rel='stylesheet' href='https://use.fontawesome.com/releases/v5.7.0/css/all.css' integrity='sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ' crossorigin='anonymous'>
        <script src="${pdfJs}"></script>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <h1>Ejemplo</h1>
                 </div>
                <p>
                    <a href="<c:url value="add.htm" />" class="btn btn-primary"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span>Agregar</a>
                </p>
                <table class="table table-bordered table-striped table-hover">
                    <thead class="thead-dark">
                        <tr>
                            <th>ID</th>
                            <th>Nombre</th>
                            <th>E-Mail</th>
                            <th>Teléfono</th>
                            <th>Acciones</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${datos}" var="dato">
                            <tr>
                                <td><c:out value="${dato.id}" /></td>
                                <td><c:out value="${dato.nombre}" /></td>
                                <td><c:out value="${dato.correo}" /></td>
                                <td><c:out value="${dato.telefono}" /></td>
                                <td>
                                    <a href="<c:url value="edit.htm?id=${dato.id}" />"><span class='fas'>&#xf573;</span></a>
                                    <a href="<c:url value="delete.htm?id=${dato.id}" />"><span class='fas'>&#xf00d;</span></a>
                                    <a onclick="testPDF1('3','${dato.nombre}','3','4','5','6','7','8','9','10','11');" ><span class='fas'style="color:red">&#xf1c1;</span></a>
                                </td>
                            </tr>
                        </c:forEach>
        
                            <select>
                                <c:forEach items="${datos}" var="dato">
                                <option value="<c:out value="${dato.id}" />"><c:out value="${dato.nombre}" /></option>
                                 </c:forEach>
                            </select>
                       
                    </tbody>
                </table>
        </div>
    </body>
</html>
