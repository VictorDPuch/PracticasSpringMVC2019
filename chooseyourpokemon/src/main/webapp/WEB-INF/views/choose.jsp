<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><c:out value="${pokemon.id}" />!</h1>
        <h1>you choose <c:out value="${pokemon.nombre}" />!</h1>
        
                               <form:form method="post" modelAttribute="inicial" action="/" cssClass="form-horizontal">
                                   <form:input path="nombre" type="text" value="${pokemon.nombre}"></form:input>
                                <input type="submit" value="Guardar" class="btn btn-primary pull-right"/>
                            </form:form>
    </body>
</html>
