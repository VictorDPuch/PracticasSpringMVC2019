<%-- 
    Document   : index
    Created on : 5/08/2019, 10:14:13 PM
    Author     : victorpuchacer
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <spring:url value="/resources/set.js" var="changesjs" />
        <script src="${changesjs}"></script>
          <link href="<c:url value="/resources/set.js" />" />
        <script>
            function setchanges(id){
     document.getElementById("changes"+id).value = 1;   

}
        </script>
    </head>
    <body>
        <form:form method="post" modelAttribute="datos" cssClass="form-horizontal">
            <table class="table table-bordered table-striped table-hover">
                <thead class="thead-dark">
                    <tr>
                        <th></th>
                        <th>Nombre</th>
                        <th>Cantidad</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${datos.articulos}" var="dato" varStatus="status">
                        <tr>
                            <td><input name="articulos[${status.index}].id" type="hidden" value="<c:out value="${dato.id}" />"></td>
                            <td><input name="articulos[${status.index}].nombre" type="text" value="<c:out 
                                           value="${dato.nombre}" />" id="nombre${dato.id}" onclick="setchanges('${dato.id}')"></td>
                            <td><input name="articulos[${status.index}].cantidad" type="text" value="<c:out 
                                           value="${dato.cantidad}" />" id="cantidad${dato.id}" onclick="setchanges('${dato.id}')"></td>
                            <td><input name="articulos[${status.index}].changes" type="hidden" value="<c:out value="${dato.changes}" />" id="changes${dato.id}"></td>
                        </tr>
                    </c:forEach>
            </table>
            <input type="submit" value="Save" />
        </form:form>
    </body>
</html>
