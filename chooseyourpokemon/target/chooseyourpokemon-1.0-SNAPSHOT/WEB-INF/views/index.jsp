<%-- 
    Document   : index
    Created on : 29/07/2019, 01:08:35 PM
    Author     : victorpuch
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

        <title>JSP Page</title>
    </head>
    <body>
                       <form:form method="post" modelAttribute="inicial" cssClass="form-horizontal">
                                <h4>Elige Joven Entrenador:</h4>
                                <h4>Actual:${inicial.eleccion}</h4>
                                <p>
                                    <form:errors path="*" element="div"  cssClass="alert alert-danger"/>   
                                    <form:select path="eleccion" cssClass="form-control">
                                        <form:option value="${inicial.eleccion}">**${inicial.eleccion}</form:option>
                                        <c:forEach var="poke" items="${datos}">    
                                            <form:option value="${poke.nombre}"><c:out value="${poke.nombre}"/></form:option>
                                        </c:forEach>    
                                    </form:select>
                                <input type="submit" value="Guardar" class="btn btn-primary pull-right"/>
                            </form:form>
    </body>
</html>
